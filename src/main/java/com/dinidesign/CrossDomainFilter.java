package com.dinidesign;

import com.sun.jersey.spi.container.ContainerRequest;
import com.sun.jersey.spi.container.ContainerResponse;
import com.sun.jersey.spi.container.ContainerResponseFilter;

/**
 * Created by alina on 09.02.15.
 */
public class CrossDomainFilter implements ContainerResponseFilter {

    public ContainerResponse filter(ContainerRequest creq, ContainerResponse cres) {
        cres.getHttpHeaders().add("Access-Control-Allow-Origin", "*");
        cres.getHttpHeaders().add("Access-Control-Allow-Headers", "origin, content-type, accept, authorization");
        cres.getHttpHeaders().add("Access-Control-Allow-Credentials", "true");
        cres.getHttpHeaders().add("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD");
        cres.getHttpHeaders().add("Access-Control-Max-Age", "1209600");
        return cres;
    }
}
