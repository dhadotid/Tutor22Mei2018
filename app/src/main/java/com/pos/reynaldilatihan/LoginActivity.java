package com.pos.reynaldilatihan;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.pos.reynaldilatihan.helper.Constant;

/**
 * Created Date: 22/05/2018
 * Author: dhadotid
 */
public class LoginActivity extends AppCompatActivity{
    EditText etEmail;
    EditText etPassword;
    Button btnLogin;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etEmail = findViewById(R.id.login_etEmail);
        etPassword = findViewById(R.id.login_etPassword);
        btnLogin = findViewById(R.id.login_btnLogin);
        onLogin();
    }
    public  void onLogin(){
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Constant.email = etEmail.getText().toString();
                Constant.password = etPassword.getText().toString();

                if(Constant.email.equals("admin@gmail.com") && (Constant.password.equals("admin"))){
                    startActivity(new Intent(LoginActivity.this, MainActivity.class));
                    finish();
                }else
                {
                    Toast.makeText( LoginActivity.this, "Email atau Password Salah", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
