package com.example.projectmobile4;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SqliteScore extends SQLiteOpenHelper{

    private static final int DATABASE_VERSION = 5;
    protected static final String DATABASE_NAME = "scores";
    static final String COL1 = "ID";
    static final String COL2 = "categorie";
    static final String COL3 = "score";
    static final String COL4 = "successen";
    private static SQLiteDatabase instance;

    public SqliteScore(Context context){
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
                "categorie TEXT, " + " score INT, " + " successen INT) ");
        db.execSQL("INSERT INTO categorieen (categorie, score, successen) VALUES ('dieren01', 0, 0)");
        db.execSQL("INSERT INTO categorieen (categorie, score, successen) VALUES ('dieren02', 0, 0)");
        db.execSQL("INSERT INTO categorieen (categorie, score, successen) VALUES ('eten', 0, 0)");
        db.execSQL("INSERT INTO categorieen (categorie, score, successen) VALUES ('fruit', 0, 0)");
        db.execSQL("INSERT INTO categorieen (categorie, score, successen) VALUES ('groente', 0, 0)");
        db.execSQL("INSERT INTO categorieen (categorie, score, successen) VALUES ('kleding', 0, 0)");
        db.execSQL("INSERT INTO categorieen (categorie, score, successen) VALUES ('kleuren', 0, 0)");
        db.execSQL("INSERT INTO categorieen (categorie, score, successen) VALUES ('insecten', 0, 0)");
        db.execSQL("INSERT INTO categorieen (categorie, score, successen) VALUES ('weer', 0, 0)");


    }

    public void update(SQLiteDatabase db, int newScore, String currentCategorie){
        ContentValues cv = new ContentValues();
        cv.put("score",newScore);
        db.update("categorieen", cv,"categorie ="+currentCategorie, null);
    }
}
