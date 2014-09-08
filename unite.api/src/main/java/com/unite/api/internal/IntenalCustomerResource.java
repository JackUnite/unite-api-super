//Swagger documentation for the external customer search via CustomerID
package com.unite.api.internal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import com.unite.model.customer.*;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationIntrospector;
import com.google.gson.Gson;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import javax.ws.rs.ext.Provider;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.wordnik.swagger.annotations.*;



@Path("/{customerId}")
@Api(value = "/InternalCustomer", description = "Get Customer")
@Provider
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.TEXT_XML})


public class IntenalCustomerResource  {
	@Path ("/customer") 
	@Consumes(MediaType.APPLICATION_JSON)
	
	@GET
	@ApiOperation(
			 value = "Gets the details for the customer.", 
			 notes = "Required", 
			 response = Customer.class)
	 @ApiResponses(value = {
			  @ApiResponse(code = 200, message = "Ok"),
			  @ApiResponse(code = 400, message = "Invalid ID supplied"),
			  @ApiResponse(code = 404, message = "Customer not found") 
			})
	
	
	public Response getCustomer(
			 @ApiParam(value = "The customers ID", required = true) 
			 @PathParam("customerId") String customerId)
	 {
		String url = "http://172.16.101.206/HMSOnline/rest/customerDetails?customerID="+customerId;//variable
			
		Customer customer = new CustomerImpl();
		ObjectMapper mapper = new ObjectMapper();
	    AnnotationIntrospector introspector = new JaxbAnnotationIntrospector();
	    // make deserializer use JAXB annotations (only)
	    mapper.getDeserializationConfig().withAppendedAnnotationIntrospector(introspector);
		
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false); //it will ignore all properties that dont exist in pojo
		
		try {
			UBSResponse response = mapper.readValue(new URL (url), UBSResponse.class);
			customer = response.getCustomer();
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      

		
		return Response.status(200).entity (customer).build();
		
	 }
}