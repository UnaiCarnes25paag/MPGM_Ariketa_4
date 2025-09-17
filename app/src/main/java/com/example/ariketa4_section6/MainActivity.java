package com.example.ariketa4_section6;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    CardView startersCard;
    CardView mainsCard;
    CardView dessertsCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startersCard = findViewById(R.id.card_view_starters);
        mainsCard = findViewById(R.id.card_view_mains);
        dessertsCard = findViewById(R.id.card_view_desserts);

        startersCard.setOnClickListener((v) -> {

            Intent startersActivityIntent = new Intent(MainActivity.this, StartersActivity.class);

            startActivity(startersActivityIntent);

        });

        mainsCard.setOnClickListener((v) -> {

            Intent mainCoursesActivityIntent = new Intent(MainActivity.this, MainCoursesActivity.class);

            startActivity(mainCoursesActivityIntent);

        });

        dessertsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dessertActivityIntent = new Intent(MainActivity.this, DessertActivity.class);
                startActivity(dessertActivityIntent);
            }
        });

        TextView emailTextView = findViewById(R.id.text_view_email_address);
        emailTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchEmailAppIntent = new Intent(Intent.ACTION_SENDTO);
                launchEmailAppIntent.setData(Uri.parse("mailto:thegothlover@gothicc.yes"));
                startActivity(launchEmailAppIntent);
            }
        });
    }
}