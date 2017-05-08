package com.example.eka.resafood.Activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.eka.resafood.R;

public class MainActivity extends AppCompatActivity {
    private Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button go_register = (Button) findViewById(R.id.main_go_register);
        go_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,TermsActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
