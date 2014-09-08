package com.unite.model.customer;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
@XmlType (propOrder={"ServiceId","Service"})

public class MaintenanceServiceTypeImpl implements MaintenanceServiceType {
	
	@XmlElement (name = "ServiceId")
	private int serviceId;
	@XmlElement (name = "Service")
	private String service;
	
	public MaintenanceServiceTypeImpl (){
		super();
	} 
	
	public MaintenanceServiceTypeImpl (int serviceId, String service){
	
	this();
	this.serviceId = serviceId;
	this.service = service;
	}
	
	
	
	
	public int getServiceId() {
		return serviceId;
	}
	public String getService() {
		return service;
	}

}
