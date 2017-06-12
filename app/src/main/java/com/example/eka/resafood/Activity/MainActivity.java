package com.example.eka.resafood.Activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.databinding.DataBindingUtil;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.eka.resafood.Adapter.MainPagerAdapter;
import com.example.eka.resafood.R;
import com.example.eka.resafood.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private Context context = this;
    private SharedPreferences pref;
    private SharedPreferences.Editor edit_pref;

    @Override
    protected void onStart() {
        super.onStart();
//        //첫 실행 여부 확인
//        pref = getSharedPreferences("started",MODE_PRIVATE);
//        edit_pref = pref.edit();
//        edit_pref.putBoolean("started",false);
//        edit_pref.apply();
//        Log.e("Asdf", String.valueOf(pref.getBoolean("started",false)));
//        if(!pref.getBoolean("started",false)){
//            startActivity(new Intent(context,FirstScreenActivity.class));
//            edit_pref.putBoolean("started",true);
//            edit_pref.apply();
//            Log.e("Asdf", String.valueOf(pref.getBoolean("started",false)));
//            finish();
//        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.mainTabLayout);
        ViewPager viewPager = (ViewPager) findViewById(R.id.main_viewpager);

        tabLayout.addTab(tabLayout.newTab().setText("검색하기"));
        tabLayout.addTab(tabLayout.newTab().setText("안전한 음식"));
        tabLayout.addTab(tabLayout.newTab().setText("그룹 메모"));
        tabLayout.addTab(tabLayout.newTab().setText("음식 백과"));
        tabLayout.addTab(tabLayout.newTab().setText("내 정보"));

        tabLayout.setupWithViewPager(viewPager);
        MainPagerAdapter pagerAdapter = new MainPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);
        viewPager.setCurrentItem(1, false);
    }
}
