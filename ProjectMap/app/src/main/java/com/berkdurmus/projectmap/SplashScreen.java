package com.berkdurmus.projectmap;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;




/**
 * Created by berk on 1.05.15.
 */
public class SplashScreen extends Activity {

    private static int SPLASH_SCREEN_DELAY =3000;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

         new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(intent);

                finish();
            }
        }, SPLASH_SCREEN_DELAY);

    }

}
