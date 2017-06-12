package com.example.eka.resafood.Activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.eka.resafood.R;

public class FirstScreenActivity extends AppCompatActivity {
    private Button start,login;
    private Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);

        start = (Button) findViewById(R.id.first_screen_startbtn);
        login = (Button) findViewById(R.id.first_screen_loginbtn);

        login.setPaintFlags(login.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG |Paint.FAKE_BOLD_TEXT_FLAG);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,TermsActivity.class);
                startActivity(intent);
                finish();
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }
}