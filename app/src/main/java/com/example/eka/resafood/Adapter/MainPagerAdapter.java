package com.example.eka.resafood.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;

import com.example.eka.resafood.Fragment.Main.MainSafeFoodListFragment;

/**
 * Created by eka on 2017. 6. 12..
 */

public class MainPagerAdapter extends FragmentPagerAdapter {
    private String[] pageTitle = {"검색하기","안전한 음식","그룹 메모","음식 백과","내 정보"};
    public MainPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 1:
                return new MainSafeFoodListFragment();
            default:
                return new MainSafeFoodListFragment();

        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return pageTitle[position];
    }

    @Override
    public int getCount() {
        return 5;
    }
}
