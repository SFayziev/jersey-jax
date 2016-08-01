package org.shuhrat.testing.exception;

import org.shuhrat.testing.model.ErrorMessage;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * Created by Lenovo on 02.08.2016.
 */
@Provider
public class GenericExceptionMapper implements ExceptionMapper<Throwable> {

    @Override
    public Response toResponse(Throwable throwable) {
        ErrorMessage errorMessage= new ErrorMessage( 500,throwable.getMessage(), "Please check argument");
         return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(errorMessage). build();

    }
}
