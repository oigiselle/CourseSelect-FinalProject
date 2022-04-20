package com.ggslvdr.courseselect_finalproject.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ggslvdr.courseselect_finalproject.R;
import com.ggslvdr.courseselect_finalproject.adapter.Adapter;

public class CoursesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);
        RecyclerView recyclerView = findViewById(R.id.coursesRecyclerView);

        Adapter adapter = new Adapter();

        recyclerView.setAdapter(adapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));






    }



}