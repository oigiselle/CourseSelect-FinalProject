package com.ggslvdr.courseselect_finalproject.adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ggslvdr.courseselect_finalproject.R;

public class Adapter extends RecyclerView.Adapter<Adapter.myViewHolder> {


    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.adapter_courselist, parent, false);


        return new Adapter.myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        holder.courseName.setText("Java");
        holder.courseCode.setText("JAV1001");
        holder.professor.setText("David Vallieres");
        holder.description.setText("App Development for Android");

    }

    @Override
    public int getItemCount() {
        return 5;
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


