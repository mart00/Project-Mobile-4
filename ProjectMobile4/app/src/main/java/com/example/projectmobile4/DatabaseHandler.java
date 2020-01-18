package com.example.projectmobile4;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.widget.Toast;

public class DatabaseHandler  {

    private Context context;
    private SQLiteDatabase database;
    private SqliteHandeler dbHandler;

    public DatabaseHandler(Context c){
        this.context = c;

    }

    public DatabaseHandler open() throws SQLException{
        this.dbHandler = new SqliteHandeler(this.context);
        this.database = this.dbHandler.getWritableDatabase();
        return this;
    }
    public void close(){
        this.dbHandler.close();
    }
    public String fetchCatDieren01() {

        SqliteHandeler thedb = new SqliteHandeler(context);
        SQLiteDatabase database = thedb.getWritableDatabase();
        Cursor c = database.rawQuery("SELECT categorie FROM dieren01 ", null);
        c.moveToPosition(0);
        String str = c.getString(c.getColumnIndex("categorie"));
        return str;
    }
    public String fetchCatDieren02() {

        SqliteHandeler thedb = new SqliteHandeler(context);
        SQLiteDatabase database = thedb.getWritableDatabase();
        Cursor c = database.rawQuery("SELECT categorie FROM dieren02 ", null);
        c.moveToPosition(0);
        String str = c.getString(c.getColumnIndex("categorie"));
        return str;
    }
    public String fetchCatEten() {

        SqliteHandeler thedb = new SqliteHandeler(context);
        SQLiteDatabase database = thedb.getWritableDatabase();
        Cursor c = database.rawQuery("SELECT categorie FROM eten ", null);
        String str = c.getString(c.getColumnIndex("categorie"));
        return str;
    }
//    public String getCategorie(long id){
//        String getCategorie = "not found";
//        String whereclause = "ID=?";
//        String[] whereargs = new String[]{String.valueOf(id)};
//        Cursor cursor = database.query(,null,whereclause,whereargs,null,null,null);
//        if (cursor.moveToFirst()) {
//            getCategorie = cursor.getString(cursor.getColumnIndex(COL4));
//        }
//        cursor.close();
//        db.close();
//        return getCategorie;
//    }
//    public String getRoute(long id) {
//
//        String getroute = "not found";
//        SQLiteDatabase db = this.getWritableDatabase();
//        String whereclause = "ID=?";
//        String[] whereargs = new String[]{String.valueOf(id)};
//        Cursor cursor = db.query(TABLE_NAME,null,whereclause,whereargs,null,null,null);
//        if (cursor.moveToFirst()) {
//            getroute = cursor.getString(cursor.getColumnIndex(COL4));
//        }
//        cursor.close();
//        db.close();
//        return getroute;
//    }
//    public String getName(long id) {
//
//        String itemNaam = "not found";
//        SQLiteDatabase db = this.getWritableDatabase();
//        String whereclause = "ID=?";
//        String[] whereargs = new String[]{String.valueOf(id)};
//        Cursor cursor = db.query(TABLE_NAME,null,whereclause,whereargs,null,null,null);
//        if (cursor.moveToFirst()) {
//            itemNaam = cursor.getString(cursor.getColumnIndex(COL3));
//        }
//        cursor.close();
//        db.close();
//        return itemNaam;
//    }
}

