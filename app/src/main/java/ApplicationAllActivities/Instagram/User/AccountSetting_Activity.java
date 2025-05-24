package ApplicationAllActivities.Instagram.User;

import static android.content.ContentValues.TAG;

import android.os.Bundle;
import android.util.Log;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.instagram.R;

import java.util.ArrayList;

public class AccountSetting_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_setting);

//     this method is for list view
        listvmidlescreen();
    }

    private void listvmidlescreen() {
        Log.d(TAG, "Profile menu button : cv");
        ListView listView = findViewById(R.id.LvAccountsetting);

        ArrayList<String> option = new ArrayList<>();
        option.add("Edit profile");
        option.add("Sign Out");

        Adapter adapter = new ArrayAdapter<>(AccountSetting_Activity.this, android.R.layout.simple_list_item_1, option);
        listView.setAdapter((ListAdapter) adapter);
    }
}
