package com.example.splash;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {

    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        tvResult = findViewById(R.id.tvResult);

        String text = getIntent().getStringExtra("key_id")+"\n"+
                getIntent().getStringExtra("key_name");
        tvResult.setText(text);

    }

}
