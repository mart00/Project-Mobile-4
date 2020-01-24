package com.example.projectmobile4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.TextView;

import androidx.viewpager.widget.ViewPager;

public class Categorie extends Activity {
    ViewPager viewPager;
    Database thedb;
    int listViewPosition;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_categorie);
        thedb = new Database(this);
        AdapterCategorie adapterCategorie = new AdapterCategorie(this);
        final String[] categorie = adapterCategorie.categorieNaam;
        listViewPosition = getIntent().getIntExtra("listViewPosition", 0);
        String sessieVersie = getIntent().getStringExtra("Versie");
        if(sessieVersie.equals("oefen") || sessieVersie.equals("speel")){
            //doe iets
            viewPager = findViewById(R.id.view_pager);
            viewPager.setAdapter(adapterCategorie);
            final int position = viewPager.getCurrentItem();
            TextView displayTextView = findViewById(R.id.versie);

            displayTextView.setText(sessieVersie);

            Button buttonCategorie = findViewById(R.id.buttonCategorie);

            buttonCategorie.setOnClickListener(new AdapterView.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if(getIntent().getStringExtra("Versie").equals("oefen")) {
                        Intent int1 = new Intent(Categorie.this, Oefen.class);
                        Integer pos = viewPager.getCurrentItem();
                        int1.putExtra("position", pos);
                        startActivity(int1);
                    } else if (getIntent().getStringExtra("Versie").equals("speel")) {
                        Intent int1 = new Intent(Categorie.this, Speel.class);
                        Integer pos = viewPager.getCurrentItem();
                        int1.putExtra("position", pos);
                        startActivity(int1);
                    }
                }
            });

        }else{
            Intent goToMainActivity = new Intent(this, MainActivity.class);
            startActivity(goToMainActivity);
            finish();
        }
    }

    public void Select(){
        AdapterCategorie adapterCategorie = new AdapterCategorie(this);
        final String[] Categorie = adapterCategorie.categorieNaam;
        if(getIntent().getStringExtra("Versie").equals("oefen")) {
            Intent int1 = new Intent(com.example.projectmobile4.Categorie.this, Oefen.class);
            int1.putExtra("Categorie", Categorie);
            startActivity(int1);
        } else if (getIntent().getStringExtra("Versie").equals("speel")) {
            Intent int1 = new Intent(Categorie.this, Speel.class);
            int1.putExtra("Categorie", Categorie);
            startActivity(int1);
        }
    }
}

