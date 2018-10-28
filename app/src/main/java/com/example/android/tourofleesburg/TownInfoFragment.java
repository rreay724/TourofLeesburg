package com.example.android.tourofleesburg;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class TownInfoFragment extends Fragment {

    private static final String TAG = "TownFragment";


    public TownInfoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        final ArrayList<Title> titles = new ArrayList<>();

        titles.add(new Title("Early Settlement and Founding"));
        titles.add(new Title("Founding and Revolution"));
        titles.add(new Title("War of 1812 and Lafayette's Visit"));
        titles.add(new Title("Leesburg Inc."));


        TitleAdapter adapter = new TitleAdapter(getActivity(), titles, R.color.titleColor);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                Log.d(TAG, "button pressed" + position);


                if (position == 0) {
                    Intent intent = new Intent(getActivity(), EarlySettlement.class);
                    startActivity(intent);
                } else if (position == 1) {
                    Intent intent = new Intent(getActivity(), FoundationAndRevolution.class);
                    startActivity(intent);
                } else if (position == 2) {
                    Intent intent = new Intent(getActivity(), WarOf1812.class);
                    startActivity(intent);
                } else {
                    Intent intent = new Intent(getActivity(), LeesburgInc.class);
                    startActivity(intent);

                }

            }
        });

        return rootView;
    }

}
