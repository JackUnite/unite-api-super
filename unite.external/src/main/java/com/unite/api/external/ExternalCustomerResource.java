//Swagger documentation for the external customer search via CustomerID


package com.unite.api.external;

import com.unite.model.customer.*;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

import com.wordnik.swagger.annotations.*;

@Path("/{customerId}")
@Api(value = "/customer", description = "Get Customer")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.TEXT_XML})

public class ExternalCustomerResource {
	@Path ("/customer") 
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
	
	
	//IF statement to check length of customer ID
	
	
	public Response getCustomer(
			 @ApiParam(value = "The customers ID", required = true) 
			 @PathParam("customerId") String customerId)
	 {
		if(String.valueOf(customerId).length() <=5){
			return Response.status(400).entity ("Invalid ID Length").build();
		}
			
		Customer customer=new CustomerImpl();
		
		return Response.status(200).entity (customer).build();
		
 
	
	}
}