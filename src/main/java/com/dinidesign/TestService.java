package com.dinidesign;
import com.sun.jersey.api.core.PackagesResourceConfig;
import com.sun.jersey.api.core.ResourceConfig;
import com.sun.net.httpserver.HttpServer;
import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import java.io.IOException;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

/**
 * Created by alina on 07.02.15.
 */
// The Java class will be hosted at the URI path "/helloworld"
@Path("/helloworld")
public class TestService {

//    // The Java method will process HTTP GET requests
//    @GET
//    // The Java method will produce content identified by the MIME Media type "text/plain"
//    @Produces("text/plain")
//    public String getClichedMessage() {
//
//        return "Hello guy";    }

    @GET
    @Path("/get")
    @Produces(MediaType.APPLICATION_JSON)
    public Users getTrackInJSON() {

        Users user = new Users("John","NY",25);
        return user;

    }



    @POST
    @Path("/post")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createTrackInJSON(Users user) {
        System.out.print(user);
        String result = "Track saved : " + user;
        return Response.status(201).entity(result).build();

    }


        public static void main(String[] args) throws IOException {

            ResourceConfig rc = new PackagesResourceConfig("");
            rc.getProperties().put(
                    "com.sun.jersey.spi.container.ContainerResponseFilters",
                    "com.sun.jersey.api.container.filter.LoggingFilter;com.dinidesign.CrossDomainFilter"
            );

            HttpServer server = HttpServerFactory.create("http://localhost:9998/",rc);


            server.start();

            System.out.println("Server running");
            System.out.println("Visit: http://localhost:9998/helloworld");
            System.out.println("Hit return to stop...");
            System.in.read();
            System.out.println("Stopping server");
            server.stop(0);
            System.out.println("Server stopped");
        }
}
