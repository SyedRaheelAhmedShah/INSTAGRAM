package com.example.instagram;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import ApplicationAllActivities.Instagram.Home.FragmentsForHomePage.Home_Fragment;
import ApplicationAllActivities.Instagram.Reels.FragmentsForReelsPage.Reel_Fragment;
import ApplicationAllActivities.Instagram.Search.FragmentsForSearchPage.Search_Fragment;
import ApplicationAllActivities.Instagram.Upload.FragmentsForUploadPage.Upload_Fragment;
import AllFragments.User_Profile_Fragment;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationItem_work();

        if (getActionBar() != null) {
//        getActionBar().setDisplayHomeAsUpEnabled(true);       for back button on toolbar
            getActionBar().setTitle("Instagram Clone");
        }
    }
    // method of bottom navigation button
    private void bottomNavigationItem_work() {
        bottomNavigationItem = findViewById(R.id.buttomnavigationbar);
        bottomNavigationItem.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home_button_navigation:
                        loadFragment(new Home_Fragment(), false);
                        break;
                    case R.id.Search_button_navigation:
                        loadFragment(new Search_Fragment(), false);
                        break;
                    case R.id.upload_button_navigation:
                        loadFragment(new Upload_Fragment(), false);
                        break;
                    case R.id.Reels_button_navigation:
                        loadFragment(new Reel_Fragment(), false);
                        break;
                    case R.id.user_button_navigation:
                        loadFragment(new User_Profile_Fragment(), false);
                        break;
                    default:
                        break;

                }
                return true;
            }
        });
        bottomNavigationItem.setSelectedItemId(R.id.home_button_navigation);
    }

    public void loadFragment(Fragment fragment, boolean flag) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.addToBackStack(null); // if fragment store recent last fragment in stack then use this method >> addToBackStack
        if (flag) ft.replace(R.id.midlescreenviewcontainerforfragments, fragment);
//        else ft.replace(R.id.midlescreenviewcontainerforfragments, fragment);
        ft.commit();
    }
}
