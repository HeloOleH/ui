package com.helooleh.ui.drawer;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.helooleh.ui.R;

public class NavigationDrawerActivity_5 extends AppCompatActivity
        implements AdapterView.OnItemClickListener {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mDrawerToggle;
    private ListView mDrawerListView;
    private TextView mShareDrawerTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_drawer_activity_5);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        mDrawerListView = (ListView) findViewById(R.id.drawerListView);
        mShareDrawerTextView = (TextView) findViewById(R.id.shareDrawerTextView);

        setSupportActionBar(toolbar);

        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar,
                R.string.drawer_open, R.string.drawer_closed);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeButtonEnabled(true);

        String[] websites = getResources().getStringArray(R.array.websites);
        ArrayAdapter<String> websitesAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, websites);
        mDrawerListView.setAdapter(websitesAdapter);
        mDrawerListView.setOnItemClickListener(this);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        mDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mDrawerToggle.onConfigurationChanged(newConfig);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        boolean actionHandled = false;

        if (mDrawerToggle.onOptionsItemSelected(item)) {
            actionHandled = true;
        } else if (id == R.id.action_share) {
            mDrawerLayout.openDrawer(mShareDrawerTextView);
            actionHandled = true;
        }

        return actionHandled || super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Adapter adapter = parent.getAdapter();
        String website = adapter.getItem(position).toString();
        Toast.makeText(this, website, Toast.LENGTH_SHORT).show();

        if (mDrawerLayout.isDrawerOpen(mDrawerListView)) {
            mDrawerLayout.closeDrawer(mDrawerListView);
        }
    }

    @Override
    public void onBackPressed() {
        boolean openDrawers = mDrawerLayout.isDrawerOpen(mDrawerListView) ||
                mDrawerLayout.isDrawerOpen(mShareDrawerTextView);

        if (openDrawers) {
            mDrawerLayout.closeDrawers();
        } else {
            super.onBackPressed();
        }
    }
}
