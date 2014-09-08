package com.unite.model.customer;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
@XmlType (propOrder={"Colour","IconUrl","Id","Name","OptedIn","Tags"})

public class NotificationTypeImpl implements NotificationType {
	
	@XmlElement (name="Colour")
	private String colour;
	@XmlElement (name="IconUrl")
	private String iconUrl;
	@XmlElement (name="Id")
	private int id;
	@XmlElement (name="Name")
	private String name;
	@XmlElement (name="OptedIn")
	private boolean optedIn;
	@XmlElement (name="Tags")
	private String tags;
	
	public NotificationTypeImpl (){
		super();
	}
	
	public NotificationTypeImpl (String colour, String iconUrl, int id, String name, boolean optedIn, String tags ){
		this();
		this.colour = colour;
		this.iconUrl = iconUrl;
		this.id = id;
		this.name = name;
		this.optedIn = optedIn;
		this.tags = tags;
		
		
	}
	
	public String getColour() {
		return colour;
	}

	public String getIconUrl() {
			return iconUrl;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		
		return null;
	}

	public boolean getOptedIn() {
		return optedIn;
			 
		
	}

	public String getTags() {
		return tags;
	}

	public void setColour(String colour) {
		this.colour=colour;
	}

	public void setIconUrl(String iconUrl) {
		this.iconUrl=iconUrl;
	}

	public void setId(int id) {
		this.id=id;
		
	}

	public void setName(String name) {
		this.name=name;
	}

	public void setOptedIn(String optedIn) {
		this.optedIn="opted in".equals(optedIn);
		
	}

	public String putTags() {
		// TODO Auto-generated method stub
		return null;
	}

	
	

	

}
