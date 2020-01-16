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

        Button Oefen=(Button)findViewById(R.id.Oefen);
        Button Speel=(Button)findViewById(R.id.Speel);
        Button Over=(Button)findViewById(R.id.Over);
        Button Score=(Button)findViewById(R.id.Score);
        Button AddData=(Button)findViewById(R.id.AddData);

        Oefen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int1= new Intent(MainActivity.this, CategorieActivity.class);
                String Versie = "oefen";
                int1.putExtra("Versie", Versie);
                startActivity(int1);
            }
        });
        Speel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int1= new Intent(MainActivity.this, CategorieActivity.class);
                String Versie = "speel";
                int1.putExtra("Versie", Versie);
                startActivity(int1);
            }
        });
        Over.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int1= new Intent(MainActivity.this, OverActivity.class);
                startActivity(int1);
            }
        });
        Score.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int1= new Intent(MainActivity.this, ScoreActivity.class);
                startActivity(int1);
            }
        });
        AddData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int1= new Intent(MainActivity.this, test_database.class);
                startActivity(int1);
            }
        });
    }
    public void Oefen(){
        Intent goToOefenActivity = new Intent(this, CategorieActivity.class);
        goToOefenActivity.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        String Versie = "oefen";
        goToOefenActivity.putExtra("Versie", Versie);
        startActivity(goToOefenActivity);
    }
    public void Speel(){
        Intent goToSpeelActivity = new Intent(this, CategorieActivity.class);
        goToSpeelActivity.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        String Versie = "speel";
        goToSpeelActivity.putExtra("Versie", Versie);
        startActivity(goToSpeelActivity);

    }
}
