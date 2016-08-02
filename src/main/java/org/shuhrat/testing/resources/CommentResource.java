package org.shuhrat.testing.resources;

import org.shuhrat.testing.model.Comment;
import org.shuhrat.testing.service.CommentService;
import org.shuhrat.testing.service.MessageService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by Admin on 02.08.2016.
 */
@Path("/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CommentResource {
    CommentService commentService= new CommentService();

    @GET
    public List<Comment> getComment(@PathParam("messid") Long messid){
        return commentService.getAllComments(messid);
    }

    @GET
    @Path("/{comid}")
    public Comment getComment(@PathParam("messid") Long messid , @PathParam("comid") Long comid){
        return commentService.getComment(messid, comid);
    }

    @PUT
    @Path("/{comid}")
    public Comment putComment(@PathParam("messid") Long messid , @PathParam("comid") Long comid, Comment comment){
        return commentService.putComment( messid, comid, comment );
    }

    @DELETE
    @Path("/{comid}")
    public void delComment(@PathParam("messid") Long messid , @PathParam("comid") Long comid){
        commentService.delComment(messid, comid);
    }

    @POST
    public Comment putComment(@PathParam("messid") Long messid ,  Comment comment){
        return commentService.postComment( messid, comment );
    }

}
