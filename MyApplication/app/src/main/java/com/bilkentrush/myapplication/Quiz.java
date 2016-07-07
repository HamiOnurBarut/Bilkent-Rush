package com.bilkentrush.myapplication;

/**
 * Created by Volkan on 30/04/15.
 */

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
import android.widget.ImageView;
import android.widget.TextView;


/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 *
 * @see SystemUiHider
 */
public class Quiz extends Activity {
    private static final boolean AUTO_HIDE = true;
    private static final int AUTO_HIDE_DELAY_MILLIS = 3000;
    private static final boolean TOGGLE_ON_CLICK = true;
    private static final int HIDER_FLAGS = SystemUiHider.FLAG_HIDE_NAVIGATION;
    private SystemUiHider mSystemUiHider;
    private String enter;
    private int type;

    public void set(String enter,int type){
        this.enter=enter;
        this.type=type;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_quiz);

         TextView text1 = (TextView) findViewById(R.id.textView28);
         View text2 = findViewById(R.id.textView29);
         ImageView image = (ImageView) findViewById(R.id.imageView2);
         Button button1 = (Button) findViewById(R.id.button22);
         Button button2 = (Button) findViewById(R.id.button23);
         Button button3 = (Button) findViewById(R.id.button24);
         Button button4 = (Button) findViewById(R.id.button25);
         Button button5 = (Button) findViewById(R.id.button20);
         Button button6 = (Button) findViewById(R.id.button21);

        text1.setText(enter);
        final Questions q = new Questions();
        final AddScore score = new AddScore();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(q.getAnswer1() == "T"){
                score.addPoint(type);
             }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(q.getAnswer2() == "T"){
                    score.addPoint(type);
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(q.getAnswer3() == "T"){
                    score.addPoint(type);
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(q.getAnswer4() == "T"){
                    score.addPoint(type);
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Chooselist.class);
                startActivity(intent);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
