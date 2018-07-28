package zuzusoft.com.kaarzins.splash;

import android.os.Bundle;
import android.support.annotation.Nullable;

import zuzusoft.com.kaarzins.R;
import zuzusoft.com.kaarzins.helper.BaseActivity;


/**
 * Created by mukeshnarayan on 28/07/18.
 */

public class SplashActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);
    }
}
