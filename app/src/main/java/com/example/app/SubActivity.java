package com.example.app;

import android.content.Intent;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class SubActivity extends AppCompatActivity {

    private TextView tv_sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        tv_sub = findViewById(R.id.tv_sub);

        Intent intent = getIntent(); // 보내온 Intent를 얻는다
        String str = intent.getStringExtra("str"); // str이라는 이름으로 넘어온 값을 받는다

        tv_sub.setText(str); // TextView에 받아온 값을 출력한다
    }
}