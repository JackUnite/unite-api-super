package com.unite.model.customer;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
@XmlType (propOrder={"InternalUseOnly","ServiceId","Service"})

public class MaintenanceServiceImpl implements MaintenanceService {

	@XmlElement (name = "InternalUseOnly")
	private boolean internalUseOnly;
	@XmlElement (name = "ServiceId")
	private int serviceId;
	@XmlElement (name = "Service")
	private String service;
	
	public MaintenanceServiceImpl (){
		super();
	} 
	
	public MaintenanceServiceImpl (boolean internalUseOnly, int serviceId, String service){
		this();
		this.internalUseOnly = internalUseOnly;
		this.serviceId = serviceId;
		this.service = service;
	}
	
	
public boolean getInternalUseOnly(){ //Need to find vaules in source code
		
		return false;
	}

	public int getServiceId() {
		
		return serviceId;
	}

	public String getService() {
		
		return service;
	}
	
	
	
	

}
