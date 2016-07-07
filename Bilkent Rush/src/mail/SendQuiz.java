package mail;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import Main.Menu;

@SuppressWarnings("serial")
public class SendQuiz extends JPanel{
	
	private JFrame parentFrame;
	private String Quiz = "Quiz";
	private String Answers ="Answers";
	private int correctone;
	private JRadioButton button1,button2,button3,button4;
	
	public SendQuiz(JFrame parentFrame){
		this.parentFrame = parentFrame;
		QuizSend();
	}
	public void QuizSend(){
		final SendQuiz temp = this;
		setBackground(Color.LIGHT_GRAY);
		
		JPanel p1 = new JPanel();
		JLabel head = new JLabel();
		head.setText(" Send Quiz ");
		head.setFont(new Font("Verdana", Font.BOLD, 45));
		head.setForeground(Color.BLACK);
		p1.setBackground(Color.LIGHT_GRAY);
		p1.add(head);
		
		JPanel p2 = new JPanel();
		JTextArea question = new JTextArea(" Question...",10,16);
		question.setFont(new Font("Verdana", Font.BOLD, 20));
		question.setForeground(Color.BLUE);
		question.setBackground(Color.WHITE);
		question.setLineWrap(true);
		p2.setBackground(Color.LIGHT_GRAY);
		p2.add(question);
		
		JPanel p3 =new JPanel();
		JTextArea answer1 = new JTextArea(" Answer1...",3,11);
		answer1.setFont(new Font("Verdana", Font.BOLD, 15));
		answer1.setLineWrap(true);
		answer1.setForeground(Color.BLUE);
		answer1.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,2));
		
		JTextArea answer2 = new JTextArea(" Answer2...",3,11);
		answer2.setFont(new Font("Verdana", Font.BOLD, 15));
		answer2.setLineWrap(true);
		answer2.setForeground(Color.BLUE);
		answer2.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,2));
		
		JTextArea answer3 = new JTextArea(" Answer3...",3,11);
		answer3.setFont(new Font("Verdana", Font.BOLD, 15));
		answer3.setLineWrap(true);
		answer3.setForeground(Color.BLUE);
		answer3.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,2));
		
		JTextArea answer4 = new JTextArea(" Answer4...",3,11);
		answer4.setFont(new Font("Verdana", Font.BOLD, 15));
		answer4.setLineWrap(true);
		answer4.setForeground(Color.BLUE);
		answer4.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,2));
		
		p3.setBackground(Color.LIGHT_GRAY);
		p3.setLayout(new GridLayout(2,2));
		p3.add(answer1);
		p3.add(answer2);
		p3.add(answer3);
		p3.add(answer4);

		JPanel p4 = new JPanel();
		JLabel label = new JLabel("Which one is true?");
		label.setFont(new Font("Verdana", Font.BOLD, 15));
		label.setForeground(Color.BLACK);
		p4.add(label);
		button1 = new JRadioButton("1.");
		button2 = new JRadioButton("2.");
		button3 = new JRadioButton("3.");
		button4 = new JRadioButton("4.");
		
		button1.setFont(new Font("Verdana", Font.BOLD, 15));
		button2.setFont(new Font("Verdana", Font.BOLD, 15));
		button3.setFont(new Font("Verdana", Font.BOLD, 15));
		button4.setFont(new Font("Verdana", Font.BOLD, 15));
		
		ButtonGroup group = new ButtonGroup();
		group.add(button1);
		group.add(button2);
		group.add(button3);
		group.add(button4);
		
		ButtonListener listener = new ButtonListener();
		button1.addActionListener(listener);
		button2.addActionListener(listener);
		button3.addActionListener(listener);
		button4.addActionListener(listener);
		
		p4.setBackground(Color.LIGHT_GRAY);
		p4.add(button1);
		p4.add(button2);
		p4.add(button3);
		p4.add(button4);
		
		JPanel p5 = new JPanel();
		JButton b1 = new JButton();
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Quiz = question.getText();
			Answers = "A1: " + answer1.getText() + "A2: " + answer2.getText() + "A3: " + answer3.getText() + "A4: " + answer4.getText();
			String subject = "Fresh Quiz";
			String body = "QUIZ:  " + Quiz + "\n  ANSWERS:  " + Answers + "TRUE ANSWER: " + correctone; 
			if(correctone!=0){
				head.setText("!!DONE!!");
				head.setForeground(Color.RED);
				new Mail(subject,body,head);
				}
			else
				label.setForeground(Color.MAGENTA);
				button1.setForeground(Color.CYAN);
				button2.setForeground(Color.RED);
				button3.setForeground(Color.CYAN);
				button4.setForeground(Color.RED);
			}
		});
		b1.setText("SEND");
		b1.setFont(new Font("Verdana",Font.BOLD ,30));
		b1.setAlignmentX(Component.CENTER_ALIGNMENT);
		b1.setPreferredSize(new Dimension(180, 100));
		b1.setForeground(Color.RED);
		p5.add(b1);
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
		b2.setPreferredSize(new Dimension(180, 100));
		b2.setForeground(Color.RED);
		p5.setBackground(Color.LIGHT_GRAY);
		p5.add(b2);
		
		add(p1);
		add(p2);
		add(p3);
		add(p4);
		add(p5);
		setPreferredSize(new Dimension(400,700));
	}
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			Object source = e.getSource();
			if (source == button1)
				correctone = 1;
			else if (source == button2)
			correctone = 2;
			else if (source == button3)
				correctone = 3;
			else if (source == button4)
				correctone = 4;
			else
				correctone = 0;
		}
	}
}
