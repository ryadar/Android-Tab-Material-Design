package com.example.ryadar.tablayoutmaterialdesign;

import android.os.Bundle;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentManager;

import android.support.v4.app.Fragment;

import android.view.LayoutInflater;
import android.view.ViewGroup;

public class FragmentPageAdapter extends FragmentPagerAdapter  {


    public FragmentPageAdapter(FragmentManager fm) {
        super(fm);
    }

    // This determines the fragment for each tab
    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        if (position == 0) {
            return new FragmentOne();
        } else if (position == 1){
            return new  FragmentTwo();
        } else {
            return new FragmentThree();
        }
    }

    // This determines the number of tabs
    @Override
    public int getCount() {
        return 3;
    }

    // This determines the title for each tab
    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        switch (position) {
            case 0:
                return "ONE";
            case 1:
                return "TWO";
            case 2:
                return "Three";
            default:
                return null;
        }
    }


}
