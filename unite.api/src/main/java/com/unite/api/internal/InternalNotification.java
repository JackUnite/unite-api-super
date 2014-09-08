package com.unite.api.internal;

import java.net.MalformedURLException;
import java.net.URL;

import com.unite.model.customer.Notification;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import javax.ws.rs.ext.Provider;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;



import com.wordnik.swagger.annotations.*;

@Path("/{customerid}")
@Api(value = "/InternalNotification", description = "Gets the notifications for the current logged in customer.")
@Produces({ MediaType.APPLICATION_XHTML_XML, MediaType.APPLICATION_JSON,
		MediaType.TEXT_XML })


public class InternalNotification {
	
	@Path("/notification")
	@Consumes(MediaType.APPLICATION_JSON)
	@GET
	@ApiOperation(value = "200 if ok includes a list of notifications, 401 if user account is not valid, 500 if issue with remote server.", notes = "Required", response = Notification.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Ok"),
			@ApiResponse(code = 400, message = "Invalid ID supplied"),
			@ApiResponse(code = 404, message = "Customer not found") })
	public String getNotification() {
		return "";
	}
	@Path("/notification")
	@Consumes(MediaType.APPLICATION_JSON)
	@POST
	@ApiOperation(value = "200 if ok includes a list of notifications, 401 if user account is not valid, 500 if issue with remote server.", notes = "Required", response = Notification.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Ok"),
			@ApiResponse(code = 400, message = "Invalid ID supplied"),
			@ApiResponse(code = 404, message = "Customer not found") })
	public String settNotification() {
		return "";
	}
	@Path("/notification")
	@Consumes(MediaType.APPLICATION_JSON)
	@DELETE
	@ApiOperation(value = "200 if ok includes a list of notifications, 401 if user account is not valid, 500 if issue with remote server.", notes = "Required", response = Notification.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Ok"),
			@ApiResponse(code = 400, message = "Invalid ID supplied"),
			@ApiResponse(code = 404, message = "Customer not found") })
	public String deletetNotification() {
		return "";
	}
}


