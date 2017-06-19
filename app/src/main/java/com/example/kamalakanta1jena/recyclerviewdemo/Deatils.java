package com.example.kamalakanta1jena.recyclerviewdemo;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

public class Deatils extends AppCompatActivity {
    private TextView tvname,tvcountry,tvheight,tvdesc;
    private ImageView ivimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deatils);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tvname = (TextView) findViewById(R.id.tvname);
        tvcountry = (TextView) findViewById(R.id.tvcountry);
        tvheight = (TextView) findViewById(R.id.tvheight);
        tvdesc = (TextView) findViewById(R.id.tvDesc);

        ivimage = (ImageView) findViewById(R.id.ivimage);

        Intent intent = getIntent();


    }
}
