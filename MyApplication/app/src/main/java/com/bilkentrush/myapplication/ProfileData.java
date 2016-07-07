package com.bilkentrush.myapplication;


import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;

import java.io.BufferedReader;
import java.io.InputStream;

public class ProfileData extends Activity{
	
	private String[] award;

	public ProfileData(InputStream inputStream)   {

        CSVFile csvFile = new CSVFile(inputStream);
        award = csvFile.read();
	}
	public String getNickName(){
		return award[0];
	}
	public void setNickName(String set){
		award[0] = set;
	}
	public void checkTrophy(ImageView t1,ImageView t2,ImageView t3,ImageView t4,ImageView t5,ImageView t6,ImageView t7,ImageView t8,ImageView t9){

        ImageView[] Array = new ImageView[9];
		Array[0] = t1;
        Array[1] = t2;
        Array[2] = t3;
        Array[3] = t4;
        Array[4] = t5;
        Array[5] = t6;
        Array[6] = t7;
        Array[7] = t8;
        Array[8] = t9;

		
		for (int i = 1; i <= 9; i++ ){
			if (award[i].equals("F"))
                Array[i-1].setImageResource(R.drawable.chest);
			else
                Array[i-1].setImageResource(R.drawable.trophytrue);
		}
	}
	public void resetTrophy()
	{
		for (int i = 0; i < award.length-1;i++ ){
			award[i+1] = "F";
		}
	}
}
