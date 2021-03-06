package com.example.cl.coolweather.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

/**
 * Created by cl on 2015/9/1.
 */
public class CoolWeatherOpenHelper extends SQLiteOpenHelper {
    /**
     * Province表 建表语句
     */

    public static final String CREATE_PROVINCE = "create table Province("
            + "id integer primary key autoincrement,"
            + "province_name text,"
            + "province_code text)";

    /**
     * City表 建表语句
     */
    public static final String CREATE_CITY = "create table City("
            + "id integer primary key autoincrement,"
            + "city_name text,"
            + "city_code text,"
            + "province_id integer)";

    /**
     * County表 建表语句
     */
    public static final String CREATE_COUNTY = "create table County("
            + "id integer primary key autoincrement,"
            + "county_name text,"
            + "county_code text,"
            + "city_id integer)";

    private Context mContext;

    public CoolWeatherOpenHelper(Context context, String name,
                                 SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
        mContext = context;
        Toast.makeText(context, "Open SQL succeed", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Toast.makeText(mContext, "Open onCreate succeed", Toast.LENGTH_SHORT).show();
        db.execSQL(CREATE_PROVINCE);//创建Province表
        db.execSQL(CREATE_CITY);//创建City表
        db.execSQL(CREATE_COUNTY);//创建County表
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
