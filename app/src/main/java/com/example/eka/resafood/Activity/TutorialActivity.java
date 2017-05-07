package com.example.eka.resafood.Activity;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.eka.resafood.Adapter.TutorialPagerAdapter;
import com.example.eka.resafood.R;
import com.example.eka.resafood.View.CustomIndicatorView;

public class TutorialActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private CustomIndicatorView indicatorView;
    private TutorialPagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);

        viewPager = (ViewPager) findViewById(R.id.tutorialpager);
        pagerAdapter = new TutorialPagerAdapter(getSupportFragmentManager());

        indicatorView = (CustomIndicatorView) findViewById(R.id.customindicator);
        indicatorView.CreatIndicator(5,10);
        viewPager.setAdapter(pagerAdapter);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                indicatorView.Select(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}
