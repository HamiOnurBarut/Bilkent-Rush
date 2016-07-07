package Main;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MainPageName extends JPanel{

	private JFrame parentFrame;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MainPageName(JFrame parentFrame) {
		this.parentFrame = parentFrame;
		mainPage();
	}
		
		public void mainPage()
		{
			
		setBackground(Color.BLACK);  
		
		setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		final MainPageName temp = this;
		
		Font font = new Font("Verdana", Font.BOLD, 45);
		
		JLabel name1 = new JLabel("BILKENT ");
		JLabel name2 = new JLabel("   RUSH");
	  	
		name1.setFont(font);
		name1.setForeground(Color.RED);
		name2.setFont(font);
		name2.setForeground(Color.BLUE);
		name1.setAlignmentX(Component.CENTER_ALIGNMENT);
		name2.setAlignmentX(Component.CENTER_ALIGNMENT);
		add(Box.createRigidArea(new Dimension(0,80)));
		add(name1);
		add(name2);
		add(Box.createRigidArea(new Dimension(0,50)));
		
		JButton start = new JButton("START");
		start.setAlignmentX(Component.CENTER_ALIGNMENT);
		start.setFont(new Font("Verdana",Font.BOLD + Font.ITALIC,55));
		start.setPreferredSize(new Dimension(200, 100));
		start.setForeground(Color.RED);
		add(start);
		add(Box.createRigidArea(new Dimension(0,20)));
		
		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				parentFrame.getContentPane().remove(temp);
				parentFrame.getContentPane().add(new Menu(parentFrame));
				parentFrame.pack();
				parentFrame.setVisible(true);
				
			}
		});
		
		JLabel lblNewLabel = new JLabel("");
		
		lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		Image img = new ImageIcon(this.getClass().getResource("rsz_1bilkentlog.png")).getImage(); 
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		add(lblNewLabel);
		
		setPreferredSize(new Dimension(400,700));
	 }
	

}
