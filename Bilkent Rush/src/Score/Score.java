package Score;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Methods.Chooselist;

public class Score extends JPanel {
	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private JFrame parentFrame;
	private static final long serialVersionUID = 4L;
	
	public Score(JFrame parentFrame) 
	{
		this.parentFrame = parentFrame;
		
		setVisible(true);
		setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		setBackground(Color.WHITE);
		
		AddScore p = new AddScore();
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		JPanel panel6 = new JPanel();
		JPanel panel7 = new JPanel();
		JPanel panel8 = new JPanel();
		JPanel panel9 = new JPanel();
		
		JLabel lab1 = new JLabel("BUILDINGS");
		JLabel sc1 = new JLabel(""+p.getScore(0));
		
		JLabel lab2 = new JLabel("COURSES");
		JLabel sc2 = new JLabel(""+p.getScore(1));
		
		JLabel lab3 = new JLabel("DORMS");
		JLabel sc3 = new JLabel(""+p.getScore(2));
		
		JLabel lab4 = new JLabel("TRAFFIC");
		JLabel sc4 = new JLabel(""+p.getScore(3));
		
		JLabel lab5 = new JLabel("MEAL PLACES");
		JLabel sc5 = new JLabel(""+p.getScore(4));
		
		JLabel lab6 = new JLabel("BUSES");
		JLabel sc6 = new JLabel(""+p.getScore(5));
		
		JLabel lab7 = new JLabel("INSTRUCTORS");
		JLabel sc7 = new JLabel(""+p.getScore(6));
		
		JLabel lab8 = new JLabel("STAFF");
		JLabel sc8 = new JLabel(""+p.getScore(7));
		
		JLabel lab9 = new JLabel("SHOPPING");
		JLabel sc9 = new JLabel(""+p.getScore(8));
		
		lab1.setBackground(new Color(255, 102, 0));
		sc1.setBackground(new Color(255, 102, 0));
		lab2.setBackground(new Color(204, 102, 0));
		sc2.setBackground(new Color(204, 102, 0));
		lab3.setBackground(new Color(204, 102, 153));
		sc3.setBackground(new Color(204, 102, 153));
		lab4.setBackground(new Color(153, 102, 255));
		sc4.setBackground(new Color(153, 102, 255));
		lab5.setBackground(new Color(153, 153, 204));
		sc5.setBackground(new Color(153, 153, 204));
		lab6.setBackground(new Color(102, 153, 204));
		sc6.setBackground(new Color(102, 153, 204));
		lab7.setBackground(new Color(51, 153, 255));
		sc7.setBackground(new Color(51, 153, 255));
		lab8.setBackground(new Color(51, 204, 153));
		sc8.setBackground(new Color(51, 204, 153));
		lab9.setBackground(new Color(51, 204, 102));
		sc9.setBackground(new Color(51, 204, 102));
		
		lab1.setOpaque(true);
		lab2.setOpaque(true);
		lab3.setOpaque(true);
		lab4.setOpaque(true);
		lab5.setOpaque(true);
		lab6.setOpaque(true);
		lab7.setOpaque(true);
		lab8.setOpaque(true);
		lab9.setOpaque(true);

		sc1.setOpaque(true);
		sc2.setOpaque(true);
		sc3.setOpaque(true);
		sc4.setOpaque(true);
		sc5.setOpaque(true);
		sc6.setOpaque(true);
		sc7.setOpaque(true);
		sc8.setOpaque(true);
		sc9.setOpaque(true);
		
		lab1.setFont(new Font("Verdana",Font.BOLD + Font.ITALIC,30));
		lab2.setFont(new Font("Verdana",Font.BOLD + Font.ITALIC,30));
		lab3.setFont(new Font("Verdana",Font.BOLD + Font.ITALIC,30));
		lab4.setFont(new Font("Verdana",Font.BOLD + Font.ITALIC,30));
		lab5.setFont(new Font("Verdana",Font.BOLD + Font.ITALIC,30));
		lab6.setFont(new Font("Verdana",Font.BOLD + Font.ITALIC,30));
		lab7.setFont(new Font("Verdana",Font.BOLD + Font.ITALIC,30));
		lab8.setFont(new Font("Verdana",Font.BOLD + Font.ITALIC,30));
		lab9.setFont(new Font("Verdana",Font.BOLD + Font.ITALIC,30));
		
		sc1.setFont(new Font("Verdana",Font.BOLD + Font.ITALIC,30));
		sc2.setFont(new Font("Verdana",Font.BOLD + Font.ITALIC,30));
		sc3.setFont(new Font("Verdana",Font.BOLD + Font.ITALIC,30));
		sc4.setFont(new Font("Verdana",Font.BOLD + Font.ITALIC,30));
		sc5.setFont(new Font("Verdana",Font.BOLD + Font.ITALIC,30));
		sc6.setFont(new Font("Verdana",Font.BOLD + Font.ITALIC,30));
		sc7.setFont(new Font("Verdana",Font.BOLD + Font.ITALIC,30));
		sc8.setFont(new Font("Verdana",Font.BOLD + Font.ITALIC,30));
		sc9.setFont(new Font("Verdana",Font.BOLD + Font.ITALIC,30));
		
		panel1.setBackground(new Color(255, 102, 0));
		panel2.setBackground(new Color(204, 102, 0));
		panel3.setBackground(new Color(204, 102, 153));
		panel4.setBackground(new Color(153, 102, 255));
		panel5.setBackground(new Color(153, 153, 204));
		panel6.setBackground(new Color(102, 153, 204));
		panel7.setBackground(new Color(51, 153, 255));
		panel8.setBackground(new Color(51, 204, 153));
		panel9.setBackground(new Color(51, 204, 102));
		
		panel1.add(lab1);
		panel1.add(sc1);
		panel2.add(lab2);
		panel2.add(sc2);
		panel3.add(lab3);
		panel3.add(sc3);
		panel4.add(lab4);
		panel4.add(sc4);
		panel5.add(lab5);
		panel5.add(sc5);
		panel6.add(lab6);
		panel6.add(sc6);	
		panel7.add(lab7);
		panel7.add(sc7);	
		panel8.add(lab8);
		panel8.add(sc8);
		panel9.add(lab9);
		panel9.add(sc9);
		
		add(panel1);
		add(panel2);
		add(panel3);
		add(panel4);
		add(panel5);
		add(panel6);
		add(panel7);
		add(panel8);
		add(panel9);
		
		Score temp = this;
		JPanel last = new JPanel(); 
		JButton scoretable = new JButton("Main");
		scoretable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				parentFrame.getContentPane().remove(temp);
				parentFrame.getContentPane().add(new Chooselist(parentFrame));
				parentFrame.pack();
				parentFrame.setVisible(true);
			}
		});
		scoretable.setPreferredSize(new Dimension(180, 50));
		scoretable.setFont(new Font("Verdana",Font.BOLD,40));
		scoretable.setForeground(Color.RED);
		JButton reset = new JButton("Reset");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p.reset();
				sc1.setText(""+p.getScore(0));
				sc2.setText(""+p.getScore(1));
				sc3.setText(""+p.getScore(2));
				sc4.setText(""+p.getScore(3));
				sc5.setText(""+p.getScore(4));
				sc6.setText(""+p.getScore(5));
				sc7.setText(""+p.getScore(6));
				sc8.setText(""+p.getScore(7));
				sc9.setText(""+p.getScore(8));
				repaint();
			}
		});
		reset.setPreferredSize(new Dimension(180, 50));
		reset.setFont(new Font("Verdana",Font.BOLD,40));
		reset.setForeground(Color.RED);
		last.add(scoretable);
		last.add(reset);
		last.setBackground(new Color(60, 179, 113));
		add(last);
		
		setPreferredSize(new Dimension(400,700));	
	}

}
