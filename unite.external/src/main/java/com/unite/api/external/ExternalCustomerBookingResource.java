package com.unite.api.external;

import com.unite.model.customer.Booking;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

import com.wordnik.swagger.annotations.*;

@Path("/booking")
@Api(value = "/booking", description = "all the bookings for the customer")
@Produces({MediaType.APPLICATION_XHTML_XML, MediaType.APPLICATION_JSON, MediaType.TEXT_XML})

public class ExternalCustomerBookingResource {
	@GET
	@ApiOperation(
			 value = "Gets the booking details for the customer.", 
			 notes = "Required", 
			 response = Booking.class)
	@ApiResponses(value = {
			  @ApiResponse(code = 200, message = "Ok"),
			  @ApiResponse(code = 400, message = "Invalid ID supplied"),
			  @ApiResponse(code = 404, message = "Booking not found") 
	
	})
	public String getBooking(){return "";
	}
}

