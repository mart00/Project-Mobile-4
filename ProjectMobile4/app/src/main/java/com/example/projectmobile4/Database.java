package com.example.projectmobile4;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class Database {

    private Context context;
    private SQLiteDatabase database;
    private Sqlite dbHandler;

    public Database(Context c){
        this.context = c;

    }

    public Database open() throws SQLException{
        this.dbHandler = new Sqlite(this.context);
        this.database = this.dbHandler.getWritableDatabase();
        return this;
    }
    public void close(){
        this.dbHandler.close();
    }

    public String getRoute(String Tabel, Integer id) {
        Sqlite thedb = new Sqlite(context);
        SQLiteDatabase database = thedb.getWritableDatabase();
        Cursor c = database.rawQuery("SELECT route FROM '"+Tabel+"' WHERE ID = '"+id+"'", null);
        c.moveToFirst();
        return c.getString(c.getColumnIndex(Sqlite.COL4));
    }
    public String getNamen(String Tabel, Integer id) {
        Sqlite thedb = new Sqlite(context);
        SQLiteDatabase database = thedb.getWritableDatabase();
        Cursor c = database.rawQuery("SELECT naam FROM '"+Tabel+"' WHERE ID = '"+id+"'", null);
        c.moveToPosition(0);
        return c.getString(c.getColumnIndex(Sqlite.COL3));
    }
    public Integer getAllNamen(String Tabel) {
        Sqlite thedb = new Sqlite(context);
        SQLiteDatabase database = thedb.getWritableDatabase();
        Cursor c = database.rawQuery("SELECT naam FROM '"+Tabel+"'", null);
        return c.getCount();
    }
    public String getMp3(String Tabel, Integer id) {
        Sqlite thedb = new Sqlite(context);
        SQLiteDatabase database = thedb.getWritableDatabase();
        Cursor c = database.rawQuery("SELECT routeMuziek FROM '"+Tabel+"' WHERE ID = '"+id+"'", null);
        c.moveToPosition(0);
        return c.getString(c.getColumnIndex(Sqlite.COL5));
    }
    public String getAmazigh(String Tabel, Integer id) {
        Sqlite thedb = new Sqlite(context);
        SQLiteDatabase database = thedb.getWritableDatabase();
        Cursor c = database.rawQuery("SELECT amazigh FROM '"+Tabel+"' WHERE id = '"+id+"'", null);
        c.moveToPosition(0);
        return c.getString(c.getColumnIndex(thedb.COL6));
    }

}

