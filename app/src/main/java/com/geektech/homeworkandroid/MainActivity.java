package com.geektech.homeworkandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editlogin = findViewById(R.id.et_login);
        final EditText editpass = findViewById(R.id.et_pass);
        final TextView textView = findViewById(R.id.tv_result);
        findViewById(R.id.btn_enter).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editlogin == null && editpass == null){
                    textView.setText("Вы ввели не правильные данные");
                }else {
                    textView.setText("Успешно");
                }
            }
        });
    }
}