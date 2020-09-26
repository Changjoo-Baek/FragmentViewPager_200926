package com.zzazzu.fragmentviewpager_200926

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MainViePagerAdampter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {


        if (position == 0) {
            return FragmentMyName()

        }
        else if (position == 1) {
            return FragmentMyAge()
        }
        else {
            return FragmentMyAddress()

        }

    }

    override fun getCount(): Int {
        return 3
    }

}