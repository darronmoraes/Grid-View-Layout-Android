package com.example.gridviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.grid_view);

        // Creating Data
        ArrayList<CourseModel> courseModelArrayList = new ArrayList<>();
        courseModelArrayList.add(new CourseModel("Learn Android in 30 days", R.drawable.android_studio));
        courseModelArrayList.add(new CourseModel("Power of Kotlin", R.drawable.kotln));
        courseModelArrayList.add(new CourseModel("MySQL for Everything", R.drawable.mysql));
        courseModelArrayList.add(new CourseModel("Web-Tech with React", R.drawable.react));

        // Attaching Adapter to view
        MyAdapter myAdapter = new MyAdapter(this, courseModelArrayList);
        gridView.setAdapter(myAdapter);
    }
}