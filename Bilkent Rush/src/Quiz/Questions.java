package Quiz;

import java.util.*;
import java.io.*;

public class Questions {
	private String Q,A1,A2,A3,A4,image;
	private boolean a1,a2,a3,a4;
	private BufferedReader br = null;
	private String line = "";
	private String cvsSplitBy = ",";
	private String[] check;
	private int linenumber;
	
	public Questions(String source) throws IOException{
		search(source);
		setType();
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
	public void search(String source) throws IOException{
		Random generator = new Random();
		File data = new File(source);
		LineNumberReader  lnr = new LineNumberReader(new FileReader(data));
		lnr.skip(Long.MAX_VALUE);

		linenumber = generator.nextInt(lnr.getLineNumber()+1)+1;

		try {
			br = new BufferedReader(new FileReader(data));

			for (int i = 0; i < linenumber ; i++){
				line =br.readLine();
			        // use comma as separator
					check = line.split(cvsSplitBy);
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
	}
}
