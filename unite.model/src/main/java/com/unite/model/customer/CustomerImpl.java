package com.unite.model.customer;

import java.util.*;

import javax.xml.bind.annotation.*;

@XmlRootElement (name="Customer")
@XmlType (propOrder={"GivenName","FamilyName","HasAnActiveBooking","CustomerId","BuildingName","Email",
					 "University","HomeCountry","Course","TenancyType","CurrentLocation","AcademicYear"})


public class CustomerImpl implements Customer {
	
	public CustomerImpl(){
	 super();
	}
	
	private String givenName; //changing the JSON to Pojo
	public String getGivenName() {
	return givenName;
	}
	public void setGivenName(String givenName){
		this.givenName=givenName;
	}
	
	private String familyName;
	public String getFamilyName() {
	return familyName;
	}
	public void setFamilyName( String familyName){
		this.familyName=familyName;
	}
	
	private boolean hasAnActiveBooking;
	
	public boolean getHasAnActiveBooking(){
		
		if ("Checked in".equals(bookingStatus))
			return true;
	
		return false;
	}

	private String bookingStatus;
	public void setBookingStatus(String bookingStatus){
		this.bookingStatus=bookingStatus;
	
	}
	
	private String customerId;
	public String getCustomerID() {
		return customerId;
	}
	public void setCustomerID( String customerId){
		this.customerId=customerId;
	}
	
	private String buildingName;
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName ( String buildingName){
		this.buildingName=buildingName;
	}
	
	private String email;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email){
		this.email=email;
	}
	
	private String university;
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university){
		this.university=university;
	}
	
	private String homeCountry;
	public String getHomeCountry() {
		return homeCountry;
	}
	public void setHomeCountry(String homeCountry){
		this.homeCountry=homeCountry;
	}
	
	private String course;
	public String getCourse() {
		return course;
	}
	public void setCourse (String course){
		this.course=course;
	}
	
	
	public String getTenancyType() {
		// TODO Auto-generated method stub
		return "0";
	
	}

	public String getAcademicYear() {
		// TODO Auto-generated method stub
		return null;
	}
	@XmlElement(name="AcademicYear")
	public int getNotificationCount() {
		// TODO Auto-generated method stub
		return 0;
	}
	@XmlElement(name="CurrentLocation")
		public List<Location> getCurrentLocation() {
		List<Location> list= new ArrayList<Location>();
	list.add(new LocationImpl(97541,"202 ROOM C - 202","Residential" ));
	list.add(new LocationImpl(97536,"Kitchen - 202","Residential" ));
			return list;
	}
	
	@XmlElement(name="MaintenanceServiceTypes")
		public List<ServiceTypes> getMaintenanceServiceTypes(){
		List<ServiceTypes> list= new ArrayList <ServiceTypes>();
	list.add(new ServiceTypesImpl(2,"Electrical"));
	list.add(new ServiceTypesImpl(4,"Flooring"));
			return list;
			
	
	 }
	public String getStatus() {
		// TODO Auto-generated method stub
		return null;
	}

}
