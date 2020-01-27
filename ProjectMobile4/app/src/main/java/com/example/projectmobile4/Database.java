package com.example.projectmobile4;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class Database {

    private Context context;
    private SQLiteDatabase database;
    private SQLiteDatabase database1;
    private Sqlite dbHandler;
    private SqliteScore dbHandler1;

    public Database(Context c){
        this.context = c;

    }

    public Database open() throws SQLException{
        this.dbHandler = new Sqlite(this.context);
        this.database = this.dbHandler.getWritableDatabase();
        this.dbHandler1 = new SqliteScore(this.context);
        this.database1 = this.dbHandler1.getWritableDatabase();
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
    public String getNamen(String naam, String Tabel, Integer id) {
        Sqlite thedb = new Sqlite(context);
        String en = "nederlands";
        SQLiteDatabase database = thedb.getWritableDatabase();
        String sql = "SELECT "+ naam +" FROM "+ Tabel +" WHERE ID = "+id;
        Cursor c = database.rawQuery(sql,null );
        c.moveToPosition(0);
        String col;
        if (naam == "amazigh"){
//            col = "COL6";
            col = Sqlite.COL6;
        }
        else if (naam == "frans"){
//            col = "COL7";
            col = Sqlite.COL7;
        }
        else if (naam == "duits"){
//            col = "COL8";
            col = Sqlite.COL8;
        }
        else if (naam == "spaans"){
//            col = "COL9";
            col = Sqlite.COL9;
        }
        else if (naam == "engels"){
//            col = "COL10";
            col = thedb.COL10;
        }
        else {
//            col = "COL3";
            col = thedb.getCol3();
        }
        return c.getString(c.getColumnIndex(col));
//        return c.getColumnName(1);
    }
    public Integer getAllNamen(String Tabel) {
        Sqlite thedb = new Sqlite(context);
        SQLiteDatabase database = thedb.getWritableDatabase();
        Cursor c = database.rawQuery("SELECT nederlands FROM '"+Tabel+"'", null);
        return c.getCount();
    }
    public String getMp3(String Tabel, Integer id) {
        Sqlite thedb = new Sqlite(context);
        SQLiteDatabase database = thedb.getWritableDatabase();
        Cursor c = database.rawQuery("SELECT routeMuziek FROM '"+Tabel+"' WHERE ID = '"+id+"'", null);
        c.moveToPosition(0);
        return c.getString(c.getColumnIndex(thedb.COL5));
    }
    public String getAmazigh(String Tabel, Integer id) {
        Sqlite thedb = new Sqlite(context);
        SQLiteDatabase database = thedb.getWritableDatabase();
        Cursor c = database.rawQuery("SELECT amazigh FROM '"+Tabel+"' WHERE id = '"+id+"'", null);
        c.moveToPosition(0);
        return c.getString(c.getColumnIndex(thedb.COL6));
    }
    public String getScore(String Tabel, Integer id) {
        SqliteScore thedb = new SqliteScore(context);
        SQLiteDatabase database = thedb.getWritableDatabase();
        Cursor c = database.rawQuery("SELECT score FROM '"+Tabel+"' WHERE id = '"+id+"'", null);
        c.moveToPosition(0);
        return c.getString(c.getColumnIndex(thedb.COL3));
    }
}

