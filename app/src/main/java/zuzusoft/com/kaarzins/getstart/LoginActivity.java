package zuzusoft.com.kaarzins.getstart;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;

import zuzusoft.com.kaarzins.R;
import zuzusoft.com.kaarzins.helper.BaseActivity;

/**
 * Created by mukeshnarayan on 28/07/18.
 */

public class LoginActivity extends BaseActivity implements View.OnClickListener {

    private AppCompatButton btn_sign_in, btn_sign_up;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initViews();
    }

    private void initViews() {

        btn_sign_in = findViewById(R.id.btn_sign_in);
        btn_sign_in.setOnClickListener(this);

        btn_sign_up = findViewById(R.id.btn_sign_up);
        btn_sign_up.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btn_sign_in:

                break;

            case R.id.btn_sign_up:
                startActivity(new Intent(LoginActivity.this, SignupActivity.class));
                break;
        }
    }
}
