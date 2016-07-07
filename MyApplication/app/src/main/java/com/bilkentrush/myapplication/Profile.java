package com.bilkentrush.myapplication;

/**
 * Created by Volkan on 30/04/15.
 */
import com.bilkentrush.myapplication.util.SystemUiHider;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;


/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 *
 * @see SystemUiHider
 */
public class Profile extends Activity {
    private static final boolean AUTO_HIDE = true;
    private static final int AUTO_HIDE_DELAY_MILLIS = 3000;
    private static final boolean TOGGLE_ON_CLICK = true;
    private static final int HIDER_FLAGS = SystemUiHider.FLAG_HIDE_NAVIGATION;
    private SystemUiHider mSystemUiHider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_profile);

        TextView nickname = (TextView) findViewById(R.id.textView32);
        ImageView image1 = (ImageView) findViewById(R.id.imageView3);
        ImageView image2 = (ImageView) findViewById(R.id.imageView4);
        ImageView image3 = (ImageView) findViewById(R.id.imageView5);
        ImageView image4 = (ImageView) findViewById(R.id.imageView6);
        ImageView image5 = (ImageView) findViewById(R.id.imageView7);
        ImageView image6 = (ImageView) findViewById(R.id.imageView8);
        ImageView image7 = (ImageView) findViewById(R.id.imageView9);
        ImageView image8 = (ImageView) findViewById(R.id.imageView10);
        ImageView image9 = (ImageView) findViewById(R.id.imageView11);
        Button button1 = (Button) findViewById(R.id.button18);
        Button button2 = (Button) findViewById(R.id.button19);

        InputStream inputStream = getResources().openRawResource(R.raw.name);
        final ProfileData data = new ProfileData(inputStream);

        data.checkTrophy(image1,image2,image3,image4,image5,image6,image7,image8,image9);

        nickname.setText(data.getNickName());
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Menu.class);
                startActivity(intent);
            }
        });
    }
}
