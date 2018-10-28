package com.example.android.tourofleesburg;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class EarlySettlement extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView titleHeader = findViewById(R.id.historyTitleTextView);
        titleHeader.setText(R.string.early_settlement_title);

        ImageView imageView = findViewById(R.id.tourImage);
        imageView.setImageResource(R.drawable.original_leesburg_map);

        TextView description = findViewById(R.id.contentDescription);
        description.setText(R.string.early_settlement_info);


    }
}
