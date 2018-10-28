package com.example.android.tourofleesburg;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class InfoAdapter extends ArrayAdapter<Info> {

    private int mInfoColorResourceId;

    public InfoAdapter(Activity context, ArrayList<Info> information, int colorResourceId) {
        super(context, 0, information);
        mInfoColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listInfoView = convertView;
        if (listInfoView == null) {
            listInfoView = LayoutInflater.from(getContext()).inflate(R.layout.activity_detail, parent, false);
        }

        Info currentInfo = getItem(position);

        TextView titleView = listInfoView.findViewById(R.id.historyTitleTextView);
        titleView.setText(currentInfo.getInfoTitle());

        ImageView infoImage = listInfoView.findViewById(R.id.tourImage);
        infoImage.setImageResource(currentInfo.getImageId());

        TextView description = listInfoView.findViewById(R.id.contentDescription);
        description.setText(currentInfo.getInformation());


        return listInfoView;
    }
}
