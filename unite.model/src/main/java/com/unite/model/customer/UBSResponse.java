package com.unite.model.customer;
import com.unite.model.customer.UBSCustomer;
import javax.xml.bind.annotation.*;
@XmlAccessorType(XmlAccessType.NONE) //only parses annotated fields
public class UBSResponse {
	
	private UBSCustomer value;
	

	public Customer getCustomer(){
		
	
	return value;
}
public void setValue (UBSCustomer value){
	this.value= value;
}
}
