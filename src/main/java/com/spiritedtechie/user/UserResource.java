package com.spiritedtechie.user;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/user")
public class UserResource {

    @Inject
    private UserService userService;

    @GET
    @Path("{userId}")
    @Produces(MediaType.APPLICATION_JSON)
    public User doGet(@PathParam("userId") Long userId) {

        return userService.getUser(userId);
    }

}