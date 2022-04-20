package com.ggslvdr.courseselect_finalproject.adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ggslvdr.courseselect_finalproject.R;
import com.ggslvdr.courseselect_finalproject.model.Courses;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.myViewHolder> {

    private List<Courses> coursesList;

    public Adapter(List<Courses> list) {
        this.coursesList = list;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.adapter_courselist, parent, false);


        return new Adapter.myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {

        Courses courses = coursesList.get(position);
        holder.courseName.setText(courses.getName());
        holder.courseCode.setText(courses.getCode());
        holder.description.setText(courses.getDescription());
        holder.professor.setText(courses.getProfessor());

    }

    @Override
    public int getItemCount() {
        return coursesList.size();
    }

    public static class myViewHolder extends RecyclerView.ViewHolder{

        TextView courseName;
        TextView courseCode;
        TextView professor;
        TextView description;


        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            courseName = itemView.findViewById(R.id.coursesTextView);
            courseCode = itemView.findViewById(R.id.CodetextView);
            description = itemView.findViewById(R.id.DescriptiontextView);
            professor = itemView.findViewById(R.id.ProftextView);


        }


    }


}


