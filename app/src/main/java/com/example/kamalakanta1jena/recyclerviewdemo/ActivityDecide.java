package com.example.kamalakanta1jena.recyclerviewdemo;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ActivityDecide extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decide);
        sharedPreferences = getSharedPreferences("MyPref", Context.MODE_PRIVATE);
        boolean  firstTime = sharedPreferences.getBoolean("first", false);
        if(!firstTime){
            editor = sharedPreferences.edit();
            editor.putBoolean("first",true);
            editor.commit();

            Intent intent = new Intent(this,ViewPagerReplacement.class);
            startActivity(intent);
        }
        else {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
        finish();
    }
}
