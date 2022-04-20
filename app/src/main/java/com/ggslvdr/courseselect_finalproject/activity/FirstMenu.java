package com.ggslvdr.courseselect_finalproject.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import com.ggslvdr.courseselect_finalproject.R;
import com.ggslvdr.courseselect_finalproject.model.Courses;

import java.util.ArrayList;
import java.util.List;

public class FirstMenu extends AppCompatActivity {

    private ImageButton profilebtn;
    private Button programbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_menu);


        profilebtn = findViewById(R.id.EditProfile);

        programbtn = findViewById(R.id.currentProgrambtn);

        programbtn.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), CoursesActivity.class);
            startActivity(intent);
        });

        profilebtn.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), ProfileActivity.class);
            startActivity(intent);
        });

    }





}