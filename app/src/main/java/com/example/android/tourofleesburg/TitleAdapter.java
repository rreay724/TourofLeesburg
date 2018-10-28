package com.example.android.tourofleesburg;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class TitleAdapter extends ArrayAdapter<Title> {

    private int mColorResourceId;


    public TitleAdapter(Activity context, ArrayList<Title> titles, int colorResourceId) {
        super(context, 0, titles);
        mColorResourceId = colorResourceId;


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Title currentTitle = getItem(position);

        TextView titleView = listItemView.findViewById(R.id.titleTextView);
        titleView.setText(currentTitle.getTitle());

        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        View textContainer = listItemView.findViewById(R.id.text_container);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
