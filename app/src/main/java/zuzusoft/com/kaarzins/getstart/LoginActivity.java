package zuzusoft.com.kaarzins.getstart;

import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import zuzusoft.com.kaarzins.R;
import zuzusoft.com.kaarzins.helper.BaseActivity;

/**
 * Created by mukeshnarayan on 28/07/18.
 */

public class LoginActivity extends BaseActivity{

    @BindView(R.id.btnSignIn) AppCompatButton btnSignIn;
    @BindView(R.id.btnSignUp) TextView btnSignUp;
    @BindView(R.id.btnForgot) TextView btnForgot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initViews();
    }

    private void initViews() {

        //spread butter
        ButterKnife.bind(this);

        //add listeners
        btnSignIn.setOnClickListener(this);
        btnSignUp.setOnClickListener(this);
        btnForgot.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btnSignIn:

                break;

            case R.id.btnSignUp:

                goToActivity(SignupActivity.class, null);

                break;

            case R.id.btnForgot:

                goToActivity(ForgotPasswordActivity.class, null);

                break;
        }
    }
}
