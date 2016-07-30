package org.shuhrat.testing.resources;

import org.shuhrat.testing.model.Message;
import org.shuhrat.testing.service.MessageService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by Admin on 28.07.2016.
 */
@Path("/messages")
public class MessageResource {
    MessageService messageService= new MessageService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Message> getIt() {

        return messageService.getAll();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public Message getById(@PathParam("id") Long id ) {

        return messageService.getbyId(id);
    }


    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public void delById(@PathParam("id") Long id ) {
        messageService.deletebyId(id);
    }


    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Message postMessage(Message message){
        return messageService.postMessage(message);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public Message putMessage(@PathParam("id") Long id  ,Message message){
        message.setId(id);
        return messageService.putMessage(message);
    }

}
