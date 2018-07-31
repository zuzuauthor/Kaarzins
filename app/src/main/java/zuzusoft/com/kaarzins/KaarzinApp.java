package zuzusoft.com.kaarzins;

import android.app.Application;

import com.devs.acr.AutoErrorReporter;

/**
 * Created by mukeshnarayan on 31/07/18.
 */

public class KaarzinApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        AutoErrorReporter.get(this)
                .setEmailAddresses("zuzuauthor@gmail.com")
                .setEmailSubject("Kaarzin Crash Report")
                .start();


    }

}
