package com.unite.model.customer;
import com.google.gson.annotations.SerializedName;

import java.util.*;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.NONE) //only gets annotated versions

public class UBSCustomer implements Customer {
	public UBSCustomer(){
	 super();
	}
	@SerializedName ("customerFirstName")
	private String givenName; //changing the JSON to Pojo
	public String getGivenName() {
	return givenName;
	}
	public void setGivenName(String givenName){
	this.givenName=givenName;
	}
	
	@SerializedName ("customerFamilyName")
	private String familyName;
	public String getFamilyName() {
	return familyName;
	}
	
	public void setFamilyName( String familyName){
		this.familyName=familyName;
	}
	@SerializedName ("hasAnActiveBooking")
	private boolean hasAnActiveBooking;

	public boolean getHasAnActiveBooking(){
		
		if ("Checked in".equals(bookingStatus))
			return true;
	
		return false;
	}
	@SerializedName ("status")
	private String bookingStatus;
	public void setBookingStatus(String bookingStatus){
		this.bookingStatus=bookingStatus;
	
	}
	@SerializedName  ("customerID")
	private String customerId;
	public String getCustomerID() {
	return customerId;
	}
	public void setCustomerID( String customerId){
		this.customerId=customerId;
	}
	@SerializedName  ("propertyName")
	private String buildingName;
	public String getBuildingName() {
	return buildingName;
	}
	public void setBuildingName (String buildingName){
		this.buildingName=buildingName;
	}
	@SerializedName ("customerPrimaryEmailAddress")
	private String email;
	public String getEmail() {
	return email;
	}
	public void setEmail(String email){
		this.email=email;
	}
	@SerializedName ("university") 
	private String university;
	public String getUniversity() {
	return university;
	}
	public void setUniversity(String university){
		this.university=university;
	}
	@SerializedName ("customerNationalityCountry")
	private String homeCountry;
	public String getHomeCountry() {
	return homeCountry;
	}
	public void setHomeCountry(String homeCountry){
		this.homeCountry=homeCountry;
	}
	@SerializedName ("course")
	private String course;
	public String getCourse() {
	return course;
	}
	public void setCourse (String course){
		this.course=course;
	}
	
	@SerializedName ("tenancyType")
	private String tenancyType;
	public String getTenancyType() {
		return "tenancyType";
	
	}
	
	public String getAcademicYear() {
		// TODO Auto-generated method stub
		return null;
	}

	
		public List<Location> getCurrentLocation() {
		List<Location> list= new ArrayList<Location>();
	list.add(new LocationImpl(97541,"202 ROOM C - 202","Residential" ));
	list.add(new LocationImpl(97536,"Kitchen - 202","Residential" ));
			return list;
	}
	
	
		public List<ServiceTypes> getMaintenanceServiceTypes(){
		List<ServiceTypes> list= new ArrayList <ServiceTypes>();
	list.add(new ServiceTypesImpl(2,"Electrical"));
	list.add(new ServiceTypesImpl(4,"Flooring"));
			return list;
			
	
	 }
		public int getNotificationCount() {
			// TODO Auto-generated method stub
			return 0;
		}
		public String getStatus() {
			// TODO Auto-generated method stub
			return null;
		}

}
