package com.example.mariu.recipe_organizer.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Mariu on 1/7/2018.
 */

public class DBHelper extends SQLiteOpenHelper {
    public static final String DB_FILE_NAME = "recipe.db";
    public static final int DB_VERSION = 1;

    public DBHelper(Context context) {
        super(context, DB_FILE_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(itemsTable.SQL_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(itemsTable.SQL_DELETE);
        onCreate(sqLiteDatabase);
    }
}
