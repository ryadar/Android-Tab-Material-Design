package com.example.ryadar.tablayoutmaterialdesign.kt

 import android.os.Bundle
 import android.support.v4.app.Fragment
 import android.view.LayoutInflater
 import android.view.View
 import android.view.ViewGroup
 import com.example.ryadar.tablayoutmaterialdesign.R

class FragmentTwo :Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?{
        return inflater.inflate(R.layout.page_two, container, false)
}
}