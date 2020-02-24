package com.example.actionbar;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ActionBar myactionbar=getSupportActionBar();
        myactionbar.setIcon(R.drawable.home);
        myactionbar.setTitle("  Welcome");
        myactionbar.setDisplayUseLogoEnabled(true);
        myactionbar.setDisplayShowHomeEnabled(true);
        myactionbar.setDisplayHomeAsUpEnabled(true);
    }
}
