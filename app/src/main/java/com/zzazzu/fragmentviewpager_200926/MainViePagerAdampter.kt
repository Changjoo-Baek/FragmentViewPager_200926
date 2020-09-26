package com.zzazzu.fragmentviewpager_200926

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.zzazzu.fragmentviewpager_200926.FragmentMyAddress
import com.zzazzu.fragmentviewpager_200926.FragmentMyAge
import com.zzazzu.fragmentviewpager_200926.FragmentMyName

class MainViePagerAdampter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {

        return when(position) {
            0 -> "이름"
            1 -> "나이"
            else -> "거주지"

        }

    }


    override fun getItem(position: Int): Fragment {

        return when(position) {
            0 -> { FragmentMyName() }
            1 -> { FragmentMyAge() }
            else -> { FragmentMyAddress() }

        }

    }

    override fun getCount(): Int {
        return 3
    }
}