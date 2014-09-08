package com.unite.api.external;

import com.unite.model.customer.NotificationRegistration;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

import com.wordnik.swagger.annotations.*;


@Path("/notificationregistration")
@Api(value = "/NotificationRegistration", description = "Gets and Deletes the notifications for the current logged in customer.")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.TEXT_XML})

public class ExternalNotificationRegistration {
	@Path("/notificationregostraton")
	@Consumes(MediaType.APPLICATION_JSON)
	@PUT
	@ApiOperation(value = "creates/updates the notification registration.", response = NotificationRegistration.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Ok"),
			@ApiResponse(code = 400, message = "Invalid ID supplied"),
			@ApiResponse(code = 404, message = "Customer not found") })
	public String setNotificationRegistration() {
		return "";
	}
	@Path("/notificationregostraton")
	@Consumes(MediaType.APPLICATION_JSON)
	@DELETE
	@ApiOperation(value = "Deletes a notification.", notes = "Required", response = NotificationRegistration.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Ok"),
			@ApiResponse(code = 400, message = "Invalid ID supplied"),
			@ApiResponse(code = 404, message = "Customer not found") })
	public String deleteNotificationRegistration() {
		return "";
	}
}
