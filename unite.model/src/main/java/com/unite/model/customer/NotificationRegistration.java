package com.unite.model.customer;

public interface NotificationRegistration {
	
	String putappleDeviceId();
	String putgcmRegistrationId();
	String putRegistrationId();
	String puttemplate();
	String putUniqueId();
	String putwinPhoneUri();
	String putwinStoreUri();
	
	String deleteappleDeviceId();
	String deletegcmRegistrationId();
	String deleteRegistrationId();
	String deletetemplate();
	String deleteUniqueId();
	String deletewinPhonrUri();
	String deletewinStoreUri();
}
