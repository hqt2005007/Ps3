package com.example.appql;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;


public class begin extends AppCompatActivity {
    private ImageView img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin);
        ImageView img = (ImageView) findViewById(R.id.hello);
        img.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(begin.this,MainActivity.class);
                startActivity(intent);
                MediaPlayer song = MediaPlayer.create(begin.this,R.raw.loichao);
                song.start();
            }
        });
    }
}