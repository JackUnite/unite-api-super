package com.unite.model.customer;

import java.io.*;

import com.google.gson.*;

public class GsonTooImpl {
	public static void main(String[] args) {
		 
		UBSCustomer ubsCustomer = new UBSCustomer();
		
		Gson gson = new Gson();
	 
		// convert java object to JSON format,
		// and returned as JSON formatted string
		String json = gson.toJson(ubsCustomer);
	 
		try {
			//write converted json data to a file named "file.json"
			FileWriter writer = new FileWriter("c:\\file.json");
			writer.write(json);
			writer.close();
	 
		} catch (IOException e) {
			e.printStackTrace();
		}
	 
		System.out.println(json);
	 
	    }
	}


