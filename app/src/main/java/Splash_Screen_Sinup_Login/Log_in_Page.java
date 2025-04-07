package Splash_Screen_Sinup_Login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.instagram.MainActivity;
import com.example.instagram.R;

public class Log_in_Page extends AppCompatActivity {
    TextView signupFromLoginPage, homePageFromLoginPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in_page);

        signupFromLoginPageMethod();
        homePageFromLoginPageMethod();
    }

    private void signupFromLoginPageMethod() {
        this.signupFromLoginPage = findViewById(R.id.signupFromLoginPage);
        this.signupFromLoginPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Log_in_Page.this, Sign_up_Page.class);
                startActivity(intent);
            }
        });


    }

    private void homePageFromLoginPageMethod() {
        this.homePageFromLoginPage = findViewById(R.id.homePageFromLoginPage);
        this.homePageFromLoginPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Log_in_Page.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }


}