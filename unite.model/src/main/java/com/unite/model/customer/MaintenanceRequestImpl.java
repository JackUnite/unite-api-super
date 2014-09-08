package com.unite.model.customer;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
@XmlType (propOrder={"Description","ExpectedCompletiong","Id","Location","Recorded","Service","Status"})

public class MaintenanceRequestImpl implements MaintenanceRequest {
	
	@XmlElement (name="Description")
	private String description;
	@XmlElement (name="ExpectedCompletion")
	private int expectedCompletion;
	@XmlElement (name="Id")
	private int id;
	@XmlElement (name="Location")
	private String location;
	@XmlElement (name="Recorded")
	private int recorded;
	@XmlElement (name="Service")
	private String service;
	@XmlElement (name="Status")
	private String status;

	public MaintenanceRequestImpl (){
		super();
	}
	
	public MaintenanceRequestImpl (String description, int expectedCompletion, int id, String location, int recorded, String service, String status){
		this();
		this.description = description;
		this.expectedCompletion = expectedCompletion;
		this.id = id;
		this.location = location;
		this.recorded = recorded;
		this.service = service;
		this.status = status;
		
				
	}
	public String getDescription() {
		return description;
	}

	public int getExpectedCompletion() {
		return expectedCompletion;
	}

	public int getId() {
		return id;
	}

	public String getLocation() {
		return location;
	}

	public int getRecorded() {
		return recorded;
	}

	public String getService() {
		return service;
	}

	public String getStatus() {
		return status;
	}

	public void setDescription(String description) {
		this.description=description;
		
	}

	public void setExpectedCompletion(int expectedCompletion) {
		this.expectedCompletion=expectedCompletion;
		
	}

	public void setId(int id) {
		this.id=id;
		
	}

	public void setLocation(String location) {
		this.location=location;
		
	}

	public void setRecorded(int recorded) {
		this.recorded=recorded;
		
	}

	public void setService(String service) {
		this.service=service;
		
	}

	public void setStatus(String status) {
		this.status=status;
		
	}

	
}
