package com.example.instagram;

import static android.content.ContentValues.TAG;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import ApplicationAllActivities.Instagram.Home.FragmentsForHomePage.Camera_Fragment;
import ApplicationAllActivities.Instagram.Home.FragmentsForHomePage.Chats_Fragment;
import ApplicationAllActivities.Instagram.Home.FragmentsForHomePage.Home_Fragment;
import ApplicationAllActivities.Instagram.Home.FragmentsForHomePage.TabSectionViewPagerFragment;
import Util.BottomNavigationViewHelper;

public class Home_activity extends AppCompatActivity {

    TabLayout homeFragmentTabLayout;
    ViewPager homeFragmentViewPager;
    BottomNavigationView bottomNavigationItem;
    private static final int ACTIVITY_NUM = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        if (getActionBar() != null) {
//        getActionBar().setDisplayHomeAsUpEnabled(true);       for back button on toolbar
            getActionBar().setTitle("Instagram Clone");
        }

        setUpViewPager();
        setupBottomNavigationView();

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");
        myRef.setValue("Hello, World!");
    }

    // swipe up on fragment on home activity thats are Home, Camera, Chats
    private void setUpViewPager() {
        TabSectionViewPagerFragment adapter = new TabSectionViewPagerFragment(getSupportFragmentManager());
        adapter.addFragmentOntabbar(new Camera_Fragment());
        adapter.addFragmentOntabbar(new Home_Fragment());
        adapter.addFragmentOntabbar(new Chats_Fragment());
        ViewPager viewPager = findViewById(R.id.midlescreencontainerViewpager);
        viewPager.setAdapter(adapter);
//        TabLayout tabLayout = findViewById(R.id.tablayoutHomeActivity);
//        tabLayout.setupWithViewPager(viewPager);
//        tabLayout.getTabAt(0).setIcon(R.drawable.home);
//        tabLayout.getTabAt(1).setIcon(R.drawable.camera);
//        tabLayout.getTabAt(2).setIcon(R.drawable.send);

    }

    // this is for bottomnavigationbar and also call this method in each activity
    private void setupBottomNavigationView() {
        Log.d(TAG, "setupBottomNavigationView: setting up BottomNavigationView");
        BottomNavigationView bottomNavigationView =findViewById(R.id.buttomnavigationbar);
        BottomNavigationViewHelper.setupBottomNavigationView(bottomNavigationView);
        BottomNavigationViewHelper.enableNavigation(Home_activity.this, this, bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
        menuItem.setChecked(true);

    }

//        bottomNavigationItem_work();

//    // method of bottom navigation button
//    private void bottomNavigationItem_work() {
//        bottomNavigationItem = findViewById(R.id.buttomnavigationbar);
//        bottomNavigationItem.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                switch (item.getItemId()) {
//                    case R.id.home_button_navigation:
//                        loadFragment(new Home_Fragment(), false);
//                        break;
//                    case R.id.Search_button_navigation:
//                        loadFragment(new Search_Fragment(), false);
//                        break;
//                    case R.id.upload_button_navigation:
//                        loadFragment(new Upload_Fragment(), false);
//                        break;
//                    case R.id.Reels_button_navigation:
//                        loadFragment(new Reel_Fragment(), false);
//                        break;
//                    case R.id.user_button_navigation:
//                        loadFragment(new User_Profile_Fragment(), false);
//                        break;
//                    default:
//                        break;
//
//                }
//                return true;
//            }
//        });
//        bottomNavigationItem.setSelectedItemId(R.id.home_button_navigation);
//    }
//
//    public void loadFragment(Fragment fragment, boolean flag) {         // remember if the use if statement then nevet forget else statement
//        FragmentManager fm = getSupportFragmentManager();
//        FragmentTransaction ft = fm.beginTransaction();
//        ft.addToBackStack(null); // if fragment store recent last fragment in stack then use this method >> addToBackStack
//        if (flag) ft.replace(R.id.midlescreenviewcontainerforfragments, fragment);
//        else ft.replace(R.id.midlescreenviewcontainerforfragments, fragment);
//        ft.commit();
//    }
}
