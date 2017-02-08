package com.helooleh.ui.pager.pager2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.helooleh.ui.R;
import java.util.Random;
import android.graphics.Color;

public class ViewPagerItemFragment extends Fragment {

	static ViewPagerItemFragment newInstance(int page) {
		return new ViewPagerItemFragment();
	}
	
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
								 
		View view = inflater.inflate(R.layout.include_content, null);
		Random rnd = new Random();
		int color = Color.argb(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
		view.findViewById(R.id.contentLayout).setBackgroundColor(color);
		
		return view;
    }
}
