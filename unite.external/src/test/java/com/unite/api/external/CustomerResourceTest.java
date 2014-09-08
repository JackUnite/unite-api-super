package com.unite.api.external;

import static org.junit.Assert.*;
import javax.ws.rs.core.MediaType;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.junit.Test;
import com.sun.jersey.spi.container.servlet.ServletContainer;
import com.sun.jersey.test.framework.*;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class CustomerResourceTest extends JerseyTest{
	
	  @Override
	  protected AppDescriptor configure() {
			return new WebAppDescriptor.Builder().build();
		}

	@Test //establishes local connection so it is possible to override test class with our values
	public void getCustomerTest() throws JSONException {
		WebResource webResource = client().resource("http://localhost:8080/");
		JSONObject json = webResource.path("/internal/api/v1/110191454585/customer")
				.get(JSONObject.class);
		
		
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

}
