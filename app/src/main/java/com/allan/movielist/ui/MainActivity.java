package com.allan.movielist.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.allan.movielist.R;

public class MainActivity extends AppCompatActivity {

    private EditText username, password;
    private String user, pass;
    private Button login;
    private SharedPreferences sp;
    private SharedPreferences.Editor edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login_button);
        sp = getSharedPreferences("pref", 0);
        edit = sp.edit();
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user = username.getText().toString();
                pass = password.getText().toString();
                if (user.isEmpty()) {
                    username.setError("Required");
                    username.requestFocus();
                } else if (pass.isEmpty()) {
                    password.setError("Required");
                    username.requestFocus();
                } else {
                    if (user.equals("admin") && pass.equals("admin")) {
                        Intent intent = new Intent(MainActivity.this, ContentActivity.class);
                        edit.putBoolean("isLoggedIn", true);
                        edit.apply();
                        startActivity(intent);
                        finish();
                    } else {
                        Toast.makeText(MainActivity.this, "Username:admin, Password:admin", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}
