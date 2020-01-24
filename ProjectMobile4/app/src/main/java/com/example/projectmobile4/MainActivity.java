package com.example.projectmobile4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);

        Button Oefen= findViewById(R.id.Oefen);
        Button Speel= findViewById(R.id.Speel);
        Button Over= findViewById(R.id.Over);
        Button Score= findViewById(R.id.Score);

        Oefen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int1= new Intent(MainActivity.this, Categorie.class);
                String Versie = "oefen";
                int1.putExtra("Versie", Versie);
                startActivity(int1);
            }
        });
        Speel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int1= new Intent(MainActivity.this, Categorie.class);
                String Versie = "speel";
                int1.putExtra("Versie", Versie);
                startActivity(int1);
            }
        });
        Over.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int1= new Intent(MainActivity.this, com.example.projectmobile4.Over.class);
                startActivity(int1);
            }
        });
        Score.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int1= new Intent(MainActivity.this, com.example.projectmobile4.Score.class);
                startActivity(int1);
            }
        });
    }
    public void Oefen(){
        Intent goToOefenActivity = new Intent(this, Categorie.class);
        goToOefenActivity.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        String Versie = "oefen";
        goToOefenActivity.putExtra("Versie", Versie);
        startActivity(goToOefenActivity);
    }
    public void Speel(){
        Intent goToSpeelActivity = new Intent(this, Categorie.class);
        goToSpeelActivity.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        String Versie = "speel";
        goToSpeelActivity.putExtra("Versie", Versie);
        startActivity(goToSpeelActivity);

    }
}
