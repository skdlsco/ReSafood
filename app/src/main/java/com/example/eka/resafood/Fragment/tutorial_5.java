package com.example.eka.resafood.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.eka.resafood.Activity.TutorialActivity;
import com.example.eka.resafood.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class tutorial_5 extends Fragment {
    public tutorial_5() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tutorial_5,container,false);
        Button btn  = (Button) view.findViewById(R.id.bnt_tutorial);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().onBackPressed();
            }
        });
        return view;
    }

}
