package com.example.splashscreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


public class MainActivity extends Activity {
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            this.setContentView(R.layout.activity_main);
        }
        public void Oefen(){
            Intent goToOefenActivity = new Intent(this, CatergorieActivity.class);
            goToOefenActivity.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
            String Versie = "oefen";
            goToOefenActivity.putExtra("Versie", Versie);
            startActivity(goToOefenActivity);
        }
        public void Speel(){
            Intent goToSpeelActivity = new Intent(this, CatergorieActivity.class);
            goToSpeelActivity.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
            String Versie = "speel";
            goToSpeelActivity.putExtra("Versie", Versie);
            startActivity(goToSpeelActivity);

        }
    }
