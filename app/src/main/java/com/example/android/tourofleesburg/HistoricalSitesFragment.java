package com.example.android.tourofleesburg;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HistoricalSitesFragment extends Fragment {


    public HistoricalSitesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        final ArrayList<Title> titles = new ArrayList<>();

        titles.add(new Title("Balls Bluff Battlefield and National Cemetery"));
        titles.add(new Title("The Marshall House"));
        titles.add(new Title("Oatlands Plantation"));
        titles.add(new Title("Paxton Manor"));
        titles.add(new Title("Morven Park"));

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
