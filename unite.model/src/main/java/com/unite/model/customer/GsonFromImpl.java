package com.unite.model.customer;

import java.io.*;

import com.google.gson.*;

public class GsonFromImpl {
    public static void main(String[] args) {
 
	Gson gson = new Gson();
 
	try {
 
		BufferedReader br = new BufferedReader(
				new InputStreamReader(
				
				GsonFromImpl.class.getResourceAsStream("UBSCustomer.json"),"UTF-8")); // takes in json file
			
 
		//convert the json string back to object
		UBSResponse obj = gson.fromJson(br, UBSResponse.class);
 
		System.out.println(obj);
 
	} catch (IOException e) {
		e.printStackTrace();
	}
 
    }
}