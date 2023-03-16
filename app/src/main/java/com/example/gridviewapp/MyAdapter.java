package com.example.gridviewapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyAdapter extends ArrayAdapter<CourseModel> {

    public MyAdapter(@NonNull Context context, ArrayList<CourseModel> courseModelArrayList) {
        super(context, 0, courseModelArrayList);
    }

    // override method getView()
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.grid_courses_card_item, parent, false);
        }

        CourseModel courseModel = getItem(position);
        TextView courseTitle = listItemView.findViewById(R.id.grid_tv_course_name);
        ImageView courseImage = listItemView.findViewById(R.id.grid_iv_course);

        courseTitle.setText(courseModel.getCourseName());
        courseImage.setImageResource(courseModel.getCourseImage());

        return listItemView;
    }
}
