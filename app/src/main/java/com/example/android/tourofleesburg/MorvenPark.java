package com.example.android.tourofleesburg;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class MorvenPark extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView titleHeader = findViewById(R.id.historyTitleTextView);
        titleHeader.setText(R.string.morven_park_title);

        ImageView imageView = findViewById(R.id.tourImage);
        imageView.setImageResource(R.drawable.morven_park_image);

        TextView description = findViewById(R.id.contentDescription);
        description.setText(R.string.morven_park_info);
    }
}
