package com.unite.model.customer;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
@XmlType (propOrder={"Major","Minor","Build","Revision","MajorRevision","MinorRevision"})

public class VersionImpl implements Version {
	
	@XmlElement (name = "Major")
	private int major;
	@XmlElement (name = "Minor")
	private int minor;
	@XmlElement (name = "Build")
	private int build;
	@XmlElement (name = "Revision")
	private int revision;
	@XmlElement (name = "MajorRevision")
	private int majorRevision;
	@XmlElement (name = "MinorRevision")
	private int minorRevision;
	
	public VersionImpl (){
		super();
	}
	
	public VersionImpl (int major, int minor, int build, int revision, int majorRevision, int minorRevision){
	
	this();
	this.major = major;
	this.minor = minor;
	this.build = build;
	this.revision = revision;
	this.majorRevision = majorRevision;
	this.minorRevision = minorRevision;
	
}
	

	public int getMajor() {
		return major;
	}

	public int getMinor() {
		return minor;
	}

	public int getBuild() {
		return build;
	}

	public int getRevision() {
		return revision;
	}

	public int getMajorRevision() {
		return majorRevision;
	}

	public int getMinorRevision() {
		return minorRevision;
	}

}
