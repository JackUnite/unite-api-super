package com.unite.model.customer;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
@XmlType (propOrder={"appleDeviceId","gcmRegistrationId","RegistrationId","template","UniqueId","winPhoneUri","winStoreUri"})

public class NotifactionRegistrationImpl implements NotificationRegistration {
	
	@XmlElement (name="appleDeviceId")
	private String appleDeviceId;
	@XmlElement (name="gcmRegistrationId")
	private String gcmRegistrationId;
	@XmlElement (name="RegistrationId")
	private String registrationId;
	@XmlElement (name="tempate")
	private String template;
	@XmlElement (name="UniqueId")
	private String uniqueId;
	@XmlElement (name="winPhoneUri")
	private String winPhoneUri;
	@XmlElement (name="winStoreUri")
	private String winStoreUri;
	
	public NotifactionRegistrationImpl (){
		super();
	}
	
	public NotifactionRegistrationImpl (String appleDeviceId, String gcmRegistrationId, String registrationId, String template, String uniqueId, String winPhoneUri, String winStoreUri){
		this();
		this.appleDeviceId = appleDeviceId;
		this.gcmRegistrationId = gcmRegistrationId;
		this.registrationId = registrationId;
		this.template = template;
		this.uniqueId = uniqueId;
		this.winPhoneUri = winPhoneUri;
		this.winStoreUri = winStoreUri;
		
	}

	public String putappleDeviceId() {
		return appleDeviceId;
	}

	public String putgcmRegistrationId() {
		return gcmRegistrationId;
	}

	public String putRegistrationId() {
		return registrationId;
	}

	public String puttemplate() {
		return template;
	}

	public String putUniqueId() {
		return uniqueId;
	}

	public String putwinPhoneUri() {
		return winPhoneUri;
	}

	public String putwinStoreUri() {
		return winStoreUri;
	}

	public String deleteappleDeviceId() {
		return appleDeviceId;
	}

	public String deletegcmRegistrationId() {
		return gcmRegistrationId;
	}

	public String deleteRegistrationId() {
		return registrationId;
	}

	public String deletetemplate() {
		return template;
	}

	public String deleteUniqueId() {
		return uniqueId;
	}

	public String deletewinPhonrUri() {
		return winPhoneUri;
	}

	public String deletewinStoreUri() {
		return winStoreUri;
	}
	

}
