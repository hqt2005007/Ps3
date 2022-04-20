package com.example.appql;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;


public class mon_chinh<a> extends Fragment {
    private ImageView imv;
    private EditText edt;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mon_chinh, container, false);
        imv = (ImageView) view.findViewById(R.id.cong1);
        imv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText edt = (EditText) view.findViewById(R.id.EditText1);
                edt.setText("1");

            }
        });
        return view;


    }
}