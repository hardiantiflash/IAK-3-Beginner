package com.example.ole.belajarandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    //ada 2 edittext, edtUsername dan edtPassword
    //ada 1 buah button btnLogin

    private EditText edtUsername;
    private EditText edtPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //casting object
        edtUsername = (EditText) findViewById(R.id.edt_username);
        edtPassword = (EditText) findViewById(R.id.edt_password);
        btnLogin = (Button) findViewById(R.id.btn_Login);

        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_Login:
                String username = edtUsername.getText().toString();
                String password = edtPassword.getText().toString();
                if (!username.isEmpty() && !password.isEmpty()) {
                    if (username.equals("abc")) {
                        if (password.equals("123")) {
                            //berhasil !!!
                            Intent intentMain = new Intent(LoginActivity.this, MainActivity.class);
                            startActivity(intentMain);
                            finish();

                        } else {
                            Toast.makeText(LoginActivity.this,
                                    "password anda salah..", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(LoginActivity.this,
                                "username anda salah.", Toast.LENGTH_SHORT).show();
                    }
                }

                break;
        }
    }

}
