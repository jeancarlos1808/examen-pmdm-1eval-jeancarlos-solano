package com.examenjeancarlos1808.examenpmdm.login;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.examenjeancarlos1808.examenpmdm.R;
import com.examenjeancarlos1808.examenpmdm.mainactivity.MainActivity;
import com.google.android.material.textfield.TextInputEditText;

public class Login<LoginActivity> extends AppCompatActivity {

    private TextInputEditText usernameInput, passwordInput;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameInput = findViewById(R.id.username_input);
        passwordInput = findViewById(R.id.password_input);

        findViewById(R.id.login_button).setOnClickListener(v -> {
            String username = usernameInput.getText().toString().trim();
            String password = passwordInput.getText().toString().trim();

            if (username.isEmpty()) {
                usernameInput.setError("El nombre no puede estar vacío");
                return;
            }

            if (password.equals(getString(R.string.examenpmdm))) {
                SharedPreferences prefs = getSharedPreferences("UserPrefs", MODE_PRIVATE);
                prefs.edit().putString("username", username).apply();

                Intent intent = new Intent(Login.this, MainActivity.class);
                startActivity(intent);
                finish();
            } else {
                passwordInput.setError("Contraseña incorrecta");
            }
        });
    }
}
