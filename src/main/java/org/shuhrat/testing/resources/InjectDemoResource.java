package org.shuhrat.testing.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

/**
 * Created by Lenovo on 01.08.2016.
 */
@Path("/inject")
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.TEXT_PLAIN)
public class InjectDemoResource {

    @GET
    @Path("/annotation")
    public String getParamUseingAnatetion(@MatrixParam("matrix") String matrixparam,
                                           @HeaderParam("headparam") String headparam,
                                          @CookieParam("cookie") String cookieParam){
        return "matrixparam param : " + matrixparam
                +"\n Header Param: " + headparam
                +"\n  Cookie Param: " + cookieParam;
    }

    @GET
    @Path("/context")
    public String getContext(@Context UriInfo uriInfo, @Context HttpHeaders httpHeaders){
        return "URL info absolutePath: " + uriInfo.getAbsolutePath()+
                "\n HttpHeaders cookies" + httpHeaders.getCookies();
    }
}
