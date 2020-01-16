package com.example.projectmobile4;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class OnLongClickListenerAddData implements View.OnLongClickListener {

    Context context;
    String id;
    @Override

    public boolean onLongClick(View view){

        context = view.getContext();
        id = view.getTag().toString();

        final CharSequence[] items = {"Edit", "Delete"};

        new AlertDialog.Builder(context).setTitle("student record")
                .setItems(items, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int item) {

                        if (item == 0){
                            editRecord(Integer.parseInt(id));
                        }
                        else if ( item == 1 ){

                            boolean deleteSuccessful = new TableControllerCategorieen(context).delete(Integer.parseInt(id));

                            if (deleteSuccessful){
                                Toast.makeText(context, "ja", Toast.LENGTH_SHORT).show();
                            } else {
                                Toast.makeText(context, "nee", Toast.LENGTH_SHORT).show();
                            }

                            ((test_database) context).readRecords();

                        }

                        dialog.dismiss();
                    }
                }).show();

        return false;
    }
    public void editRecord(final int dataId){

        final TableControllerCategorieen tableControllerCategorie = new TableControllerCategorieen(context);
        ObjectCategorie objectCategorie = tableControllerCategorie.readSingleRecord(dataId);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View formElementsView = inflater.inflate(R.layout.input_form, null, false);

        final EditText editTextCategorie = (EditText) formElementsView.findViewById(R.id.editTextCategorie);
        final EditText editTextNaam = (EditText) formElementsView.findViewById(R.id.editTextNaam);
        final EditText editTextRoute = (EditText) formElementsView.findViewById(R.id.editTextRoute);
        final EditText editTextRouteMuziek = (EditText) formElementsView.findViewById(R.id.editTextRouteMuziek);

        editTextCategorie.setText(objectCategorie.categorie);
        editTextNaam.setText(objectCategorie.naam);
        editTextRoute.setText(objectCategorie.route);
        editTextRouteMuziek.setText(objectCategorie.routeMuziek);

        new AlertDialog.Builder(context)
                .setView(formElementsView)
                .setTitle("Edit")
                .setPositiveButton("Save Changes",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {

                                ObjectCategorie objectCategorie = new ObjectCategorie();
                                objectCategorie.id = dataId;
                                objectCategorie.categorie = editTextCategorie.getText().toString();
                                objectCategorie.naam = editTextNaam.getText().toString();
                                objectCategorie.route = editTextRoute.getText().toString();
                                objectCategorie.routeMuziek = editTextRouteMuziek.getText().toString();

                                boolean updateSuccessful = tableControllerCategorie.update(objectCategorie);

                                dialog.cancel();

                                if (updateSuccessful){
                                    Toast.makeText(context, "ja", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(context, "nee", Toast.LENGTH_SHORT).show();
                                }

                                ((test_database) context).readRecords();

                            }
                        }).show();
    }
}
