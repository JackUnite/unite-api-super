package com.unite.api.internal;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.unite.model.customer.Customer;


	  public class CustomerResourceTest {

	       private ObjectMapper mapper;
	       
	       @Before
	       public void setUp() throws Exception {
	              mapper = new ObjectMapper();
	          //mapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	       }

	       @After
	       public void tearDown() throws Exception {
	       }

	       @Test
	       public void test() throws JsonParseException, JsonMappingException, IOException {
	              Customer customer = mapper.readValue(this.getClass().getResourceAsStream("CustomerResource.json"), Customer.class);
	              assertNotNull(customer);
		
		/*
		assertEquals("ALBERT DING FA", json.get("GivenName"));
		assertEquals("ANG", json.get("FamilyName"));
		assertEquals(true, json.getBoolean("HasAnActiveBooking"));
		assertEquals("110191454585", json.get("CustomerId"));
		assertEquals("Thurso Street", json.get("BuildingName"));
		assertEquals("110191454585@dummy.com", json.get("Email"));
		assertEquals("UNIV255", json.get("University"));
		assertEquals("MYS", json.get("HomeCountry"));
		assertEquals("Medicine", json.get("Course"));
		assertEquals(0, json.getInt("TenancyType"));
		assertEquals(12, json.getJSONArray("CurrentLocation").length());
		
		JSONArray jsonArray = json.getJSONArray("CurrentLocation"); // declares new jsonArray "Currentlocation"
		
		checkCurrentLocation (jsonArray, 0, 97541, "202 ROOM C - 202","Residential");
		checkCurrentLocation (jsonArray, 1, 97536, "Kitchen - 202", "Residential"); 
		checkCurrentLocation (jsonArray, 2, 97537, "Lounge - 202","Residential");
		checkCurrentLocation (jsonArray, 3, 97538, "Corridor - 202", "Residential");
		checkCurrentLocation (jsonArray, 4, 97524, "Corridor - SECOND FLOOR", "Communal");
		checkCurrentLocation (jsonArray, 5, 97456, "Common Room - Thurso Street", "Communal");
		checkCurrentLocation (jsonArray, 6, 97457, "Reception - Thurso Street","Communal");
		checkCurrentLocation (jsonArray, 7, 97458, "Corridor - Thurso Street","Communal");
		checkCurrentLocation (jsonArray, 8, 97459, "Other - Thurso Street","Communal");
		checkCurrentLocation (jsonArray, 9, 97460, "Games Room - Thurso Street","Commercial");
		checkCurrentLocation (jsonArray, 10, 97461, "Launderette - Thurso Street","Commercial");
		checkCurrentLocation (jsonArray, 11, 97462, "Gym - Thurso Street","Commercial");
		
		assertEquals(7,json.getJSONArray("MaintenanceServiceTypes").length());
		
		JSONArray jsonArray1 = json.getJSONArray("MaintenanceServiceTypes"); // declares new jsonarray "MaintenanceServiceTypes"
		
		checkMaintenanceServiceTypes (jsonArray1,0, 2, "Electrical");
		checkMaintenanceServiceTypes (jsonArray1,1, 4, "Flooring");
		checkMaintenanceServiceTypes (jsonArray1,2, 5, "Glazing");
		checkMaintenanceServiceTypes (jsonArray1,3, 3, "Heating");
		checkMaintenanceServiceTypes (jsonArray1,4, 19, "Light Bulbs");
		checkMaintenanceServiceTypes (jsonArray1,5, 6, "Plastering");
		checkMaintenanceServiceTypes (jsonArray1,6, 1, "Plumbing");
		
		assertEquals("2013-2014", json.get("AcademicYear"));
		assertEquals(0, json.getInt("NotificationCount"));
					
		}
				
		private void checkCurrentLocation(JSONArray jsonArray, int index, int id, String name, String locationType) throws JSONException{
			JSONObject arrayItem = jsonArray.getJSONObject(index); // created function to check array data for currentLocation
			assertEquals(id, arrayItem.getInt("Id"));
			assertEquals(name, arrayItem.get("Name"));
			assertEquals(locationType, arrayItem.get("LocationType"));	
	
	}
	
		private void checkMaintenanceServiceTypes(JSONArray jsonArray, int index, int serviceId, String service ) throws JSONException{
			JSONObject arrayItem = jsonArray.getJSONObject(index);// created function to check array data for MaintenancesServiceTypes
			assertEquals(serviceId, arrayItem.getInt("ServiceId"));
			assertEquals(service, arrayItem.get("Service"));
			
			
		}
*/
}
	  }
