package com.example.ariketa4_section6;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainCoursesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_courses);

        ListView mainCoursesList = findViewById(R.id.list_view_main_course);

        Dish[] mainCourses = {
                new Dish("Gotica", "Alta, curby, buena forma y lo mas importante te trata mal", 999),
                new Dish("Rubia", "Normal, delgada, muy buena forma y lo mas importante te trata bien", 9999),
                new Dish("Rizada", "Normal, curby, buena forma y lo mas importante te trata mal", 99),
                new Dish("Latina", "Bajita, curby, buena forma y celosa", 9)

        };

        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mainCourses);
        mainCoursesList.setAdapter(dishesAdapter);
    }
}
