package com.example.appql;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private Bundle savedInstanceState;
    private LinearLayout ll;
    private ImageView slt;
    private TextView textView;
    private Timer timer;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.savedInstanceState = savedInstanceState;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = findViewById(R.id.tapmenu);
        viewPager = findViewById(R.id.viewpager);
        tabLayout.setupWithViewPager(viewPager);
        Face face = new Face(getSupportFragmentManager(),FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        face.addFragment(new mon_chinh(),"Món Chính");
        face.addFragment(new mon_phu(),"Món Phụ");
        face.addFragment(new do_uong(),"ĐỒ UỐNG");
        face.addFragment(new combo(),"COMBO");
        viewPager.setAdapter(face);

        slt = (ImageView) findViewById(R.id.imageView24);
        slt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SeletedActivity.class);

                startActivity(intent);
            }
        });
        ll = (LinearLayout) findViewById(R.id.bottomPayment);
        ll.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,payment.class);
                startActivity(intent);

            }
        });
        ll = (LinearLayout) findViewById(R.id.bottomProfile);
        ll.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,profile.class);
                startActivity(intent);

            }
        });
        timer =new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent =new Intent(MainActivity.this,begin.class);
                startActivity(intent);
                finish();
            }
        },360000);
        ImageView lg = (ImageView) findViewById(R.id.lg);
        lg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, begin.class);
                startActivity(intent);
            }
        });




    }
}