package com.example.projectmobile4;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHandler extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 3;
    protected static final  String DATABASE_NAME = "categorieenDatabase";
    protected static final  String TABLE_NAME = "categorieen";
    private static final String COL1 = "ID";
    private static final String COL2 = "categorie";
    private static final String COL3 = "naam";
    private static final String COL4 = "route";
    private static final String COL5 = "routeMuziek";
    public DatabaseHandler(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override

    public void onCreate(SQLiteDatabase db){

        String sql = "CREATE TABLE categorieen" + "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "categorie TEXT, " + " naam TEXT, " + " route TEXT, " + " routeMuziek TEXT ) ";
        db.execSQL(sql);

    }
    @Override

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

        String sql = "DROP TABLE IF EXISTS categorieen";
        db.execSQL(sql);

        onCreate(db);
    }
    public String getRoute(long id) {

        String getroute = "not found";
        SQLiteDatabase db = this.getWritableDatabase();
        String whereclause = "ID=?";
        String[] whereargs = new String[]{String.valueOf(id)};
        Cursor cursor = db.query(TABLE_NAME,null,whereclause,whereargs,null,null,null);
        if (cursor.moveToFirst()) {
            getroute = cursor.getString(cursor.getColumnIndex(COL4));
        }
        cursor.close();
        db.close();
        return getroute;
    }
    public String getName(long id) {

        String itemNaam = "not found";
        SQLiteDatabase db = this.getWritableDatabase();
        String whereclause = "ID=?";
        String[] whereargs = new String[]{String.valueOf(id)};
        Cursor cursor = db.query(TABLE_NAME,null,whereclause,whereargs,null,null,null);
        if (cursor.moveToFirst()) {
            itemNaam = cursor.getString(cursor.getColumnIndex(COL3));
        }
        cursor.close();
        db.close();
        return itemNaam;
    }
}

