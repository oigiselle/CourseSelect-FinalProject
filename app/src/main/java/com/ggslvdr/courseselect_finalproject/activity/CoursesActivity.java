package com.ggslvdr.courseselect_finalproject.activity;

import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ggslvdr.courseselect_finalproject.R;
import com.ggslvdr.courseselect_finalproject.adapter.Adapter;
import com.ggslvdr.courseselect_finalproject.model.Courses;

import java.util.ArrayList;
import java.util.List;

public class CoursesActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Courses> listCourses = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);
        recyclerView = findViewById(R.id.coursesRecyclerView);
        this.createCourses();

        Adapter adapter = new Adapter(listCourses);

        recyclerView.setAdapter(adapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration( new DividerItemDecoration(this, LinearLayout.VERTICAL));



    }

    public void createCourses(){
        Courses courses = new Courses("App Development for Web","WEB1001 - 11747", "In this course, students will discover the core concepts of developing software for the web. Students will use a\n" +
                "variety of programming tools, design elements, data types, controls, objects, and browsers. Students will solve\n" +
                "problems in code and proceed to work through larger, more complex problems. Students will evaluate and create\n" +
                "user interfaces, and they will be introduced to important web development concepts. Students will create, build,\n" +
                "debug, and test applications for the web.", "Brent Ritchie");
        this.listCourses.add(courses);

        courses = new Courses("App Development for Android","JAV1001 - 11329", "In this course, students will learn the core concepts of developing software for the iOS platform. Students will use\n" +
                "a variety of programming tools, data types, controls, objects, and emulators. Students will solve problems in code\n" +
                "and proceed to work through larger, more complex problems. Students will evaluate and create user interfaces,\n" +
                "and they will be introduced to important mobile development concepts. Students will create, build, debug, and test\n" +
                "applications for the iOS platform.", "\"David VallieresJoshua Van der Most");
        this.listCourses.add(courses);

        courses = new Courses("App Development for iOS","ISP1002 - 11319", "In this course, students will explore the core concepts of developing software for the Android platform. Students\n" +
                "will use a variety of programming tools, data types, controls, objects, and emulators. Students will solve problems\n" +
                "in code and proceed to work through larger, more complex problems. Students will evaluate and create user\n" +
                "interfaces, and they will be introduced to important mobile development concepts. Students will create, build,\n" +
                "debug, and test applications for the Android platform.", "Joshua Van der Most");
        this.listCourses.add(courses);

        courses = new Courses("Database Mgmt & Warehousing","DBA1000 - 10832", "In this course, students will explore fundamental concepts in data and information management. The course\n" +
                "content centers on the essential skills of identifying organizational requirements, modelling requirements using\n" +
                "conceptual data modelling techniques, converting conceptual models into relational data models, and verifying\n" +
                "structural characteristics with normalization techniques. Students will focus on the Structured Query Language\n" +
                "(SQL) to define and manipulate data. Additionally, students will explore the data warehouse lifecycle and\n" +
                "dimensional modelling for data warehousing.", "Aditya Phadke");
        this.listCourses.add(courses);

        courses = new Courses("Foundations of B.A.","BTA1002 - 10651", "In this course, students will define the role of the IT Business Analyst. This course is an overview of the\n" +
                "extensiveness of the Business Analysis profession. It is a critical look at the broader context of the body of\n" +
                "knowledge required to perform this work. Cases will be discussed, opinions formed, defended, and challenged\n" +
                "to grasp better the relationships between people, projects, the business, and the technical environment. A\n" +
                "secondary focus on leading organizational change will allow the learner to examine the Business Analyst's role as\n" +
                "a change agent. Finally, current best practices in guiding people through constant change are discussed.", "Imane Choukrallah Ricard");
        this.listCourses.add(courses);


    }



}