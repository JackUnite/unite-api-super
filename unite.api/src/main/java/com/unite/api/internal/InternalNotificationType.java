package com.unite.api.internal;

import java.net.MalformedURLException;
import java.net.URL;


import com.unite.model.customer.NotificationType;


import javax.ws.rs.*;
import javax.ws.rs.core.*;
import javax.ws.rs.ext.Provider;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;


import com.wordnik.swagger.annotations.*;

@Path("/{customerId}")
@Api(value = "/InternalNotificationType", description = "Gets the notification types for the current logged in customer, with indication of opted in or out.")
@Produces({ MediaType.APPLICATION_XHTML_XML, MediaType.APPLICATION_JSON,
		MediaType.TEXT_XML })

public class InternalNotificationType {
	
	@Path("/notificationtype")
	@Consumes(MediaType.APPLICATION_JSON)
	@GET
	@ApiOperation(value = "Gets the notification types for the current logged in customer, with indication of opted in or out.", notes = "Required", response = NotificationType.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Ok"),
			@ApiResponse(code = 400, message = "Invalid ID supplied"),
			@ApiResponse(code = 404, message = "Customer not found") })
	public String getBooking() {
		return "";
	}
	@Path("/notificationtype")
	@Consumes(MediaType.APPLICATION_JSON)
	@PUT
	@ApiOperation(value = "Sets the notification types for the current logged in customer, with indication of opted in or out.", notes = "Required", response = NotificationType.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Ok"),
			@ApiResponse(code = 400, message = "Invalid ID supplied"),
			@ApiResponse(code = 404, message = "Customer not found") })
	public String setBooking() {
		return "";
	}
}
