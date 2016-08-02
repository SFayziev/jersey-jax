package org.shuhrat.testing.resources;

import org.shuhrat.testing.beans.MessageFilterBeans;
import org.shuhrat.testing.model.Message;
import org.shuhrat.testing.service.MessageService;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

/**
 * Created by Admin on 28.07.2016.
 */
@Path("/messages")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class MessageResource {
    MessageService messageService= new MessageService();

    @GET
    public List<Message> getIt(@BeanParam MessageFilterBeans filterBeans) {
        if (filterBeans.getYear()>0){
            return messageService.getAllbyYear(filterBeans.getYear());
        }
        if (filterBeans.getStart()>=0 && filterBeans.getRecnum()>0){
            return messageService.getAllbyPagination(filterBeans.getStart(), filterBeans.getRecnum());
        }

        return messageService.getAll();
    }

    @GET
    @Path("/{id}")
    public Message getById(@PathParam("id") Long id ) {
        return messageService.getbyId(id);
    }


    @DELETE
    @Path("/{id}")
    public void delById(@PathParam("id") Long id ) {
        messageService.deletebyId(id);
    }


    @POST
    public Response postMessage(Message message, @Context UriInfo uriInfo) throws URISyntaxException {
        Message message1= messageService.postMessage(message);
        URI uriBuilder = uriInfo.getAbsolutePathBuilder().path(String.valueOf(message1.getId())).build();

        return  Response.created(uriBuilder). status(Response.Status.CREATED).entity(message1).build();
    }

    @PUT
    @Path("/{id}")
    public Message putMessage(@PathParam("id") Long id  ,Message message){
        message.setId(id);
        return messageService.putMessage(message);
    }

    @Path("/{messid}/comments")
    public CommentResource getCommentResource(){
        return new CommentResource();
    }
}
