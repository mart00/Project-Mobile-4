package com.example.projectmobile4;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SqliteHandlerScore extends SQLiteOpenHelper{

    private static final int DATABASE_VERSION = 3;
    protected static final String DATABASE_NAME = "scores";
     static final String COL1 = "ID";
     static final String COL2 = "categorie";
     static final String COL3 = "score";
    private static SQLiteDatabase instance;

    public SqliteHandlerScore(Context context){
        super(context, DATABASE_NAME, null,  DATABASE_VERSION);
    }

    @Override

    public void onCreate(SQLiteDatabase db){

        insert(db);

    }
    @Override

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS categorieen");
        onCreate(db);
    }


    public void insert(SQLiteDatabase db) {


        //categorien aanmaken
        db.execSQL("CREATE TABLE IF NOT EXISTS categorieen" + "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "categorie TEXT, " + " score INT ) ");
        db.execSQL("INSERT INTO categorieen (categorie, score) VALUES ('dieren01', 0)");
        db.execSQL("INSERT INTO categorieen (categorie, score) VALUES ('dieren02', 1)");
        db.execSQL("INSERT INTO categorieen (categorie, score) VALUES ('eten', 2)");
        db.execSQL("INSERT INTO categorieen (categorie, score) VALUES ('fruit', 3)");
        db.execSQL("INSERT INTO categorieen (categorie, score) VALUES ('groente', 4)");
        db.execSQL("INSERT INTO categorieen (categorie, score) VALUES ('kleding', 5)");
        db.execSQL("INSERT INTO categorieen (categorie, score) VALUES ('kleuren', 6)");
        db.execSQL("INSERT INTO categorieen (categorie, score) VALUES ('insecten', 7)");
        db.execSQL("INSERT INTO categorieen (categorie, score) VALUES ('weer', 8)");


    }

    public void update(SQLiteDatabase db, int newScore, String currentCategorie){
        ContentValues cv = new ContentValues();
        cv.put("score",newScore);
        db.update("categorieen", cv,"categorie ="+currentCategorie, null);
    }
}
