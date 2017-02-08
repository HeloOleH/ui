package com.helooleh.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

import com.helooleh.ui.drawer.*;
import com.helooleh.ui.pager.pager1.ViewPagerActivity_1;
import com.helooleh.ui.pager.pager2.ViewPagerActivity_2;

public class MainActivity extends Activity {
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
	
	public void onClick(View v) {
		switch (v.getId()) {
			case R.id.mainButton1: startActivity(new Intent(this, ViewPagerActivity_1.class)); break;
			case R.id.mainButton2: startActivity(new Intent(this, ViewPagerActivity_2.class)); break;
			case R.id.mainButton3: startActivity(new Intent(this, NavigationDrawerActivity_1.class)); break;
			case R.id.mainButton4: startActivity(new Intent(this, NavigationDrawerActivity_2.class)); break;
			case R.id.mainButton5: startActivity(new Intent(this, NavigationDrawerActivity_3.class)); break;
			case R.id.mainButton6: startActivity(new Intent(this, NavigationDrawerActivity_4.class)); break;
			case R.id.mainButton7: startActivity(new Intent(this, NavigationDrawerActivity_5.class)); break;
			case R.id.mainButton8: startActivity(new Intent(this, NavigationDrawerActivity_6.class)); break;
			default: break;
		}
	}
}

