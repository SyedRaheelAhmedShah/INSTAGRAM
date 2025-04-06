package com.example.instagram;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import AdaptersForAllFragments.Adapter_For_Midle_Screen;
import AdaptersForAllFragments.Adapter_For_Story_Section;
import ManagerClassesForAllFragments.Home_Fragment_Manager_Data_Midle_Screen;
import ManagerClassesForAllFragments.Home_Fragment_Manager_Data_Story;


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

        Story_section(rootView);                // for story section
        Midle_Screen_Post_Reel(rootView);      // for midle screen posts and reels
        return rootView;
    }


    private void Story_section(View rootView) {

        // Initialize RecyclerView for story section
        RecyclerView storyRecyclerView = rootView.findViewById(R.id.storysection_recyclerview);

        // Create Data List
        List<Home_Fragment_Manager_Data_Story> StorySectionDataArray = new ArrayList<>();
        StorySectionDataArray.add(new Home_Fragment_Manager_Data_Story(1, R.drawable.story_1, "syed"));
        StorySectionDataArray.add(new Home_Fragment_Manager_Data_Story(2, R.drawable.story_2, "haider"));
        StorySectionDataArray.add(new Home_Fragment_Manager_Data_Story(3, R.drawable.story_3, "ali"));
        StorySectionDataArray.add(new Home_Fragment_Manager_Data_Story(4, R.drawable.story_4, "shah"));
        StorySectionDataArray.add(new Home_Fragment_Manager_Data_Story(5, R.drawable.story_5, "zulqarnain"));
        StorySectionDataArray.add(new Home_Fragment_Manager_Data_Story(6, R.drawable.story_2, "haider"));
        StorySectionDataArray.add(new Home_Fragment_Manager_Data_Story(7, R.drawable.story_1, "naqvi"));
        StorySectionDataArray.add(new Home_Fragment_Manager_Data_Story(8, R.drawable.story_5, "haider"));
        StorySectionDataArray.add(new Home_Fragment_Manager_Data_Story(1, R.drawable.story_1, "syed"));
        StorySectionDataArray.add(new Home_Fragment_Manager_Data_Story(2, R.drawable.story_2, "haider"));
        StorySectionDataArray.add(new Home_Fragment_Manager_Data_Story(3, R.drawable.story_3, "ali"));
        StorySectionDataArray.add(new Home_Fragment_Manager_Data_Story(4, R.drawable.story_4, "shah"));

        // Set Adapter
        Adapter_For_Story_Section Story_Selection_Adapter = new Adapter_For_Story_Section((ArrayList<Home_Fragment_Manager_Data_Story>) StorySectionDataArray, getContext());
        storyRecyclerView.setAdapter(Story_Selection_Adapter);
        storyRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));

    }


    private void Midle_Screen_Post_Reel(View rootView) {

        // Initialize RecyclerView for midle screen (post & reels) section
        RecyclerView midleScreenRecyclerView = rootView.findViewById(R.id.midlescreen_recyclerView);

        // Create Sample Data List
        List<Home_Fragment_Manager_Data_Midle_Screen> midleScreenDataArray = new ArrayList<>();

        midleScreenDataArray.add(new Home_Fragment_Manager_Data_Midle_Screen(R.drawable.story_1, R.drawable.story_3, "5", "Haider", "Tery bin", "AJK"));
        midleScreenDataArray.add(new Home_Fragment_Manager_Data_Midle_Screen(R.drawable.story_3, R.drawable.story_5, "5", "Syed", "Mohabat", "rawalpindi"));
        midleScreenDataArray.add((new Home_Fragment_Manager_Data_Midle_Screen(R.drawable.story_4, R.drawable.story_1, "45", "Syed Haider", "a to z", "islambad")));
        midleScreenDataArray.add((new Home_Fragment_Manager_Data_Midle_Screen(R.drawable.story_5, R.drawable.story_3, "34", "Syed raheel", "tery bin", "multan")));
        midleScreenDataArray.add((new Home_Fragment_Manager_Data_Midle_Screen(R.drawable.story_2, R.drawable.story_4, "54", "naqvi", "bin tery", "lahore")));
        midleScreenDataArray.add((new Home_Fragment_Manager_Data_Midle_Screen(R.drawable.story_1, R.drawable.story_3, "73", "Haider", "tery bin", "jhang")));
        midleScreenDataArray.add((new Home_Fragment_Manager_Data_Midle_Screen(R.drawable.story_5, R.drawable.story_5, "23", "Syed Haider", "tery bin", "AJK")));
        midleScreenDataArray.add((new Home_Fragment_Manager_Data_Midle_Screen(R.drawable.story_1, R.drawable.story_4, "876", "Haider", "tery bin", "AJK")));
        midleScreenDataArray.add((new Home_Fragment_Manager_Data_Midle_Screen(R.drawable.story_2, R.drawable.story_1, "22", "Syed", "tery bin", "AJK")));
        midleScreenDataArray.add((new Home_Fragment_Manager_Data_Midle_Screen(R.drawable.story_3, R.drawable.story_5, "666", "Syed Haider", "tery bin", "AJK")));
        midleScreenDataArray.add((new Home_Fragment_Manager_Data_Midle_Screen(R.drawable.story_4, R.drawable.story_3, "2", "Syed raheel", "tery bin", "AJK")));
        midleScreenDataArray.add((new Home_Fragment_Manager_Data_Midle_Screen(R.drawable.story_2, R.drawable.story_4, "656", "naqvi", "tery bin", "AJK")));
        midleScreenDataArray.add((new Home_Fragment_Manager_Data_Midle_Screen(R.drawable.story_1, R.drawable.story_5, "995", "Haider", "tery bin", "AJK")));

        // set adapter
        Adapter_For_Midle_Screen adapterForMidleScreen = new Adapter_For_Midle_Screen((ArrayList<Home_Fragment_Manager_Data_Midle_Screen>) midleScreenDataArray, getContext());
        midleScreenRecyclerView.setAdapter(adapterForMidleScreen);
        midleScreenRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));

        // Debugging
        Log.d("RecyclerView", "Middle screen items count: " + midleScreenDataArray.size());
    }
}