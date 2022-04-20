package com.ggslvdr.courseselect_finalproject.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.ImageButton;

import com.ggslvdr.courseselect_finalproject.R;
import com.ggslvdr.courseselect_finalproject.activity.FirstMenu;

public class MainActivity extends AppCompatActivity {

    private ImageButton loginbtn, contactusbtn;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginbtn = findViewById(R.id.loginbtn);
        contactusbtn = findViewById(R.id.contactbtn);

        loginbtn.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), FirstMenu.class);
            startActivity(intent);
        });
    }


}