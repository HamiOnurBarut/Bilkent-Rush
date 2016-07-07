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
import android.widget.TextView;

import java.io.InputStream;


/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 *
 * @see SystemUiHider
 */
public class Score extends Activity {
    private static final boolean AUTO_HIDE = true;
    private static final int AUTO_HIDE_DELAY_MILLIS = 3000;
    private static final boolean TOGGLE_ON_CLICK = true;
    private static final int HIDER_FLAGS = SystemUiHider.FLAG_HIDE_NAVIGATION;
    private SystemUiHider mSystemUiHider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_score);

        TextView score1 = (TextView) findViewById(R.id.textView12);
        TextView score2 = (TextView) findViewById(R.id.textView13);
        TextView score3 = (TextView) findViewById(R.id.textView14);
        TextView score4 = (TextView) findViewById(R.id.textView15);
        TextView score5 = (TextView) findViewById(R.id.textView16);
        TextView score6 = (TextView) findViewById(R.id.textView17);
        TextView score7 = (TextView) findViewById(R.id.textView18);
        TextView score8 = (TextView) findViewById(R.id.textView19);
        TextView score9 = (TextView) findViewById(R.id.textView20);

        Button button1 = (Button) findViewById(R.id.button18);
        Button button2 = (Button) findViewById(R.id.button19);

        InputStream inputStream = getResources().openRawResource(R.raw.score);
        final AddScore score = new AddScore();
        score.readFile(inputStream);
        score1.setText(" "+score.getScores(0));
        score2.setText(" "+score.getScores(1));
        score3.setText(" "+score.getScores(2));
        score4.setText(" "+score.getScores(3));
        score5.setText(" "+score.getScores(4));
        score6.setText(" "+score.getScores(5));
        score7.setText(" "+score.getScores(6));
        score8.setText(" "+score.getScores(7));
        score9.setText(" "+score.getScores(8));


        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Chooselist.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                score.reset();

            }
        });
    }
}
