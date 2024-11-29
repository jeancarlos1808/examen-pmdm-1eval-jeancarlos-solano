package com.examenjeancarlos1808.examenpmdm.splashscreen;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import com.examenjeancarlos1808.examenpmdm.R;
import com.examenjeancarlos1808.examenpmdm.login.Login;

import java.time.Instant;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

@RequiresApi(api = Build.VERSION_CODES.O)
public class SplashScreenActivity extends AppCompatActivity implements TemporalAdjuster {

    private Instant Glide;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView splashImage = findViewById(R.id.splash_image);
        Glide.with(this);

        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashScreenActivity.this, Login.class);
            startActivity(intent);
            finish();
        }, 3000); // 3 segundos
    }

    @Override
    public Temporal adjustInto(Temporal temporal) {
        return null;
    }
}
