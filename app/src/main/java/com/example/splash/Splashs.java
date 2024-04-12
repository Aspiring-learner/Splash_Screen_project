package com.example.splash;

import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Splashs extends AppCompatActivity {
    ImageView ivLogo;
    TextView tvSlogan;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ivLogo=findViewById(R.id.ivlogo);
        tvSlogan=findViewById(R.id.tvSlogan);

        Animation logo_animation= AnimationUtils.loadAnimation(this,R.anim.logo_anim);
        Animation slogo_animation=AnimationUtils.loadAnimation(this,R.anim.slogan_anim);
        ivLogo.setAnimation(logo_animation);
        tvSlogan.setAnimation(slogo_animation);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Splashs.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        }, 2000);

    }
}
