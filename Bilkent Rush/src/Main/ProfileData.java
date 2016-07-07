package Main;

import java.awt.Image;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Score.AddScore;

public class ProfileData {
	
	private String award[];
	private BufferedReader br = null;
	private String line = "";
	private String cvsSplitBy = ",";
	private String datafile = "Data/Name.csv";
	
	public ProfileData(){
		try {
			 
	//		InputStream is = getClass().getResourceAsStream(datafile);
	//		InputStreamReader isr = new InputStreamReader(is);
	//		BufferedReader br = new BufferedReader(isr);
			
			br = new BufferedReader(new FileReader(datafile));
			while ((line = br.readLine()) != null) {
			        // use comma as separator
				award = (line.split(cvsSplitBy));
			}
	 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		checkScore();
	}
	public String getNickName(){
		return award[0];
	}
	public void setNickName(String set){
		
		award[0] = set;
		writedata();
	}
	public void writedata(){
		try{
			FileWriter writer = new FileWriter(datafile);
			writer.write(award[0]);
			writer.write(',');
		    writer.write(award[1]);
		    writer.write(',');
		    writer.write(award[2]);
		    writer.write(',');
		    writer.write(award[3]);
		    writer.write(',');
		    writer.write(award[4]);
		    writer.write(',');
		    writer.write(award[5]);
		    writer.write(',');
		    writer.write(award[6]);
		    writer.write(',');
		    writer.write(award[7]);
		    writer.write(',');
		    writer.write(award[8]);
		    writer.write(',');
		    writer.write(award[9]);
			writer.flush();
			writer.close();
		 }
		 catch(IOException ee){
		      ee.printStackTrace();
		 } 
	}
	
	public void checktrophy(JLabel t1,JLabel t2,JLabel t3,JLabel t4,JLabel t5,JLabel t6,JLabel t7,JLabel t8,JLabel t9){
		Image imgfalse = new ImageIcon(this.getClass().getResource("rsz_trapped_chest.png")).getImage(); 
		Image imgtrue = new ImageIcon(this.getClass().getResource("rsz_3trophytrue.png")).getImage(); 
		String F = "F";
		
		JLabel[] Labelarray = new JLabel[9];
		Labelarray[0] = t1;
		Labelarray[1] = t2;
		Labelarray[2] = t3;
		Labelarray[3] = t4;
		Labelarray[4] = t5;
		Labelarray[5] = t6;
		Labelarray[6] = t7;
		Labelarray[7] = t8;
		Labelarray[8] = t9;
		
		checkScore();
		
		for (int i = 1; i <= 9; i++ ){	
			if (award[i].equals(F))
				Labelarray[i-1].setIcon(new ImageIcon(imgfalse));
			else
				Labelarray[i-1].setIcon(new ImageIcon(imgtrue));
		}
	}
	public void checkScore(){
		AddScore score = new AddScore();
		for (int i = 1; i <= award.length-1;i++ ){
			if (score.getScores(i-1)>=100){
				award[i] = "T";
			}
		}
		writedata();
	}
	public void resettrophy()
	{
		for (int i = 0; i < award.length-1;i++ ){
			award[i+1] = "F";
		}
		writedata();
	}
}
