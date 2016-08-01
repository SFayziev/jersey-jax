package org.shuhrat.testing.exception;

import org.shuhrat.testing.model.ErrorMessage;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * Created by Lenovo on 01.08.2016.
 */
@Provider
public class NoDataExceptionMapper implements ExceptionMapper<NoDataException> {


    @Override
    public Response toResponse(NoDataException e) {
        ErrorMessage errorMessage= new ErrorMessage( 404,e.getMessage(), "Please check argument");
        return Response.status(Response.Status.NOT_FOUND).entity(errorMessage). build();
    }
}
