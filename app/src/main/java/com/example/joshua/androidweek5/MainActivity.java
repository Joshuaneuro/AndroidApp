package com.example.joshua.androidweek5;

import android.app.FragmentTransaction;
import android.arch.persistence.room.Room;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createDatabase();
    }
    public void createDatabase() {
        DatabaseApp db = Room
                .databaseBuilder(getApplicationContext(), DatabaseApp.class, "database-name")
                .allowMainThreadQueries() // SHOULD NOT BE USED IN PRODUCTION !!!
                .fallbackToDestructiveMigration()
                .build();
    }
    public void DataUpdate() {

    }
}
