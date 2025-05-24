package ApplicationAllActivities.Instagram.User;

import static android.content.ContentValues.TAG;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.instagram.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import Util.BottomNavigationViewHelper;

public class UserProfile_Activity extends AppCompatActivity {
    private static final int ACTIVITY_NUM = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userprofile);
        ProgressBar progressBar=findViewById(R.id.userprofileprogressbar);
        progressBar.setVisibility(View.GONE);

        toolbar();
        setupBottomNavigationView();
    }

    private void toolbar() {
        Toolbar uProfileToolbar = findViewById(R.id.uProfileToolbar);
        setSupportActionBar(uProfileToolbar);
//        uProfileToolbar.getLogo(R.drawable.menu);
        ImageView profileMenu=findViewById(R.id.profilemenu);
        profileMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(UserProfile_Activity.this, AccountSetting_Activity.class);
                startActivity(intent);
            }
        });


    }

    private void setupBottomNavigationView() {
        Log.d(TAG, "setupBottomNavigationView: setting up BottomNavigationView");
        BottomNavigationView bottomNavigationViewEx = (BottomNavigationView) findViewById(R.id.buttomnavigationbar);
        BottomNavigationViewHelper.enableNavigation(UserProfile_Activity.this, bottomNavigationViewEx);
        Menu menu = bottomNavigationViewEx.getMenu();
        MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
        menuItem.setChecked(true);
    }


}