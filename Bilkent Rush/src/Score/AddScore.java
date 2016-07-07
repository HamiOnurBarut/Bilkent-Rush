package Score;

import java.io.*;

import Main.ProfileData;

public class AddScore {

	private int scores[] = new int[9];
	private String check[];
	private BufferedReader br = null;
	private String line = "";
	private String cvsSplitBy = ",";
	private String datafile = "Data/Score.csv";
	
	public AddScore(){
		try {
			
			
			
		
			br = new BufferedReader(new FileReader(datafile));
			while ((line = br.readLine()) != null) {
			        // use comma as separator
				check = (line.split(cvsSplitBy));
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
		scores = new int[check.length];
		for(int i = 0;i < check.length;i++)
		{
		   scores[i] = Integer.parseInt(check[i]);
		}
	}
	
	public void addPoint(int type)
	{
		scores[type] += 100;
		generateCsvFile(datafile); 
	
	}
	public int getScore(int type)
	{
		return scores[type];
	}
	
	private void generateCsvFile(String sFileName)
	{
	 try
	 {
	     FileWriter writer = new FileWriter(sFileName);
	 
	     writer.write(new Integer(scores[0]).toString());
	     writer.write(',');
	     writer.write(new Integer(scores[1]).toString());
	     writer.write(',');
	     writer.write(new Integer(scores[2]).toString());
	     writer.write(',');
	     writer.write(new Integer(scores[3]).toString());
	     writer.write(',');
	     writer.write(new Integer(scores[4]).toString());
	     writer.write(',');
	     writer.write(new Integer(scores[5]).toString());
	     writer.write(',');
	     writer.write(new Integer(scores[6]).toString());
	     writer.write(',');
	     writer.write(new Integer(scores[7]).toString());
	     writer.write(',');
	     writer.write(new Integer(scores[8]).toString());
	 
	     writer.flush();
	     writer.close();
	 }
	 catch(IOException e){
	      e.printStackTrace();
	 } 
	}
	
	public void reset(){
		for (int i = 0; i < scores.length;i++ ){
			scores[i] = 0;
		}
		generateCsvFile(datafile); 
		ProfileData data = new ProfileData();
		data.resettrophy();
	}
	
	public int getScores(int index){
		return scores[index];
	}
	
}
