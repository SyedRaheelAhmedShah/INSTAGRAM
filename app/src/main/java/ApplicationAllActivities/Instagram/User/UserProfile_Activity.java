package ApplicationAllActivities.Instagram.User;

import static android.content.ContentValues.TAG;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

import com.example.instagram.Home_activity;
import com.example.instagram.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import Util.BottomNavigationViewHelper;

public class UserProfile_Activity extends AppCompatActivity {
    private static final int ACTIVITY_NUM=5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.userprofile_activity);
    }
    private void setupBottomNavigationView(){
        Log.d(TAG, "setupBottomNavigationView: setting up BottomNavigationView");
        BottomNavigationView bottomNavigationViewEx = (BottomNavigationView) findViewById(R.id.buttomnavigationbar);
        BottomNavigationViewHelper.enableNavigation(UserProfile_Activity.this, bottomNavigationViewEx);
        Menu menu = bottomNavigationViewEx.getMenu();
        MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
        menuItem.setChecked(true);
    }
}