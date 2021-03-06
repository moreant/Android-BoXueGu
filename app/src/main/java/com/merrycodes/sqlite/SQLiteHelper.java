package com.merrycodes.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

/**
 * @author MerryCodes
 * @date 2020/4/27 12:33
 */
public class SQLiteHelper extends SQLiteOpenHelper {

    public static final String USER_INFO = "userInfo";

    private static final String DB_NAME = "BoXueGu.db";

    private static final Integer DB_VERSION = 1;

    public SQLiteHelper(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS " + USER_INFO + " (_id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "username VARCHAR, nickname VARCHAR, sex VARCHAR ,signature VARCHAR)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + USER_INFO);
        onCreate(db);
    }
}
