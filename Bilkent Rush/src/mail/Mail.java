package mail;
import java.util.*;

import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.JLabel;

public class Mail {
			   
	protected String from = "bilkentrush"; 
	protected String pass = "zKTRx437";
	protected String RECIPIENT = "bilkentrush@gmail.com";
	private JLabel head;

	public Mail(String subject ,String body, JLabel head){
		this.head = head;
	
		sendFromGMail(from, pass,subject, body);
		}
		
	private  void sendFromGMail(String from, String pass, String subject, String body){ 
		Properties props = System.getProperties();
		String host = "smtp.gmail.com";
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.user", from);
		props.put("mail.smtp.password", pass);
		props.put("mail.smtp.port", "587");
		props.put("mail.smtp.auth", "true");
		
		Session session = Session.getDefaultInstance(props);
		MimeMessage message = new MimeMessage(session);
	
		try {
			message.setFrom(new InternetAddress(from));
			InternetAddress toAddress = new InternetAddress(RECIPIENT);
			message.addRecipient(Message.RecipientType.TO, toAddress);
		
			message.setSubject(subject);
			message.setText(body);
			Transport transport = session.getTransport("smtp");
			transport.connect(host, from, pass);
			transport.sendMessage(message, message.getAllRecipients());
			transport.close();
		}
		catch (AddressException ae) {
			ae.printStackTrace();
		}
		catch (MessagingException me) {
			head.setText("No Internet");
		}
		
		
	}
}	
			
			