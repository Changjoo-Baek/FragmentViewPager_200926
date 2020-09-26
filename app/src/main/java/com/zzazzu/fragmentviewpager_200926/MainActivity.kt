package com.zzazzu.fragmentviewpager_200926

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    lateinit var mAdapter : MainViePagerAdampter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()

    }

    override fun setupEvents() {

    }

    override fun setValues() {

        mAdapter = MainViePagerAdampter(supportFragmentManager)
        mainViewPager.adapter = mAdapter

        myTabLayout.setupWithViewPager(mainViewPager)
    }
}