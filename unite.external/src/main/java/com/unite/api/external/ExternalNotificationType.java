package com.unite.api.external;


import com.unite.model.customer.NotificationType;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

import com.wordnik.swagger.annotations.*;

@Path("/notificationtype")
@Api(value = "/NotificationType", description = "Gets the notification types for the current logged in customer, with indication of opted in or out.")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.TEXT_XML})


public class ExternalNotificationType {
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
