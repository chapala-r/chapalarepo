package com.user.helper;

import java.io.IOException;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.MimeMessage;

public class MailHelper {
	private Properties props;
	private Session session;
	
	public MailHelper(String mailConfiguration) throws IOException {
		props=new Properties();
		props.load(getClass().getClassLoader().getResourceAsStream(mailConfiguration));
		
		session=Session.getInstance(props,new Authenticator() {

			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(props.getProperty("mail.smtp.user"),props.getProperty("mail.smtp.password"));
			}	
		});	
	}
	public void sendMail(String from,String toAddress,String subject,String body) throws MessagingException {
		MimeMessage mimeMessage=null;
		
		mimeMessage=new MimeMessage(session);
		mimeMessage.setFrom(from);
		mimeMessage.setRecipients(RecipientType.TO,toAddress);
		mimeMessage.setSubject(subject);
		mimeMessage.setText(body);
		
		Transport.send(mimeMessage);
	}

}
