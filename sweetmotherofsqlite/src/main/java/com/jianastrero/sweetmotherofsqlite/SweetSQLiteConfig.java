package com.jianastrero.sweetmotherofsqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Jian Astrero on 1/28/2017.
 */
public class SweetSQLiteConfig {
    private static String dbName;
    protected static SQLiteDatabase dbWritable, dbReadable;
    protected static DBHelper dbHelper;

    public static void init(Context context, String dbName) {
        SweetSQLiteConfig.dbName=dbName;
        dbHelper=new DBHelper(context);
        dbWritable=dbHelper.getWritableDatabase();
        dbReadable=dbHelper.getReadableDatabase();
    }

    private static class DBHelper extends SQLiteOpenHelper {
        // If you change the database schema, you must increment the database version.
        public static final int DATABASE_VERSION = 1;
        public static final String DATABASE_NAME = SweetSQLiteConfig.dbName+".db";

        public DBHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            onCreate(db);
        }

        @Override
        public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            onUpgrade(db, oldVersion, newVersion);
        }
    }
}
