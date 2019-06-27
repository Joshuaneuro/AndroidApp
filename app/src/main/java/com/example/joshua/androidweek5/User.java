package com.example.joshua.androidweek5;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class User {
    @PrimaryKey
    private int userId;
    private String name;
    private String passwd;

}
