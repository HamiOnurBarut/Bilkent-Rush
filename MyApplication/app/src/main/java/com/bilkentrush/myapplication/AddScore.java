package com.bilkentrush.myapplication;


import java.io.*;


public class AddScore {

	private int[] scores = new int[9];
	private String[] check;

	public AddScore(){

	}
	public void readFile(InputStream inputStream){

        CSVFile csvFile = new CSVFile(inputStream);
        check = csvFile.read();

        for(int i = 0;i < 9;i++)
        {
            scores[i] = Integer.parseInt(check[i]);
        }
    }

	public void addPoint(int type)
	{
		scores[type] += 100;
	}
	
	public void reset(){
		for (int i = 0; i < scores.length;i++ ){
			scores[i] = 0;
		}
	}
	public int getScores(int index){
		return scores[index];
	}
	
}
