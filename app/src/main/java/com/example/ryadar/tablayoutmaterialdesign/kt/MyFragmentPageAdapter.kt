package com.example.ryadar.tablayoutmaterialdesign.kt

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.app.FragmentManager;

class MyFragmentPageAdapter(val fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        if (position == 0) {
            return FragmentOne()
        } else if (position == 1) {
            return FragmentTwo();
        } else {
            return FragmentThree();
        }
    }
    override fun getCount(): Int = 3

}