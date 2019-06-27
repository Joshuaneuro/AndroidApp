package com.example.joshua.androidweek5;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {User.class,Serie.class},version=3)
public abstract class DatabaseApp extends RoomDatabase {
    public abstract UserDoa userDao();
    public abstract SerieDao serieDao();
}