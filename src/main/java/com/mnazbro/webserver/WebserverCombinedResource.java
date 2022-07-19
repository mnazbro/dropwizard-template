package com.mnazbro.webserver;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Consumes("application/json")
@Produces("application/json")
@Path("/combined")
public final class WebserverCombinedResource {
    private static final Logger log = LoggerFactory.getLogger(WebserverCombinedResource.class);

    public WebserverCombinedResource() {
    }

    @GET
    @Path("/hello")
    public String hello() {
        return "Hello world!";
    }

    @GET
    @Path("/hello/{name}")
    public String helloName(@PathParam("name") String name) {
        return String.format("Hello %s!", name);
    }
}
