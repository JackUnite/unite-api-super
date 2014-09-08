package com.unite.api.internal;

import java.net.MalformedURLException;
import java.net.URL;


import com.unite.model.customer.MaintenanceService;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import javax.ws.rs.ext.Provider;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;


import com.wordnik.swagger.annotations.*;

@Path("/maintenanceService")
@Api(value = "/InternalMaintenanceService", description = "Gets this instance.")
@Produces({ MediaType.APPLICATION_XHTML_XML, MediaType.APPLICATION_JSON,
		MediaType.TEXT_XML })

public class InternalMaintenanceService {
	
	@Path("/maintenanceservice")
	@Consumes(MediaType.APPLICATION_JSON)
	@GET
	@ApiOperation(value = "Gets the maintenance requests.", notes = "Required", response = MaintenanceService.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Ok"),
			@ApiResponse(code = 400, message = "Invalid ID supplied"),
			@ApiResponse(code = 404, message = "Customer not found") })
	public String getMaintenanceService() {
		return "";
	}
}

