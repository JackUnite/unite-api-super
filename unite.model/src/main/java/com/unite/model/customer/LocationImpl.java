package com.unite.model.customer;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
@XmlType (propOrder={"Id","Name","LocationType"})

public class LocationImpl implements Location {
	@XmlElement(name="Id")
	private int id;
	@XmlElement(name="Name")
	private String name;
	@XmlElement(name="LocationType")
	private String locationType;
	
	
	public LocationImpl (){
		super();
	}
	
	public LocationImpl (int id, String name, String locationType){
		this();
		this.id = id;
		this.name = name;
		this.locationType = locationType;
	}
	
	
	public int getId() {

		return id;
	}
	
	public String getName() {
		
		return name;
	}
	
	public String getlocationType() {
		
		return locationType;
	}

	public void setId(int id) {
		this.id=id;
		
	}

	public void setName(String name) {
		this.name=name;
		
	}

	public void setLocationType(String locationType) {
		this.locationType=locationType;
		
	}

}
