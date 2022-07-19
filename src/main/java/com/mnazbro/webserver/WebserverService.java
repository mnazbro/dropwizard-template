package com.mnazbro.webserver;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/webserver")
@Consumes("application/json")
@Produces("application/json")
public interface WebserverService {
    @GET
    @Path("/hello")
    String hello();

    @GET
    @Path("/hello/{name}")
    String helloName(@PathParam("name") String name);
}
