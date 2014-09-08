package com.unite.model.customer;

public interface Location {
	
	int getId();
	String getName();
	String getlocationType();

	void setId(int id);
	void setName(String name);
	void setLocationType(String locationType);
}
