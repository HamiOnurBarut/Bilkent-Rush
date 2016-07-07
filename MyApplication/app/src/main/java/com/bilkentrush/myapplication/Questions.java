/*
 * VOLKAN
 */

package com.bilkentrush.myapplication;

import android.app.Activity;

import java.util.*;
import java.io.*;

public class Questions extends Activity {
	private String Q,A1,A2,A3,A4,image;
	private boolean a1,a2,a3,a4;
	private BufferedReader br = null;
	private String line = "";
	private String cvsSplitBy = ",";
	private String[] check;
	private int linenumber;
	
	public Questions() {
		//search(source);
		//setType();
	}
	public void setType(){
		Q = check[1];
		A1 = check[2];
		if(check[3].equals("F"))
		{
			a1 = false;
		}
		else 
			a1 = true;
		A2 = check[4];
		if( check[5].equals("F"))
		{
			a2 = false;
				}
		else 
			a2 = true;
		A3 = check[6];
		if( check[7].equals("F"))
		{
			a3 = false;
			}
		else 
			a3 = true;
		A4 = check[8];
		if(check[9].equals("F"))
		{
			a4 = false;
		}
		else 
			a4 = true;	
		image = check[10];
	}
	public String getQuestion()
	{
		return Q;
	}
	public String getAnswer1()
	{
		return A1;
	}
	public String getAnswer2()
	{
		return A2;
	}
	public String getAnswer3()
	{
		return A3;
	}
	public String getAnswer4()
	{
		return A4;
	}
	public boolean checkAnswer1()
	{
		return a1;
	}
	public boolean checkAnswer2()
	{
		return a2;
	}
	public boolean checkAnswer3()
	{
		return a3;
	}
	public boolean checkAnswer4()
	{
		return a4;
	}
	public String addImage()
	{
		return image;
	}
	public void search(String source) throws IOException {

        InputStream inputStream = getResources().openRawResource(R.raw.buildings);
        CSVFile csvFile = new CSVFile(inputStream);
        check = csvFile.read();
    }
}
