// Swagger documentation for external customer search via email


package com.unite.api.external;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.wordnik.swagger.annotations.*;

@Path("/identifycustomer")
@Api(value = "/identifycustomer", description = "Get CustomerEmailResource")
@Produces(MediaType.APPLICATION_XHTML_XML)

public class ExternalCustomerEmailResource {
	@GET
	@ApiOperation(
			 value = "Find customer by Email", 
			 notes = "More notes about this method", 
			 response = String.class)
	 @ApiResponses(value = {			 
			  @ApiResponse(code = 400, message = "Invalid Email supplied"),
			  @ApiResponse(code = 404, message = "Customer not found") 
			})
	
	
	public String getCustomerEmail(
			 @ApiParam(value = "Email of customer to fetch", required = true) 
			 @QueryParam("email") String customerEmail)
			 {
		return "test" + customerEmail;
			 }
}