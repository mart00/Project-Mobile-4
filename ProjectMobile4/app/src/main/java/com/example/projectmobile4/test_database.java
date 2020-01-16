package com.example.projectmobile4;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import java.util.List;

public class test_database extends AppCompatActivity {
    DatabaseHandler thedb;
    Button ButtonAdd;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_database);
        thedb = new DatabaseHandler(this);

        TextView voorbeeld = (TextView) findViewById(R.id.textvoorbeeld);
        ButtonAdd = (Button) findViewById(R.id.ButtonAdd);
        ButtonAdd.setOnClickListener(new OnClickListenerAddData());
        readRecords();
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        ViewPagerAdapterOefen viewPagerAdapterOefen = new ViewPagerAdapterOefen(this);
//        ImageAdapter adapter = new ImageAdapter(this);
        viewPager.setAdapter(viewPagerAdapterOefen);

//        String name = thedb.getRoute(1);
//        voorbeeld.setText(name);
        final String[] routes = {
                thedb.getRoute(1),
                thedb.getRoute(2),
                thedb.getRoute(3),
                thedb.getRoute(4),
                thedb.getRoute(5),
                thedb.getRoute(6),
                thedb.getRoute(7),
                thedb.getRoute(8),
                thedb.getRoute(9),
                thedb.getRoute(10),
                thedb.getRoute(11),
                thedb.getRoute(12),
                thedb.getRoute(13),
                thedb.getRoute(14),
                thedb.getRoute(15)
        };
        int arraySize = routes.length;
        for(int i = 0; i < arraySize; i++) {
            voorbeeld.append(routes[i]);
        }
    }
    public void readRecords(){

        LinearLayout linearLayoutRecords = (LinearLayout) findViewById(R.id.linearLayoutRecords);
        linearLayoutRecords.removeAllViews();

        List<ObjectCategorie> categorieen = new TableControllerCategorieen(this).read();

        if (categorieen.size() > 0){

            for (ObjectCategorie obj : categorieen){

                int id = obj.id;
                String insertedCategorie = obj.categorie;
                String insertedNaam = obj.naam;
                String insertedRoute = obj.route;
                String insertedRouteMuziek = obj.routeMuziek;

                String textViewContents = insertedCategorie + " - " + insertedNaam + " - " + insertedRoute + " - " + insertedRouteMuziek;

                TextView textViewStudentItem = new TextView(this);
                textViewStudentItem.setPadding(10,10,0,10);
                textViewStudentItem.setText(textViewContents);
                textViewStudentItem.setTag(Integer.toString(id));
                textViewStudentItem.setOnLongClickListener(new OnLongClickListenerAddData());

                linearLayoutRecords.addView(textViewStudentItem);
            }
        }
        else {

            TextView locationItem = new TextView(this);
            locationItem.setPadding(8,8,8,8);
            locationItem.setText("NO");

            linearLayoutRecords.addView(locationItem);
        }
    }
}
