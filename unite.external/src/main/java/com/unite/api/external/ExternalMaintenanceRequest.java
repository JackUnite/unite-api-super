package com.unite.api.external;

import com.unite.model.customer.MaintenanceRequest;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

import com.wordnik.swagger.annotations.*;

@Path("/maintenancerequest")
@Api(value = "/MaintenanceRequest", description = "Gets the maintenance requests.")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.TEXT_XML})



public class ExternalMaintenanceRequest {
	@GET
	@ApiOperation(
			 value = "Gets the maintenance requests for the current logged in customer.", 
			 notes = "Required", 
			 response = MaintenanceRequest.class)
	@ApiResponses(value = {
			  @ApiResponse(code = 200, message = "Ok"),
			  @ApiResponse(code = 400, message = "Invalid ID supplied"),
			  @ApiResponse(code = 404, message = "Request not found") 
	
	})
	public String getMaintenanceRequest(){return "";
	}
	@POST
	@ApiOperation(
			 value = "Sets the maintenance requests for the current logged in customer.", 
			 notes = "Required", 
			 response = MaintenanceRequest.class)
	@ApiResponses(value = {
			  @ApiResponse(code = 200, message = "Ok"),
			  @ApiResponse(code = 400, message = "Invalid ID supplied"),
			  @ApiResponse(code = 404, message = "Request not found") 
	
	})
	public String setMaintenanceRequest(){return "";
	}
	@DELETE
	@ApiOperation(
			 value = "Deletes the maintenance requests for the current logged in customer.", 
			 notes = "Required", 
			 response = MaintenanceRequest.class)
	@ApiResponses(value = {
			  @ApiResponse(code = 200, message = "Ok"),
			  @ApiResponse(code = 400, message = "Invalid ID supplied"),
			  @ApiResponse(code = 404, message = "Request not found") 
	
	})
	public String deleteMaintenanceRequest(){return "";
	}
}


