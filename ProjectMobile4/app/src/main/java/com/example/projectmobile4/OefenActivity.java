package com.example.projectmobile4;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class OefenActivity extends AppCompatActivity {
    private MediaPlayer mp = new MediaPlayer();
    DatabaseHandler thedb;
    CharSequence[] Categorie;
    ViewPager viewPager;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        Context context = this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oefen);

        viewPager = findViewById(R.id.viewpager);
        ViewPagerAdapterOefen viewPagerAdapterOefen = new ViewPagerAdapterOefen(this);
        viewPager.setAdapter(viewPagerAdapterOefen);

        DatabaseHandler thedb = new DatabaseHandler(this);
        String c = thedb.fetchCatDieren01();
        Toast.makeText(context, c, Toast.LENGTH_LONG).show();

//        Categorie = getIntent().getIntExtra("Categorie", 0);

    }

}
