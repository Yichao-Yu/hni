package org.hni.admin.service;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.hni.organization.om.Organization;
import org.hni.organization.service.OrganizationService;
import org.hni.user.om.User;
import org.hni.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Path("/org")
public class OrganizationServiceController {
	private static final Logger logger = LoggerFactory.getLogger(OrganizationServiceController.class);
	
	@Inject private OrganizationService orgService;
	
	@GET
	@Path("/{id}")
	@Produces({MediaType.APPLICATION_JSON})
	public Organization getUser(@PathParam("id") Long id) {
		return orgService.get(id);
	}
	
}
