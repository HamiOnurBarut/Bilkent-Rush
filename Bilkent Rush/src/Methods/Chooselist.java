package Methods;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Quiz.Quiz;
import Score.Score;
import Main.Menu;

public class Chooselist extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;

	@SuppressWarnings("unused")
	private JFrame parentFrame;
	
	public Chooselist(JFrame parentFrame){
		this.parentFrame = parentFrame;

		setVisible(true);
		setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		setBackground(Color.WHITE);
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		JPanel p5 = new JPanel();
		JPanel p6 = new JPanel();
		JPanel p7 = new JPanel();
		JPanel p8 = new JPanel();
		JPanel p9 = new JPanel();
		
		final Chooselist temp = this;
		
		JButton bt1 = new JButton("BUILDINGS");
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				parentFrame.getContentPane().remove(temp);
				parentFrame.getContentPane().add(new Quiz(parentFrame,0));
				parentFrame.pack();
				parentFrame.setVisible(true);
			}
		});
		bt1.setBackground(new Color(255, 102, 0));
		
		JButton bt2 = new JButton("COURSES");
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				parentFrame.getContentPane().remove(temp);	
				parentFrame.getContentPane().add(new Quiz(parentFrame,1));
				parentFrame.pack();
				parentFrame.setVisible(true);
			}
		});
		bt2.setBackground(new Color(204, 102, 0));
		
		JButton bt3 = new JButton("DORMS");
		bt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				parentFrame.getContentPane().remove(temp);
				parentFrame.getContentPane().add(new Quiz(parentFrame,2));
				parentFrame.pack();
				parentFrame.setVisible(true);
			}
		});
		bt3.setBackground(new Color(204, 102, 153));
		
		JButton bt4 = new JButton("TRAFFIC");
		bt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				parentFrame.getContentPane().remove(temp);
				parentFrame.getContentPane().add(new Quiz(parentFrame,3));
				parentFrame.pack();
				parentFrame.setVisible(true);
			}
		});
		bt4.setBackground(new Color(153, 102, 255));
		
		JButton bt5 = new JButton("MEAL PLACES");
		bt5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				parentFrame.getContentPane().remove(temp);
				parentFrame.getContentPane().add(new Quiz(parentFrame,4));
				parentFrame.pack();
				parentFrame.setVisible(true);
			}
		});
		bt5.setBackground(new Color(153, 153, 204));
		
		JButton bt6 = new JButton("BUSES");
		bt6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				parentFrame.getContentPane().remove(temp);
				parentFrame.getContentPane().add(new Quiz(parentFrame,5));
				parentFrame.pack();
				parentFrame.setVisible(true);
			}
		});
		bt6.setBackground(new Color(102, 153, 204));
	
		JButton bt7 = new JButton("INSTRUCTORS");
		bt7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				parentFrame.getContentPane().remove(temp);
				parentFrame.getContentPane().add(new Quiz(parentFrame,6));
				parentFrame.pack();
				parentFrame.setVisible(true);
			}
		});
		bt7.setBackground(new Color(51, 153, 255));
		
		JButton bt8 = new JButton("STAFF");
		bt8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				parentFrame.getContentPane().remove(temp);
				parentFrame.getContentPane().add(new Quiz(parentFrame,7));
				parentFrame.pack();
				parentFrame.setVisible(true);
			}
		});
		bt8.setBackground(new Color(51, 204, 153));
		
		JButton bt9 = new JButton("SHOPPING");
		bt9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				parentFrame.getContentPane().remove(temp);
				parentFrame.getContentPane().add(new Quiz(parentFrame,8));
				parentFrame.pack();
				parentFrame.setVisible(true);
			}
		});
		bt9.setBackground(new Color(51, 204, 102));
		
		bt1.setOpaque(true);
		bt2.setOpaque(true);
		bt3.setOpaque(true);
		bt4.setOpaque(true);
		bt5.setOpaque(true);
		bt6.setOpaque(true);
		bt7.setOpaque(true);
		bt8.setOpaque(true);
		bt9.setOpaque(true);
		
		bt1.setAlignmentX(Component.CENTER_ALIGNMENT);
		bt2.setAlignmentX(Component.CENTER_ALIGNMENT);
		bt3.setAlignmentX(Component.CENTER_ALIGNMENT);
		bt4.setAlignmentX(Component.CENTER_ALIGNMENT);
		bt5.setAlignmentX(Component.CENTER_ALIGNMENT);
		bt6.setAlignmentX(Component.CENTER_ALIGNMENT);
		bt7.setAlignmentX(Component.CENTER_ALIGNMENT);
		bt8.setAlignmentX(Component.CENTER_ALIGNMENT);
		bt9.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		bt1.setFont(new Font("Verdana",Font.BOLD + Font.ITALIC,30));
		bt2.setFont(new Font("Verdana",Font.BOLD + Font.ITALIC,30));
		bt3.setFont(new Font("Verdana",Font.BOLD + Font.ITALIC,30));
		bt4.setFont(new Font("Verdana",Font.BOLD + Font.ITALIC,30));
		bt5.setFont(new Font("Verdana",Font.BOLD + Font.ITALIC,30));
		bt6.setFont(new Font("Verdana",Font.BOLD + Font.ITALIC,30));
		bt7.setFont(new Font("Verdana",Font.BOLD + Font.ITALIC,30));
		bt8.setFont(new Font("Verdana",Font.BOLD + Font.ITALIC,30));
		bt9.setFont(new Font("Verdana",Font.BOLD + Font.ITALIC,30));
		
		bt1.setPreferredSize(new Dimension(400, 50));
		bt2.setPreferredSize(new Dimension(400, 50));
		bt3.setPreferredSize(new Dimension(400, 50));
		bt4.setPreferredSize(new Dimension(400, 50));
		bt5.setPreferredSize(new Dimension(400, 50));
		bt6.setPreferredSize(new Dimension(400, 50));
		bt7.setPreferredSize(new Dimension(400, 50));
		bt8.setPreferredSize(new Dimension(400, 50));
		bt9.setPreferredSize(new Dimension(400, 50));
		
		bt1.setForeground(Color.GRAY);
		bt2.setForeground(Color.GRAY);
		bt3.setForeground(Color.GRAY);
		bt4.setForeground(Color.GRAY);
		bt5.setForeground(Color.GRAY);
		bt6.setForeground(Color.GRAY);
		bt7.setForeground(Color.GRAY);
		bt8.setForeground(Color.GRAY);
		bt9.setForeground(Color.GRAY);
		
		p1.add(bt1);
		p2.add(bt2);
		p3.add(bt3);
		p4.add(bt4);
		p5.add(bt5);
		p6.add(bt6);
		p7.add(bt7);
		p8.add(bt8);
		p9.add(bt9);
		
		p1.setBackground(new Color(255, 102, 0));
		p2.setBackground(new Color(204, 102, 0));
		p3.setBackground(new Color(204, 102, 153));
		p4.setBackground(new Color(153, 102, 255));
		p5.setBackground(new Color(153, 153, 204));
		p6.setBackground(new Color(102, 153, 204));
		p7.setBackground(new Color(51, 153, 255));
		p8.setBackground(new Color(51, 204, 153));
		p9.setBackground(new Color(51, 204, 102));
		
		add(p1);
		add(p2);
		add(p3);
		add(p4);
		add(p5);
		add(p6);
		add(p7);
		add(p8);
		add(p9);
		
		JPanel last = new JPanel(); 
		JButton scoretable = new JButton("Score");
		scoretable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				parentFrame.getContentPane().remove(temp);
				parentFrame.getContentPane().add(new Score(parentFrame));
				parentFrame.pack();
				parentFrame.setVisible(true);
			}
		});
		scoretable.setPreferredSize(new Dimension(180, 50));
		scoretable.setFont(new Font("Verdana",Font.BOLD,30));
		scoretable.setForeground(Color.RED);
		scoretable.setAlignmentX(Component.CENTER_ALIGNMENT);
		last.add(scoretable);
		
		JButton back = new JButton("Back");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				parentFrame.getContentPane().remove(temp);
				parentFrame.getContentPane().add(new Menu(parentFrame));
				parentFrame.pack();
				parentFrame.setVisible(true);
			}
		});
		back.setAlignmentX(Component.CENTER_ALIGNMENT);
		back.setPreferredSize(new Dimension(180, 50));
		back.setFont(new Font("Verdana",Font.BOLD,30));
		back.setForeground(Color.RED);
		last.add(back);
		last.setBackground(new Color(60, 179, 113));
		
		add(last);
		setPreferredSize(new Dimension(400,700));
	}
	

}
