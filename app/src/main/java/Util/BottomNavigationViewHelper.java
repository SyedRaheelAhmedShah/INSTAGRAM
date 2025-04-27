package Util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.instagram.Home_activity;
import com.example.instagram.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import ApplicationAllActivities.Instagram.Reels.Likes_Activity;
import ApplicationAllActivities.Instagram.Search.Search_Activity;
import ApplicationAllActivities.Instagram.Upload.Upload_Activity;
import ApplicationAllActivities.Instagram.User.UserProfile_Activity;

/**
 * Created by User on 5/28/2017.
 */

public class BottomNavigationViewHelper {

    private static final String TAG = "BottomNavigationViewHel";



    public static void enableNavigation(final Context context,  BottomNavigationView view) {
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {

                    case R.id.home_button_navigation:
                        Intent intent1 = new Intent(context, Home_activity.class); // Activity 0
                        context.startActivity(intent1);
//                        callingActivity.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                        break;

                    case R.id.Search_button_navigation:
                        Intent intent2 = new Intent(context, Search_Activity.class); // Activity 1
                        context.startActivity(intent2);
//                        callingActivity.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                        break;

                    case R.id.upload_button_navigation:
                        Intent intent3 = new Intent(context, Upload_Activity.class); // Activity 2
                        context.startActivity(intent3);
//                        callingActivity.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                        break;

                    case R.id.Reels_button_navigation:
                        Intent intent4 = new Intent(context, Likes_Activity.class); // Activity 4
                        context.startActivity(intent4);
//                        callingActivity.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                        break;

                    case R.id.user_button_navigation:
                        Intent intent5 = new Intent(context, UserProfile_Activity.class); // Activity 5
                        context.startActivity(intent5);
//                        callingActivity.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                        break;
                }

                return true; // Fix return value to true so selection works
            }
        });
        }
}
