package com.example.projectmobile4;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class OnClickListenerAddData implements View.OnClickListener{

    Context context2;
    @Override
    public void onClick(View view) {
        context2 = view.getContext();
        final Context context = view.getRootView().getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View formElementsView = inflater.inflate(R.layout.input_form, null, false);
        final EditText editTextCategorie = (EditText) formElementsView.findViewById(R.id.editTextCategorie);
        final EditText editTextNaam = (EditText) formElementsView.findViewById(R.id.editTextNaam);
        final EditText editTextRoute = (EditText) formElementsView.findViewById(R.id.editTextRoute);
        final EditText editTextRouteMuziek = (EditText) formElementsView.findViewById(R.id.editTextRouteMuziek);
        new AlertDialog.Builder(context)
                .setView(formElementsView)
                .setTitle("Add Item")
                .setPositiveButton("Add",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                String Categorie = editTextCategorie.getText().toString();
                                String Naam = editTextNaam.getText().toString();
                                String Route = editTextRoute.getText().toString();
                                String RouteMuziek = editTextRouteMuziek.getText().toString();

                                ObjectCategorie objectCategorie = new ObjectCategorie();
                                objectCategorie.categorie = Categorie;
                                objectCategorie.naam = Naam;
                                objectCategorie.route = Route;
                                objectCategorie.routeMuziek = RouteMuziek;
                                dialog.cancel();

                                boolean createSuccesful = new TableControllerCategorieen(context).create(objectCategorie);
                                if (createSuccesful){
                                    Toast.makeText(context, "ja", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(context, "nee", Toast.LENGTH_SHORT).show();
                                }

                                ((test_database) context2).readRecords();
                            }
                        }).show();
    }
}
