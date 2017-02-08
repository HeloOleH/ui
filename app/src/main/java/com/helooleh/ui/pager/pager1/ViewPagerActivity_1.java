package com.helooleh.ui.pager.pager1;

import android.os.Bundle;
import com.helooleh.ui.R;
import android.support.v4.view.ViewPager;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

public class ViewPagerActivity_1 extends AppCompatActivity {

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_pager_activity_1);

        // UI References
        ViewPager mViewPager = (ViewPager) findViewById(R.id.viewPager);

        // Set adapter
        FragmentManager fragmentManager = getSupportFragmentManager();
        ViewPagerAdapter adapter = new ViewPagerAdapter(fragmentManager);
        mViewPager.setAdapter(adapter);
    }
}
