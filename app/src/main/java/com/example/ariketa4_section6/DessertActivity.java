package com.example.ariketa4_section6;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DessertActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert);

        ListView dessertList = findViewById(R.id.list_view_desserts);

        Dish[] desserts = {
                new Dish("Rizada", "Normal, curby, buena forma y lo mas importante te trata mal", 99),
                new Dish("Latina", "Bajita, curby, buena forma y celosa", 9),
                new Dish("Gotica", "Alta, curby, buena forma y lo mas importante te trata mal", 999),
                new Dish("Rubia", "Normal, delgada, muy buena forma y lo mas importante te trata bien", 9999)
        };

        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, desserts);
        dessertList.setAdapter(dishesAdapter);

    }
}