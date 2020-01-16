package com.example.projectmobile4;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class TableControllerCategorieen extends DatabaseHandler{

    public TableControllerCategorieen(Context context){

        super(context);
    }
    public boolean create(ObjectCategorie ObjectCategorie){

        ContentValues values = new ContentValues();
        values.put("categorie", ObjectCategorie.categorie);
        values.put("naam", ObjectCategorie.naam);
        values.put("route", ObjectCategorie.route);
        values.put("routeMuziek", ObjectCategorie.routeMuziek);

        SQLiteDatabase db = this.getWritableDatabase();

        boolean createSuccesful = db.insert("categorieen", null, values) > 0;
        db.close();

        return createSuccesful;

    }
    public List<ObjectCategorie> read(){

        List<ObjectCategorie> recordsList = new ArrayList<ObjectCategorie>();

        String sql = "SELECT * FROM categorieen ORDER BY id DESC";

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(sql,null);

        if (cursor.moveToFirst()){
            do{
                int id = Integer.parseInt(cursor.getString(cursor.getColumnIndex("id")));
                String insertedCategorie = cursor.getString(cursor.getColumnIndex("categorie"));
                String insertedNaam= cursor.getString(cursor.getColumnIndex("naam"));
                String insertedRoute = cursor.getString(cursor.getColumnIndex("route"));
                String insertedRouteMuziek = cursor.getString(cursor.getColumnIndex("routeMuziek"));

                ObjectCategorie objectCategorie = new ObjectCategorie();
                objectCategorie.id = id;
                objectCategorie.categorie = insertedCategorie;
                objectCategorie.naam = insertedNaam;
                objectCategorie.route = insertedRoute;
                objectCategorie.routeMuziek = insertedRouteMuziek;

                recordsList.add(objectCategorie);
            } while (cursor.moveToNext());
        }

        cursor.close();
        db.close();

        return recordsList;
    }
    public ObjectCategorie readSingleRecord(int dataId){

        ObjectCategorie objectCategorie = null;

        String sql = "SELECT * FROM categorieen WHERE id = " + dataId;

        SQLiteDatabase db = this.getWritableDatabase();

        Cursor cursor = db.rawQuery(sql, null);

        if (cursor.moveToFirst()){

            int id = Integer.parseInt(cursor.getString(cursor.getColumnIndex("id")));
            String Categorie = cursor.getString(cursor.getColumnIndex("categorie"));
            String Naam = cursor.getString(cursor.getColumnIndex("naam"));
            String Route = cursor.getString(cursor.getColumnIndex("route"));
            String RouteMuziek = cursor.getString(cursor.getColumnIndex("routeMuziek"));

            objectCategorie = new ObjectCategorie();
            objectCategorie.id = id;
            objectCategorie.categorie = Categorie;
            objectCategorie.naam = Naam;
            objectCategorie.route = Route;
            objectCategorie.routeMuziek = RouteMuziek;

        }

        cursor.close();
        db.close();

        return objectCategorie;
    }
    public boolean update(ObjectCategorie objectCategorie){

        ContentValues values = new ContentValues();

        values.put("categorie", objectCategorie.categorie);
        values.put("naam", objectCategorie.naam);
        values.put("route", objectCategorie.route);
        values.put("routeMuziek", objectCategorie.routeMuziek);

        String where = "id = ?";

        String[] whereArgs = {Integer.toString(objectCategorie.id)};

        SQLiteDatabase db = this.getWritableDatabase();

        boolean updateSuccesful = db.update("categorieen", values, where, whereArgs) > 0;
        db.close();

        return updateSuccesful;
    }

    public boolean delete(int id){

        boolean deleteSuccessful = false;

        SQLiteDatabase db = this.getWritableDatabase();
        deleteSuccessful = db.delete("categorieen", "id ='" + id + "'", null) > 0;
        db.close();

        return deleteSuccessful;
    }
}

