package com.helooleh.ui.pager.pager2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class ViewPagerAdapter extends FragmentPagerAdapter {

    ViewPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

	@Override
	public CharSequence getPageTitle(int position) {
		switch (position){
			case 0:
				return "Title 1";
			case 1:
				return "Title 2";
			case 2:
				return "Title 3";
			case 3:
				return "Title 4";
			default:
				return "Section " + (position);
		}
	}
	
    @Override
    public Fragment getItem(int position) {
		Fragment fragment = new Fragment();
		switch (position){
			case 0:
				fragment = ViewPagerItemFragment.newInstance(position);
				break;
			case 1:
				fragment = ViewPagerItemFragment.newInstance(position);
				break;
			case 2:
				fragment = ViewPagerItemFragment.newInstance(position);
				break;
			case 3:
				fragment = ViewPagerItemFragment.newInstance(position);
				break;
		}
		return fragment;
        //return new ViewPagerItemFragment();
    }

    @Override
    public int getCount() {
        return 4;
    }
}
