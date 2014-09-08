package com.unite.model.customer;

import java.util.*;

import javax.xml.bind.annotation.*;


	
	@XmlRootElement (name="Booking")
	@XmlType (propOrder={"Active","BookingId","End","Room","Start","Status","LocationId","BookingCode"})
	
	public class BookingImpl implements Booking {
	
	@XmlElement (name="Active")
	public boolean getActive() {
		// TODO Auto-generated method stub
		return false;
	}
	@XmlElement (name="BookingId")
	public int getBookingId() {
		// TODO Auto-generated method stub
		return 0;
	}
	@XmlElement (name="Building")
	public String getBuilding() {
		// TODO Auto-generated method stub
		return null;
	}
	@XmlElement (name="End")
	public String getEnd() {
		// TODO Auto-generated method stub
		return null;
	}
	@XmlElement (name="Room")
	public String getRoom() {
		// TODO Auto-generated method stub
		return null;
	}
	@XmlElement (name="Start")
	public String getStart() {
		// TODO Auto-generated method stub
		return null;
	}
	@XmlElement (name="Status")
	public String getStatus() {
		// TODO Auto-generated method stub
		return null;
	}
	@XmlElement (name="LocationId")
	public int getLocationId() {
		// TODO Auto-generated method stub
		return 0;
	}
	@XmlElement (name="BookingCodes")
	public String getBookingCodes() {
		// TODO Auto-generated method stub
		return null;
	}

}
