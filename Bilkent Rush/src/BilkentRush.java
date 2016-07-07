
import javax.swing.*;

import Main.*;

public class BilkentRush {
		
	public static void main(String args[]){
		game();		
	  }
	public static void game()
	{
		JFrame frame = new JFrame("Bilkent Rush");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new MainPageName(frame));
		frame.pack();
		frame.setVisible(true);
	}
}
