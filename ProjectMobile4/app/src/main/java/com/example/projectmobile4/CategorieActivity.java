package com.example.projectmobile4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.splashscreen.R;

public class CategorieActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_categorie);
        String sessieVersie = getIntent().getStringExtra("Versie");
        if(sessieVersie.equals("oefen") || sessieVersie.equals("speel")){
            //doe iets
            TextView displayTextView = (TextView) findViewById(R.id.versie);

            displayTextView.setText(sessieVersie);
        }else{
            Intent goToMainActivity = new Intent(this, MainActivity.class);
            startActivity(goToMainActivity);
            finish();
        }
    }


}

