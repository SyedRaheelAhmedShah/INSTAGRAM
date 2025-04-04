package com.example.instagram;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

import AdaptersForAllFragments.Adapter_For_Story_Section;
import ManagerClassesForAllFragments.Home_Fragment_Manager_Data;
import android.widget.Toolbar;



public class Home_Fragment extends Fragment {

    public Home_Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout
        View rootView = inflater.inflate(R.layout.fragment_home_, container, false);

        // Fix Toolbar
        Toolbar toolbar = rootView.findViewById(R.id.homeToolbar);
        ((AppCompatActivity) requireActivity()).setActionBar(toolbar);

        if (((AppCompatActivity) requireActivity()).getActionBar() != null) {
            ((AppCompatActivity) requireActivity()).getActionBar().setTitle("Instagram Clone");
        }

        // Initialize RecyclerView
        RecyclerView storyRecyclerView = rootView.findViewById(R.id.storysection_recyclerview);

        // Create Data List
        List<Home_Fragment_Manager_Data> StorySectionDataArray = new ArrayList<>();
        StorySectionDataArray.add(new Home_Fragment_Manager_Data(1, R.drawable.story_1, "syed"));
        StorySectionDataArray.add(new Home_Fragment_Manager_Data(2, R.drawable.story_2, "haider"));
        StorySectionDataArray.add(new Home_Fragment_Manager_Data(3, R.drawable.story_3, "ali"));
        StorySectionDataArray.add(new Home_Fragment_Manager_Data(4, R.drawable.story_4, "shah"));
        StorySectionDataArray.add(new Home_Fragment_Manager_Data(5, R.drawable.story_5, "zulqarnain"));
        StorySectionDataArray.add(new Home_Fragment_Manager_Data(6, R.drawable.story_2, "haider"));
        StorySectionDataArray.add(new Home_Fragment_Manager_Data(7, R.drawable.story_1, "naqvi"));
        StorySectionDataArray.add(new Home_Fragment_Manager_Data(8, R.drawable.story_5, "haider"));
        StorySectionDataArray.add(new Home_Fragment_Manager_Data(1, R.drawable.story_1, "syed"));
        StorySectionDataArray.add(new Home_Fragment_Manager_Data(2, R.drawable.story_2, "haider"));
        StorySectionDataArray.add(new Home_Fragment_Manager_Data(3, R.drawable.story_3, "ali"));
        StorySectionDataArray.add(new Home_Fragment_Manager_Data(4, R.drawable.story_4, "shah"));


        // Set Adapter
        Adapter_For_Story_Section Story_Selection_Adapter = new Adapter_For_Story_Section((ArrayList<Home_Fragment_Manager_Data>) StorySectionDataArray, getContext());
        storyRecyclerView.setAdapter(Story_Selection_Adapter);
        storyRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));

        return rootView;
    }

}