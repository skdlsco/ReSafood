package com.example.eka.resafood.Fragment.Main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import com.example.eka.resafood.Adapter.MainExpandableListAdapter;
import com.example.eka.resafood.Data.FoodListChild;
import com.example.eka.resafood.Data.FoodListGroup;
import com.example.eka.resafood.R;

import java.util.ArrayList;

/**
 * Created by eka on 2017. 6. 12..
 */

public class MainSafeFoodListFragment extends Fragment {

    ArrayList<ArrayList<FoodListChild>> child = new ArrayList<>();
    ArrayList<FoodListGroup> groups = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup view = (ViewGroup) inflater.inflate(R.layout.main_safetyfoods, null);
        ExpandableListView listView = (ExpandableListView) view.findViewById(R.id.mainExpandableListView);

        groups.add(new FoodListGroup("고기"));
        groups.add(new FoodListGroup("고기"));
        child.add(new ArrayList<FoodListChild>());
        child.add(new ArrayList<FoodListChild>());
        child.get(0).add(new FoodListChild("냉동 떡 만두"));
        child.get(0).add(new FoodListChild("돈까스"));

        MainExpandableListAdapter adapter = new MainExpandableListAdapter(child, groups, getContext());
        listView.setAdapter(adapter);

        return view;
    }
}
