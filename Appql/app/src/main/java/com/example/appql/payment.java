package com.example.appql;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class payment extends AppCompatActivity {
    private LinearLayout ll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        ll =  (LinearLayout) findViewById(R.id.bottomMenu);
        ll.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent =new Intent(payment.this, MainActivity.class);
                startActivity(intent);
            }

        });
        ll =  (LinearLayout) findViewById(R.id.bottomProfile);
        ll.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent =new Intent(payment.this, profile.class);
                startActivity(intent);
            }

        });
        ll =  (LinearLayout) findViewById(R.id.bottomSelected);
        ll.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent =new Intent(payment.this, SeletedActivity.class);
                startActivity(intent);
            }

        });
    }
}