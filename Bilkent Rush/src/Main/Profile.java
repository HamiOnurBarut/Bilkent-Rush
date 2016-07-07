package Main;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

import javax.swing.*;


public class Profile extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame parentFrame;
	private String nickname;
	private ProfileData data;
	
	public Profile(JFrame parentFrame){
		data = new ProfileData();
		this.parentFrame = parentFrame;
		try{	
		getNickname(data);}
		catch (IOException e)
		{}
		ProfilePage();
	}
	public void ProfilePage(){
		final Profile temp = this;
		setBackground(Color.LIGHT_GRAY);
		
		JPanel p1 = new JPanel();
		JLabel profile = new JLabel();
		profile.setText("PROFILE");
		profile.setFont(new Font("Verdana", Font.BOLD, 45));
		profile.setForeground(Color.BLACK);
		profile.setBackground(Color.WHITE);
		p1.setBackground(Color.LIGHT_GRAY);
		p1.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
		p1.add(profile);
		 
		JPanel p2 = new JPanel();
		JLabel name1 = new JLabel();
		name1.setText("Nickname: ");
		name1.setFont(new Font("Verdana", Font.BOLD, 30));
		name1.setForeground(Color.BLACK);
		name1.setBackground(Color.WHITE);
		JLabel name2 = new JLabel("");
		name2.setText(nickname);
		name2.setFont(new Font("Verdana", Font.BOLD + Font.ITALIC, 30));
		name2.setForeground(Color.RED);
		name2.setBackground(Color.WHITE);
		p2.add(name1);
		p2.add(name2);
		p2.setBackground(Color.LIGHT_GRAY);
		
		JPanel trophy = new JPanel();
		trophy.setLayout(new GridLayout(3,3));
		
		JLabel t1 = new JLabel();
		JLabel t2 = new JLabel();
		JLabel t3 = new JLabel();
		JLabel t4 = new JLabel();
		JLabel t5 = new JLabel();
		JLabel t6 = new JLabel();
		JLabel t7 = new JLabel();
		JLabel t8 = new JLabel();
		JLabel t9 = new JLabel();
		
		data.checktrophy(t1,t2,t3,t4,t5,t6,t7,t8,t9);

		trophy.add(t1);
		trophy.add(t2);
		trophy.add(t3);
		trophy.add(t4);
		trophy.add(t5);
		trophy.add(t6);
		trophy.add(t7);
		trophy.add(t8);
		trophy.add(t9);
		trophy.setBackground(Color.LIGHT_GRAY);
		trophy.setPreferredSize(new Dimension(400,400));
		
		JPanel p4 = new JPanel();
		JButton b1 = new JButton();
		b1.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				p4.hide();
				setNickname(p4,name2,data);			
			}
		});
		b1.setText("EDIT");
		b1.setFont(new Font("Verdana",Font.BOLD ,30));
		b1.setAlignmentX(Component.CENTER_ALIGNMENT);
		b1.setPreferredSize(new Dimension(190, 50));
		b1.setForeground(Color.RED);
		p4.add(b1);
		
		JButton b2 = new JButton();
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				parentFrame.getContentPane().remove(temp);
				parentFrame.getContentPane().add(new Menu(parentFrame));
				parentFrame.pack();
				parentFrame.setVisible(true);
			}
		});
		b2.setText("BACK");
		b2.setFont(new Font("Verdana",Font.BOLD ,30));
		b2.setAlignmentX(Component.CENTER_ALIGNMENT);
		b2.setPreferredSize(new Dimension(190, 50));
		b2.setForeground(Color.RED);
		p4.add(b2);
		p4.setBackground(Color.LIGHT_GRAY);
		
		add(p1);
		add(Box.createRigidArea(new Dimension(0,100)));
		add(p2);
		add(trophy);
		add(p4);
		setPreferredSize(new Dimension(400,700));
	}
	public void getNickname(ProfileData data) throws IOException{
		nickname = data.getNickName();
	}
	
	public void setNickname(JPanel p4,JLabel name2,ProfileData data){
		 JPanel panel = new JPanel();
		 panel.setLayout(new BorderLayout());
		 JTextField field = new JTextField(10);
		 field.setFont(new Font("Verdana", Font.BOLD, 30));
		 field.setForeground(Color.BLACK);
		 field.setBackground(Color.WHITE);	 
		 panel.add(field,BorderLayout.NORTH);
		 JButton done = new JButton();
		 done.addActionListener(new ActionListener() {
				@SuppressWarnings("deprecation")
				public void actionPerformed(ActionEvent e) {
					nickname = field.getText();
					name2.setText(nickname + " ");
					data.setNickName(nickname);
					panel.hide();
					p4.show();
				}
		 });
		 done.setText("Done");
		 done.setFont(new Font("Verdana",Font.BOLD ,30));
		 done.setAlignmentX(Component.CENTER_ALIGNMENT);
		 done.setPreferredSize(new Dimension(190, 50));
		 done.setForeground(Color.RED);
		 panel.add(done,BorderLayout.SOUTH);
		 panel.setBackground(Color.LIGHT_GRAY);
		 add(panel);
	 
	}
}
