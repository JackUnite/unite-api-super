package com.unite.model.customer;

public interface NotificationType {
	
	String getColour();
	String getIconUrl();
	int getId();
	String getName();
	boolean getOptedIn();
	//String getTags(); //Multiple Strings, should this be a list?
	
	
	void setColour(String colour);
	void setIconUrl(String iconUrl);
	void setId(int id);
	void setName(String name);
	void setOptedIn(String optedIn); 
	//String putTags(); //Multiple Strings, should this be a list?
}
