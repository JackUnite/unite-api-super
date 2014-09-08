package com.unite.model.customer;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
@XmlType (propOrder={"Colour","Date","Email","Id","Message","MessageHeading","NotifactionType","Phone","WebAddress"})

public class NotificationImpl implements Notification {

	@XmlElement (name="Colour")
	private String colour;
	@XmlElement (name="Date")
	private int date;
	@XmlElement (name="Email")
	private String email;
	@XmlElement (name="Id")
	private int id;
	@XmlElement (name="Message")
	private String message;
	@XmlElement (name="MessageHeading")
	private String messageHeading;
	@XmlElement (name="NotificationType")
	private String notifactionType;
	@XmlElement (name="Phone")
	private String phone;
	@XmlElement (name="WebAddress")
	private String webAddress;
	
	public NotificationImpl (){
		super();
	} 
	
	public NotificationImpl (String colour, int date, String email, int id, String message, String messageHeading, String notifactionType, String phone, String webAddress){
	
	this();
	this.colour = colour;
	this.date = date;
	this.email = email;
	this.id = id;
	this.message = message;
	this.messageHeading = messageHeading;
	this.notifactionType = notifactionType;
	this.phone = phone;
	this.webAddress = webAddress;
	
	
			
		
	}
	
	
	
	
	
	
	public String getColour() {
			return colour;
	}

	public int getDate() {
		return date;
	}

	public String getEmail() {
		return email;
	}

	public int getId() {
		return id;
	}

	public String getMessage() {
		return message;
	}

	public String getMessageHeading() {
		return messageHeading;
	}

	public String getNotificationType() {
		return notifactionType;
	}

	public String getPhone() {
		return phone;
	}

	public String getWebAddress() {
		return webAddress;
	}

}
