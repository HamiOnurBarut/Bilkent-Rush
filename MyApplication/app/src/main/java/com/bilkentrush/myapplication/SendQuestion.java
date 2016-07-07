package com.bilkentrush.myapplication;


import com.bilkentrush.myapplication.util.SystemUiHider;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.*;


/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 *
 * @see SystemUiHider
 */
public class SendQuestion extends Activity {

    private static final boolean AUTO_HIDE = true;
    private static final int AUTO_HIDE_DELAY_MILLIS = 3000;
    private static final boolean TOGGLE_ON_CLICK = true;
    private static final int HIDER_FLAGS = SystemUiHider.FLAG_HIDE_NAVIGATION;
    private SystemUiHider mSystemUiHider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_sendquestion);

        final View controlsView = findViewById(R.id.fullscreen1);
        final View text21 = findViewById(R.id.textView21);
      //  final EditText editText1 = (EditText) (R.id.textView22);
      //  final EditText editText2 = (EditText) (R.id.textView26);
        final Button button17 = (Button) findViewById(R.id.button17);
        final Button button16 = (Button) findViewById(R.id.button16);


        button16.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        button17.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),Menu.class);
                startActivity(i);
            }
        });


    }
}