package com.example.kamalakanta1jena.recyclerviewdemo;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import com.example.kamalakanta1jena.recyclerviewdemo.POJO.Actor;
import com.example.kamalakanta1jena.recyclerviewdemo.Utils.RoundedImageView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Transformation;

import java.util.ArrayList;
import java.util.List;

import static android.R.attr.id;
import static com.example.kamalakanta1jena.recyclerviewdemo.R.id.imageView;

public class Deatils extends AppCompatActivity {
    private TextView tvname,tvcountry,tvheight,tvdesc;
    private ImageView ivimage;

    private List<Actor> actors;


    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    /*@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }*/

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
        Actor actors= (Actor) intent.getSerializableExtra("datalist");



        tvname.setText(actors.getName());
        tvcountry.setText(actors.getCountry());
        tvheight.setText(actors.getHeight());
        tvdesc.setText(actors.getDescription());

        Picasso.with(this).load(actors.getImage()).into(ivimage);
    }
}
