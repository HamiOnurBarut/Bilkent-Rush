package Quiz;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.swing.*;
import Methods.Chooselist;
import Score.AddScore;

public class Quiz extends JPanel {

	@SuppressWarnings("unused")
	private JFrame parentFrame;
	private int type;
	private String methodname;
	private String datafile;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3L;

	public Questions ask;
	
	public Quiz(JFrame parentFrame,int type) 
	{
		final Quiz temp = this;
		this.parentFrame = parentFrame;	
		this.type = type;
		try {
			ask = new Questions(checktype());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		AddScore point = new AddScore();
		
		JPanel p1 = new JPanel();
		JLabel name = new JLabel(methodname);
		name.setFont(new Font("Verdana",Font.BOLD ,20));
		name.setAlignmentX(Component.CENTER_ALIGNMENT);
		name.setForeground(Color.GRAY);
		name.setPreferredSize(new Dimension(250, 50));
		p1.add(name);
		
		JButton end1 = new JButton("MAIN");
		end1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				parentFrame.getContentPane().remove(temp);
				parentFrame.getContentPane().add(new Chooselist(parentFrame));
				parentFrame.pack();
				parentFrame.setVisible(true);
			}
		});
		end1.setPreferredSize(new Dimension(60, 50));
		end1.setFont(new Font("Verdana",Font.BOLD,10));
		end1.setForeground(Color.RED);
		JButton hint = new JButton("HINT");
		hint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		hint.setPreferredSize(new Dimension(60, 50));
		hint.setFont(new Font("Verdana",Font.BOLD,10));
		hint.setForeground(Color.RED);
		p1.add(end1);
		p1.add(hint);
		
		JPanel p2 = new JPanel();
		JProgressBar progressBar = new JProgressBar();
		progressBar.setPreferredSize(new Dimension(300, 50));
		p2.add(progressBar);
		
		JPanel p3 = new JPanel();
		JLabel question = new JLabel();
		question.setText(ask.getQuestion());
		question.setFont(new Font("Verdana",Font.BOLD ,10));
		question.setAlignmentY(Component.CENTER_ALIGNMENT);
		question.setForeground(Color.GRAY);
		question.setPreferredSize(new Dimension(400, 50));
		p3.add(question);
		
		JPanel p4 = new JPanel();
		JLabel picture = new JLabel("");
		picture.setAlignmentX(Component.CENTER_ALIGNMENT);
		Image img = new ImageIcon(this.getClass().getResource(ask.addImage())).getImage(); 
		picture.setIcon(new ImageIcon(img));
		picture.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		picture.setBackground(Color.cyan);
		p4.add(picture);
		
		JPanel p5 = new JPanel();
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JButton b3 = new JButton();
		JButton b4 = new JButton();
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ask.checkAnswer1()==true){
					point.addPoint(type);
					System.out.println("1");
				}
				try {
					ask = new Questions(checktype());
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				retype(ask,question,img,picture,b1,b2,b3,b4);
			}
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ask.checkAnswer2()==true){
					point.addPoint(type);
					System.out.println("2");
				}
				try {
					ask = new Questions(checktype());
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				retype(ask,question,img,picture,b1,b2,b3,b4);
			}
		});
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ask.checkAnswer3()==true){
					point.addPoint(type);
					System.out.println("3");
				}
				try {
					ask = new Questions(checktype());
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				retype(ask,question,img,picture,b1,b2,b3,b4);
			}
		});
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ask.checkAnswer4()==true){
					point.addPoint(type);
					System.out.println("4");
				}
				try {
					ask = new Questions(checktype());
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				retype(ask,question,img,picture,b1,b2,b3,b4);
			}
		});

		p5.setLayout(new GridLayout(2,2));
		b1.setText(ask.getAnswer1());
		b2.setText(ask.getAnswer2());
		b3.setText(ask.getAnswer3());
		b4.setText(ask.getAnswer4());
		b1.setPreferredSize(new Dimension(150, 70));
		b2.setPreferredSize(new Dimension(150, 70));
		b3.setPreferredSize(new Dimension(150, 70));
		b4.setPreferredSize(new Dimension(150, 70));
		p5.add(b1);
		p5.add(b2);
		p5.add(b3);
		p5.add(b4);
		
		p1.setBackground(Color.WHITE);  
		p2.setBackground(Color.WHITE);  
		p3.setBackground(Color.WHITE);  
		p4.setBackground(Color.WHITE);  
		p5.setBackground(Color.WHITE);  
		
		add(p1);
		add(p2);
		add(p3);
		add(p4);
		add(p5);
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(400,700));
	}
	public String checktype()
	{
		if(type == 0)
		{
			methodname = "BUILDINGS";
			datafile = "Data/Buildings.csv";
		}
		if(type == 1)
		{
			methodname = "COURSES";
			datafile = "Data/Courses.csv";
		}
		if(type == 2)
		{
			methodname = "DORMS";
			datafile = "Data/Dorms.csv";
		}
		if(type == 3)
		{
			methodname = "TRAFFIC";
			datafile = "Data/Traffic.csv";
		}
		if(type == 4)
		{
			methodname = "MEAL PLACES";
			datafile = "Data/Meal Places.csv";
		}
		if(type == 5)
		{
			methodname = "BUSES";
			datafile = "Data/Buses.csv";
		}
		if(type == 6)
		{
			methodname = "INSTRUCTORS";
			datafile = "Data/Instructors.csv";
		}
		if(type == 7)
		{
			methodname = "STAFF";
			datafile = "Data/Staff.csv";
		}
		if(type == 8)
		{
			methodname = "SHOPPING";
			datafile =  "Data/Shopping.csv";
		}
		return datafile;
	}
	public void retype(Questions ask,JLabel question,Image img,JLabel picture, JButton b1,JButton b2, JButton b3, JButton b4)
	{
		
		question.setText(ask.getQuestion());
		img = new ImageIcon(this.getClass().getResource(ask.addImage())).getImage();
		picture.setIcon(new ImageIcon(img));
		b1.setText(ask.getAnswer1());
		b2.setText(ask.getAnswer2());
		b3.setText(ask.getAnswer3());
		b4.setText(ask.getAnswer4());
	}
}
