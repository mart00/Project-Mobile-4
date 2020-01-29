package com.example.projectmobile4;

import android.content.ContentValues;
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
    String col;

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
        SQLiteDatabase database = thedb.getWritableDatabase();
        String sql = "SELECT "+ naam +" FROM "+ Tabel +" WHERE ID = "+id;
        Cursor c = database.rawQuery(sql,null );
        c.moveToPosition(0);

        if (naam.equals("amazigh")){
            col = thedb.getCol6();
        }
        else if (naam.equals("frans")){
            col = thedb.getCol7();
        }
        else if (naam.equals("duits")){
            col = thedb.getCol8();
        }
        else if (naam.equals("spaans")){
            col = thedb.getCol9();
        }
        else if (naam.equals("engels")){
            col = thedb.getCol10();
        }
        else {
            col = thedb.getCol3();
        }
        return c.getString(c.getColumnIndex(col));
    }
    public Integer getAllNamen(String Tabel) {
        Sqlite thedb = new Sqlite(context);
        SQLiteDatabase database = thedb.getWritableDatabase();
        Cursor c = database.rawQuery("SELECT nederlands FROM '"+Tabel+"'", null);
        return c.getCount();
    }
    public Integer getAllNamen2(String Tabel) {
        SqliteScore thedb = new SqliteScore(context);
        SQLiteDatabase database = thedb.getWritableDatabase();
        Cursor c = database.rawQuery("SELECT score FROM '"+Tabel+"'", null);
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
    public Integer getScore(int id) {
        SqliteScore thedb = new SqliteScore(context);
        SQLiteDatabase database = thedb.getWritableDatabase();
        Cursor c = database.rawQuery("SELECT score FROM categorieen WHERE id = '"+id+"'", null);
        c.moveToPosition(0);
        return c.getInt(c.getColumnIndex(thedb.COL3));
    }
    public boolean setScore(int id, int newScore){
        SqliteScore thedb = new SqliteScore(context);
        SQLiteDatabase database = thedb.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("score",newScore);
        database.update("categorieen",cv,"id = "+id,null);
        return true;
    }
    public String getSucces(String categorie) {
        SqliteScore thedb = new SqliteScore(context);
        SQLiteDatabase database = thedb.getWritableDatabase();
        Cursor c = database.rawQuery("SELECT successen FROM categorieen WHERE categorie = '"+categorie+"'", null);
        c.moveToPosition(0);
        return c.getString(c.getColumnIndex(thedb.COL4));
    }

    public boolean setSuccessen(String categorie, int id, int newScore){
        String doot = Integer.toString(id);
        SqliteScore thedb = new SqliteScore(context);
        SQLiteDatabase database = thedb.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("successen",newScore);
        database.update("categorieen",cv,"categorie = ? AND id = ?",new String[]{categorie});
        return true;
    }

}

