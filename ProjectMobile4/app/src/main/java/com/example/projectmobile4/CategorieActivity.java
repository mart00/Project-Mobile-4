package com.example.projectmobile4;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class CategorieActivity extends Activity {
    ViewPager viewPager;
    DatabaseHandler thedb;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_categorie);
        thedb = new DatabaseHandler(this);

        String sessieVersie = getIntent().getStringExtra("Versie");
        if(sessieVersie.equals("oefen") || sessieVersie.equals("speel")){
            //doe iets
            viewPager = findViewById(R.id.view_pager);
            ViewPagerAdapterCategorie viewPagerAdapterCategorie = new ViewPagerAdapterCategorie(this);
            viewPager.setAdapter(viewPagerAdapterCategorie);

            TextView displayTextView = findViewById(R.id.versie);

            displayTextView.setText(sessieVersie);

            Button buttonCategorie = findViewById(R.id.buttonCategorie);

            buttonCategorie.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(getIntent().getStringExtra("Versie").equals("oefen")) {
                        Intent int1 = new Intent(CategorieActivity.this, OefenActivity.class);
                        int1.putExtra("Categorie", Categorie);
                        startActivity(int1);
                    } else if (getIntent().getStringExtra("Versie").equals("speel")) {
                        //TODO: implementeer speel
                    }
                }
            });

        }else{
            Intent goToMainActivity = new Intent(this, MainActivity.class);
            startActivity(goToMainActivity);
            finish();
        }
    }
    String Categorie = "dieren01";

    public void Select(){
        if(getIntent().getStringExtra("Versie").equals("oefen")) {
            Intent int1 = new Intent(CategorieActivity.this, OefenActivity.class);
            int1.putExtra("Categorie", Categorie);
            startActivity(int1);
        } else if (getIntent().getStringExtra("Versie").equals("speel")) {
            //TODO: implementeer speel
        }
    }
}

