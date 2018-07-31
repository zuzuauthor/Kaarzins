package zuzusoft.com.kaarzins.helper;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by mukeshnarayan on 28/07/18.
 */

public class BaseActivity extends AppCompatActivity implements View.OnClickListener{

    public static final String KEY_ACTIVITY_BUNDLE = "bundle";

    public Context context;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        context = this;
    }

    @Override
    public void onClick(View view) {


    }


    public void goToActivity(Class<?> className, Bundle args){

        Intent intent = new Intent(context, className);
        intent.getBundleExtra(KEY_ACTIVITY_BUNDLE);
        startActivity(intent);

    }


    public int getImage(String imageName) {

        int drawableResourceId = this.getResources().getIdentifier(imageName, "drawable", this.getPackageName());

        return drawableResourceId;
    }

}
