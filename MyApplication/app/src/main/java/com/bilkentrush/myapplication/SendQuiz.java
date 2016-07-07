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


/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 *
 * @see SystemUiHider
 */
public class SendQuiz extends Activity {

    private static final boolean AUTO_HIDE = true;
    private static final int AUTO_HIDE_DELAY_MILLIS = 3000;
    private static final boolean TOGGLE_ON_CLICK = true;
    private static final int HIDER_FLAGS = SystemUiHider.FLAG_HIDE_NAVIGATION;
    private SystemUiHider mSystemUiHider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_sendquiz);

        View controlsView1 = findViewById(R.id.textView40);
        View Question = findViewById(R.id.textView41);
        View Answer1 = findViewById(R.id.textView23);
        View Answer2 = findViewById(R.id.textView24);
        View Answer3 = findViewById(R.id.textView25);
        View Answer4 = findViewById(R.id.textView26);

        Button button1 = (Button) findViewById(R.id.button16);
        Button button2 = (Button) findViewById(R.id.button17);

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
