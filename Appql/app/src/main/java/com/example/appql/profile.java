package com.example.appql;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class profile extends AppCompatActivity {
    private LinearLayout ll;
    private Button btn;
    private EditText Edt;
    private TextView txv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        ll =  (LinearLayout) findViewById(R.id.bottomMenu);
        ll.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent =new Intent(profile.this, MainActivity.class);
                startActivity(intent);
            }

        });
        ll =  (LinearLayout) findViewById(R.id.bottomSelected);
        ll.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent =new Intent(profile.this, profile.class);
                startActivity(intent);
            }

        });
        ll =  (LinearLayout) findViewById(R.id.bottomPayment);
        ll.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent =new Intent(profile.this, payment.class);
                startActivity(intent);
            }

        });
        btn = (Button) findViewById(R.id.buttonLogin);
        btn.setOnClickListener(new View.OnClickListener() {
            private EditText username = (EditText) findViewById(R.id.User);
            private EditText password = (EditText) findViewById(R.id.Password);
            @SuppressLint("ResourceAsColor")
            public void onClick(View v) {
                Intent intent = new Intent(profile.this, Admin.class);
                if (username.getText().toString().equals("Admin")&& password.getText().toString().equals("admin")){
                    Toast.makeText(profile.this, "LOGIN SUCCESSFULL !", Toast.LENGTH_SHORT).show();
                    startActivity(intent);}

                else {
                    txv = (TextView)findViewById(R.id.loginField);
                    txv.setText("Login Failed !");

                }

            }
        });

    }
}