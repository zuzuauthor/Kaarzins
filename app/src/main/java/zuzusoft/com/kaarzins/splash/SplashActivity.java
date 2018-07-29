package zuzusoft.com.kaarzins.splash;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;

import zuzusoft.com.kaarzins.ProfileActivity;
import zuzusoft.com.kaarzins.R;
import zuzusoft.com.kaarzins.helper.BaseActivity;


/**
 * Created by mukeshnarayan on 28/07/18.
 */

public class SplashActivity extends BaseActivity {

    private final int SPLASH_TIME = 2500;
    private Runnable runnable;
    private Handler handler;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);

        handler = new Handler();


    }

    @Override
    protected void onResume() {
        super.onResume();
        showSplashScreen();
    }

    private void showSplashScreen() {
        runnable = new Runnable() {
            public void run() {
                Intent intent;
                /*if (AppPreferences.isLoggedIn(SplashActivity.this)) {
                    intent = new Intent(getApplicationContext(), MainActivity.class);
                } else {
                    intent = new Intent(getApplicationContext(), LoginActivity.class);
                }*/
                intent = new Intent(getApplicationContext(), ProfileActivity.class);
                startActivity(intent);
                finish();
            }
        };
        handler.postDelayed(runnable, SPLASH_TIME);
    }

    protected void onPause() {
        super.onPause();
        if (runnable != null)
            handler.removeCallbacks(runnable);
    }

}
