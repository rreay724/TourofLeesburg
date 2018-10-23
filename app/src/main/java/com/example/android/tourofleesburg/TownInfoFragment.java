package com.example.android.tourofleesburg;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class TownInfoFragment extends Fragment {


    public TownInfoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
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

            }
        });

        return rootView;
    }

}
