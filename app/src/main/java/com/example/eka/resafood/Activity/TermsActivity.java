package com.example.eka.resafood.Activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.eka.resafood.R;

public class TermsActivity extends AppCompatActivity {
    private Button cancel,agree;
    private Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms);

        cancel = (Button) findViewById(R.id.terms_cancel);
        agree = (Button) findViewById(R.id.terms_agree);

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        agree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,RegisterActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
