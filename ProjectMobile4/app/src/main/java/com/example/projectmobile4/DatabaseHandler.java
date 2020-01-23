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
    public String getRoute(String Tabel, Integer id) {
        SqliteHandeler thedb = new SqliteHandeler(context);
        SQLiteDatabase database = thedb.getWritableDatabase();
        Cursor c = database.rawQuery("SELECT route FROM '"+Tabel+"' WHERE id = '"+id+"'", null);
        c.moveToPosition(0);
        return c.getString(c.getColumnIndex(thedb.COL4));
    }
    public String getNamen(String Tabel, Integer id) {
        SqliteHandeler thedb = new SqliteHandeler(context);
        SQLiteDatabase database = thedb.getWritableDatabase();
        Cursor c = database.rawQuery("SELECT naam FROM '"+Tabel+"' WHERE id = '"+id+"'", null);
        c.moveToPosition(0);
        return c.getString(c.getColumnIndex(thedb.COL3));
    }
}

