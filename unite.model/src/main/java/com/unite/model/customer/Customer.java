package com.unite.model.customer;

import java.util.*;

import javax.xml.bind.annotation.XmlElement;

import com.google.gson.Gson;

public interface Customer {
	@XmlElement (name="GivenName")
	String getGivenName();
	
	@XmlElement (name= "FamilyName")
	String getFamilyName();
	
	@XmlElement (name="status")
	String getStatus();
	
	@XmlElement(name="HasAnActiveBooking")
	boolean getHasAnActiveBooking();
	
	@XmlElement (name="CustomerId")
	String getCustomerID();
	
	@XmlElement (name="BuildingName")
	String getBuildingName();
	
	@XmlElement(name="Email")
	String getEmail();
	
	@XmlElement(name="University")
	String getUniversity();
	
	@XmlElement(name="HomeCountry")
	String getHomeCountry();
	
	@XmlElement(name="Course")
	String getCourse();
	
	@XmlElement(name="TenancyType")
	String getTenancyType();
	
	@XmlElement(name="NotificationCount")
	String getAcademicYear();
	
	
	int getNotificationCount();
	List<Location> getCurrentLocation ();
	List<ServiceTypes> getMaintenanceServiceTypes ();
}


