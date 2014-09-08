package com.unite.api.internal;

import java.net.MalformedURLException;
import java.net.URL;
import com.unite.model.customer.MaintenanceRequest;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import javax.ws.rs.ext.Provider;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.wordnik.swagger.annotations.*;

@Path("/{customeremail}")
@Api(value = "/InternalMaintenanceRequest", description = "Gets the maintenance requests for the current logged in customer.")
@Produces({ MediaType.APPLICATION_XHTML_XML, MediaType.APPLICATION_JSON,
		MediaType.TEXT_XML })
public class InternalMaintenanceRequest {

	@Path("/maintenancerequest")
	@Consumes(MediaType.APPLICATION_JSON)
	@GET
	@ApiOperation(value = "Gets the maintenance requests.", notes = "Required", response = MaintenanceRequest.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Ok"),
			@ApiResponse(code = 400, message = "Invalid ID supplied"),
			@ApiResponse(code = 404, message = "Customer not found") })
	public String getMaintenanceRequest() {
		return "";
	}
	@Path("/maintenancerequest")
	@POST
	@ApiOperation(value = "Sets the maintenance request", notes = "Required", response = MaintenanceRequest.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Ok"),
			@ApiResponse(code = 400, message = "Invalid ID supplied"),
			@ApiResponse(code = 404, message = "Customer not found") })
	public String setMaintenanceRequest() {
		return "";
	}
	@Path("/maintenancerequest")
	@Consumes(MediaType.APPLICATION_JSON)
	@DELETE
	@ApiOperation(value = "Deletes the maintenance request", notes = "Required", response = MaintenanceRequest.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Ok"),
			@ApiResponse(code = 400, message = "Invalid ID supplied"),
			@ApiResponse(code = 404, message = "Customer not found") })
	public String deleteMaintenanceRequest() {
		return "";
	}

}



