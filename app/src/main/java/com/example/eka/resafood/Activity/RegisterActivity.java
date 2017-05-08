package com.example.eka.resafood.Activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.eka.resafood.R;

public class RegisterActivity extends AppCompatActivity {
    private Button btn_cancel, btn_register;
    private ImageView btn_back;
    private EditText name,password,check_password,email;
    private Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //초기화
        btn_cancel = (Button) findViewById(R.id.register_cancel);
        btn_register = (Button) findViewById(R.id.register_signup);
        btn_back = (ImageView) findViewById(R.id.register_back);

        name = (EditText) findViewById(R.id.register_name);
        password= (EditText) findViewById(R.id.register_password);
        check_password = (EditText) findViewById(R.id.register_check_password);
        email = (EditText) findViewById(R.id.register_email);

        //뒤로가기
        btn_back.setOnClickListener(clicked_back);
        btn_cancel.setOnClickListener(clicked_back);

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pd= password.getText().toString();
                String cpd= check_password.getText().toString();
                int a;
                boolean text=false,number=false;
                for(a=0;a<pd.length();a++){
                    if ( (pd.charAt(a) > 'a' && pd.charAt(a) < 'z' )|| (pd.charAt(a)>'A'&& pd.charAt(a) <'Z'))
                        text=true;
                    if ( pd.charAt(a)>'0'&& pd.charAt(a)<'9')
                        number=true;
                }
                if(email.getText().toString().equals("")){
                    Toast.makeText(RegisterActivity.this, "이메일을 입력해주세요.", Toast.LENGTH_SHORT).show();
                }
                else if (!pd.equals(cpd)) {
                    Toast.makeText(RegisterActivity.this, "같은 비밀번호로 입력하세요.", Toast.LENGTH_SHORT).show();
                }else if(pd.length()<8){
                    Toast.makeText(RegisterActivity.this, "비밀번호 길이가 너무 짧습니다.", Toast.LENGTH_SHORT).show();
                }else if(!text||!number){
                    Toast.makeText(RegisterActivity.this, "문자와 숫자를 혼용하십시요.", Toast.LENGTH_SHORT).show();
                }else if(name.getText().toString().equals("")){
                    Toast.makeText(RegisterActivity.this, "이름을 입력해주세요.", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(context,TutorialActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
    // 뒤로가기버튼 리스너 정의
    private View.OnClickListener clicked_back = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();
        }
    };
}
