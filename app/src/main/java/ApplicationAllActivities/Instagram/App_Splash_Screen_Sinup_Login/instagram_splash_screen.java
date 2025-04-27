package ApplicationAllActivities.Instagram.App_Splash_Screen_Sinup_Login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.example.instagram.R;

public class instagram_splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.instagram_splash_screen);

        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(instagram_splash_screen.this, Sign_up_Page.class);
                startActivity(intent);
                finish();
            }
        }, 2000);
    }
}