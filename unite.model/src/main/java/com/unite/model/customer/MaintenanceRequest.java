package com.unite.model.customer;

public interface MaintenanceRequest {
	
	String getDescription();
	int getExpectedCompletion();
	int getId();
	String getLocation();
	int getRecorded();
	String getService();
	String getStatus();
		
	void setDescription(String description);
	void setExpectedCompletion(int expectedCOmpletion);
	void setId(int id);
	void setLocation(String location);
	void setRecorded(int recorded);
	void setService(String service);
	void setStatus(String status);
	
}
