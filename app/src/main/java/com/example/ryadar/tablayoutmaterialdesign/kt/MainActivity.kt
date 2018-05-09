package com.example.ryadar.tablayoutmaterialdesign.kt
 import android.os.Bundle
import android.support.design.widget.TabLayout
 import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import com.example.ryadar.tablayoutmaterialdesign.R



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       var   viewPager : ViewPager= findViewById<ViewPager>(R.id.viewpager)

        var   tabLayout : TabLayout= findViewById<TabLayout>(R.id.tabs)

        var adapter:MyFragmentPageAdapter =MyFragmentPageAdapter(getSupportFragmentManager())
        viewPager.adapter= adapter

        tabLayout.setupWithViewPager(viewPager)

    }

}