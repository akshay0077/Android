package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A {@link Fragment} subclass that displays a list of monuments.
 */
public class MonumentsFragment extends Fragment {


    public MonumentsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Create an array of places
        ArrayList<Place> places = new ArrayList<Place>();

        // Add to an array new objects with the data
        places.add(new Place(getString(R.string.monument_to_empress_catherine_ii),
                R.drawable.monument_to_empress_catherine_ii));
        places.add(new Place(getString(R.string.monument_to_shurik_and_lidochka),
                R.drawable.monument_to_shurik_and_lidochka));
        places.add(new Place(getString(R.string.monument_to_the_purse),
                R.drawable.monument_to_the_purse));
        places.add(new Place(getString(R.string.monument_sobachkina_stolica),
                R.drawable.monument_sobachkina_stolica));
        places.add(new Place(getString(R.string.monument_to_man_the_creator),
                R.drawable.monument_to_man_the_creator));
        places.add(new Place(getString(R.string.monument_to_suvorov), R.drawable.monument_to_suvorov));
        places.add(new Place(getString(R.string.monument_of_st_catherine_the_great_martyr),
                R.drawable.monument_of_st_catherine_the_great_martyr));
        places.add(new Place(getString(R.string.monument_to_the_cossacks),
                R.drawable.monument_to_the_cossacks));
        places.add(new Place(getString(R.string.generation_connection),
                R.drawable.generation_connection));

        // Inflate current View object in places_list.xml
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        // Create PlaceAdapter object in current activity for data from places array
        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), places);

        // Create ListView object in places_list.xml and set the PlaceAdapter object to it
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(placeAdapter);

        // Return current View object with the data
        return rootView;
    }
}
