package com.example.android.tourofleesburg;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class FoundationAndRevolution extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView titleHeader = findViewById(R.id.historyTitleTextView);
        titleHeader.setText(R.string.founding_title);

        ImageView imageView = findViewById(R.id.tourImage);
        imageView.setImageResource(R.drawable.court_house);

        TextView description = findViewById(R.id.contentDescription);
        description.setText(R.string.founding_and_revolution_info);
    }
}
