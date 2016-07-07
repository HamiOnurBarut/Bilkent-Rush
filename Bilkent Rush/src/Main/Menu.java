package Main;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import mail.SendQuestion;
import mail.SendQuiz;
import Methods.Chooselist;


public class Menu extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JFrame parentFrame;
	
	public Menu(JFrame parentFrame){
		this.parentFrame = parentFrame;		
		menu();
	}	
	public void menu(){
		
		final Menu temp = this;
		
		setBackground(Color.DARK_GRAY);  
		setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		
		JLabel label = new JLabel();
		label.setText("Bilkent Rush");
		label.setFont(new Font("Verdana", Font.BOLD, 45));
		label.setForeground(Color.WHITE);
		label.setAlignmentX(Component.CENTER_ALIGNMENT);
		add(Box.createRigidArea(new Dimension(0,40)));
		add(label);
		add(Box.createRigidArea(new Dimension(0,100)));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);  
		JButton b1 = new JButton();
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				parentFrame.getContentPane().remove(temp);
				parentFrame.getContentPane().add(new Chooselist(parentFrame));
				parentFrame.pack();
				parentFrame.setVisible(true);
			}
		});
		b1.setText("PLAY");
		b1.setFont(new Font("Verdana",Font.BOLD ,50));
		b1.setAlignmentX(Component.CENTER_ALIGNMENT);
		b1.setPreferredSize(new Dimension(200, 100));
		b1.setForeground(Color.RED);
		panel.add(b1);
		
		JButton b2 = new JButton();
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				parentFrame.getContentPane().remove(temp);
				parentFrame.getContentPane().add(new SendQuestion(parentFrame));
				parentFrame.pack();
				parentFrame.setVisible(true);
			}
		});
		b2.setText("Send Your Question");
		b2.setFont(new Font("Verdana",Font.BOLD ,30));
		b2.setAlignmentX(Component.CENTER_ALIGNMENT);
		b2.setPreferredSize(new Dimension(400, 100));
		b2.setForeground(Color.RED);
		panel.add(b2);
		
		JButton b3 = new JButton();
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				parentFrame.getContentPane().remove(temp);
				parentFrame.getContentPane().add(new SendQuiz(parentFrame));
				parentFrame.pack();
				parentFrame.setVisible(true);
			}
		});
		b3.setText("Send Your Quiz");
		b3.setFont(new Font("Verdana",Font.BOLD ,30));
		b3.setAlignmentX(Component.CENTER_ALIGNMENT);
		b3.setPreferredSize(new Dimension(400, 100));
		b3.setForeground(Color.RED);
		panel.add(b3);
		
		JButton p4 = new JButton();
		p4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				parentFrame.getContentPane().remove(temp);
				parentFrame.getContentPane().add(new Profile(parentFrame));
				parentFrame.pack();
				parentFrame.setVisible(true);
			}
		});
		p4.setText("Profile");
		p4.setFont(new Font("Verdana",Font.BOLD ,30));
		p4.setAlignmentX(Component.CENTER_ALIGNMENT);
		p4.setPreferredSize(new Dimension(200, 100));
		p4.setForeground(Color.RED);
		panel.add(p4);
		
		JButton p5 = new JButton();
		p5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				parentFrame.getContentPane().remove(temp);
				System.exit(0);
			}
		});
		p5.setText("EXIT");
		p5.setFont(new Font("Verdana",Font.BOLD ,30));
		p5.setAlignmentX(Component.CENTER_ALIGNMENT);
		p5.setPreferredSize(new Dimension(200, 50));
		p5.setForeground(Color.RED);
		panel.add(p5);

		add(panel);
		setPreferredSize(new Dimension(400,700));
	}
}
