package com.example.joshua.androidweek5;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface UserDoa {
    @Query("SELECT * FROM user")
    List<User> loadAll();
    @Query("SELECT * FROM user WHERE userId IN (:userIds)")
    List<User> loadAllByUserId(int... userIds);
    @Insert
    void insertAll(User... users);
    @Delete
    void delete(User user);
}
