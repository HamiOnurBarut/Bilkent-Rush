package mail;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import Main.Menu;

public class SendQuestion extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JFrame parentFrame;
	private String Question = "Question";
	private String Answer ="Answer";
	
	public SendQuestion(JFrame parentFrame){
		this.parentFrame = parentFrame;
		QuestionSend();
	}
	public void QuestionSend(){
		final SendQuestion temp = this;
		setBackground(Color.LIGHT_GRAY);
		
		JPanel p1 = new JPanel();
		JLabel head = new JLabel();
		head.setText("Send Question");
		head.setFont(new Font("Verdana", Font.BOLD, 45));
		head.setForeground(Color.BLACK);
		head.setBackground(Color.WHITE);
		p1.setBackground(Color.LIGHT_GRAY);
		p1.add(head);
		
		JPanel p2 = new JPanel();
		JTextArea question = new JTextArea("Question...",12,16);
		question.setFont(new Font("Verdana", Font.BOLD, 20));
		question.setForeground(Color.BLUE);
		question.setBackground(Color.WHITE);
		question.setLineWrap(true);
		JTextArea answer = new JTextArea("Answer...",5,16);
		answer.setFont(new Font("Verdana", Font.BOLD, 20));
		answer.setForeground(Color.BLUE);
		answer.setBackground(Color.WHITE);
		answer.setLineWrap(true);
		
		p2.setBackground(Color.LIGHT_GRAY);
		p2.setLayout(new BorderLayout());
		p2.add(question,BorderLayout.NORTH);
		p2.add(Box.createRigidArea(new Dimension(0,20)));
		p2.add(answer,BorderLayout.SOUTH);

		JPanel p3 = new JPanel();
		JButton b1 = new JButton();
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Question = question.getText();
			Answer = answer.getText();
			String body = "QUESTION:  " + Question + "\n  ANSWER:  " + Answer; 
			head.setText("!!DONE!!");
			head.setForeground(Color.RED);
			String subject = "Fresh Question";
			new Mail(subject,body,head);
			
			}
		});
		b1.setText("SEND");
		b1.setFont(new Font("Verdana",Font.BOLD ,30));
		b1.setAlignmentX(Component.CENTER_ALIGNMENT);
		b1.setPreferredSize(new Dimension(180, 100));
		b1.setForeground(Color.RED);
		p3.add(b1);
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
		p3.setBackground(Color.LIGHT_GRAY);
		p3.add(b2);
		
		add(p1);
		add(p2);
		add(p3);
		setPreferredSize(new Dimension(400,700));
	}
}
