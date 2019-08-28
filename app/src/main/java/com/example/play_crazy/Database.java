package com.example.play_crazy;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class Database extends SQLiteOpenHelper {
    public static final String database_name="ball.db";
    Context context;
    public Database(Context context) {
        super(context, database_name, null, 1);
        this.context=context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table tblscore (over integer primary key,one integer,two integer,three integer,four integer,five integer,six integer,extras integer) ");
        Toast.makeText(context, "Table creation", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists tblscore");
        onCreate(db);
    }
    public boolean insertdata(String name_pass,String phone_pass) {
        SQLiteDatabase db = this.getWritableDatabase();
        return false;

    }
    public int current_over()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res=db.rawQuery("SELECT COUNT(*) FROM TBLSCORE",null);
        res.moveToNext();
        return  Integer.valueOf(res.getString(0));
    }

}
