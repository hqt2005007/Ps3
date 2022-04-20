package com.example.appql;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class SeletedActivity extends AppCompatActivity {
    private LinearLayout ll;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleted);
        ll =  (LinearLayout) findViewById(R.id.bottomMenu);
        ll.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent =new Intent(SeletedActivity.this, MainActivity.class);
                startActivity(intent);
            }

        });
        ll =  (LinearLayout) findViewById(R.id.bottomProfile);
        ll.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent =new Intent(SeletedActivity.this, profile.class);
                startActivity(intent);
            }

        });
        ll =  (LinearLayout) findViewById(R.id.bottomPayment);
        ll.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent =new Intent(SeletedActivity.this, payment.class);
                startActivity(intent);
            }

        });
        button = (Button) findViewById(R.id.buttonBack);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SeletedActivity.this,MainActivity.class);
                startActivity(intent);

            }
        });

    }

}