package com.helooleh.ui.drawer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.helooleh.ui.R;

public class NavigationDrawerActivity_1 extends AppCompatActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.navigation_drawer_activity_1_2_3);

		// UI References
		ListView mDrawerListView = (ListView) findViewById(R.id.drawerListView);

		// Initialize the ListView
		String[] websites = getResources().getStringArray(R.array.websites);
		ArrayAdapter<String> websitesAdapter = new ArrayAdapter<>(this,
				android.R.layout.simple_list_item_1, websites);
		mDrawerListView.setAdapter(websitesAdapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();

		//noinspection SimplifiableIfStatement
		if (id == R.id.action_settings) {
			return true;
		}

		return super.onOptionsItemSelected(item);
	}
}
