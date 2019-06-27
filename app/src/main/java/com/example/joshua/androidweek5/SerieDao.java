package com.example.joshua.androidweek5;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface SerieDao {
    @Query("SELECT * FROM Serie")
    List<User> loadAll();
    @Query("SELECT * FROM Serie WHERE id IN (:id)")
    List<User> loadAllById(int... id);
    @Insert
    void insertAll(Serie... series);
    @Delete
    void delete(Serie serie);
}
