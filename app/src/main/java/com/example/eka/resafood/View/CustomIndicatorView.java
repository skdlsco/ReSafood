package com.example.eka.resafood.View;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.eka.resafood.R;

/**
 * Created by eka on 2017. 5. 7..
 */

public class CustomIndicatorView extends LinearLayout {
    private Context context;
    private int margin =5;
    private int select_dot = R.drawable.indicator_dot;
    private int deselect_dot =R.drawable.indicator_dot;
    private ImageView[] dots;
    public CustomIndicatorView(Context context) {
        super(context);
        this.context=context;
    }

    public CustomIndicatorView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
    }
    public void CreatIndicator(int count, int indicator_size){
        int i;
        dots= new ImageView[count];
        LayoutParams params = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.MATCH_PARENT);
        params.gravity = Gravity.CENTER;
        params.height =indicator_size;
        params.width = indicator_size;
        params.setMargins(margin,margin,margin,margin);
        for(i=0;i<dots.length;i++){
            dots[i] = new ImageView(context);
            dots[i].setImageResource(deselect_dot);
            dots[i].setLayoutParams(params);
            dots[i].setAlpha(0.5f);
            this.addView(dots[i]);
        }
        Select(0);
    }
    public void Select(int position){
        int i;
        for(i=0;i<dots.length;i++){
            if(i==position){
                dots[i].setImageResource(select_dot);
                dots[i].setAlpha(1f);
            }else{
                dots[i].setImageResource(deselect_dot);
                dots[i].setAlpha(0.5f);
            }
        }
    }
}
