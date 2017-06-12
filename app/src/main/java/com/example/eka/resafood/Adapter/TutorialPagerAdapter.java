package com.example.eka.resafood.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.eka.resafood.Fragment.tutorial.tutorial_1;
import com.example.eka.resafood.Fragment.tutorial.tutorial_2;
import com.example.eka.resafood.Fragment.tutorial.tutorial_3;
import com.example.eka.resafood.Fragment.tutorial.tutorial_4;
import com.example.eka.resafood.Fragment.tutorial.tutorial_5;

/**
 * Created by eka on 2017. 5. 7..
 */

public class TutorialPagerAdapter extends FragmentStatePagerAdapter {

    public TutorialPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch(position){
            case 0:
                fragment = new tutorial_1();
                break;
            case 1:
                fragment = new tutorial_2();
                break;
            case 2:
                fragment = new tutorial_3();
                break;
            case 3:
                fragment = new tutorial_4();
                break;
            case 4:
                fragment = new tutorial_5();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 5;
    }
}
