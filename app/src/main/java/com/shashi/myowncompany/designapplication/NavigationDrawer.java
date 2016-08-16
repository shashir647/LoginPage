package com.shashi.myowncompany.designapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class NavigationDrawer extends Fragment {
    private String[] mPlanetTitles;
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;


    public NavigationDrawer() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_navigation_drawer, container, false);
        mPlanetTitles=view.getResources().getStringArray(R.array.planets_array);
        mDrawerLayout= (DrawerLayout) view.findViewById(R.id.drawer_layout);
        mDrawerList= (ListView) view.findViewById(R.id.left_drawer);
        mDrawerList.setAdapter(new ArrayAdapter<String>(getActivity(),R.layout.fragment_navigation_drawer,mPlanetTitles));
        mDrawerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });
        return view;
    }


}
