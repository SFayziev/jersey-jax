package org.shuhrat.testing.resources;

import org.shuhrat.testing.model.Profile;
import org.shuhrat.testing.service.ProfileService;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by Admin on 01.08.2016.
 */
@Path("/profile")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProfileResource {
    ProfileService profileService= new ProfileService();

    @GET
    public List<Profile> getProfiles(){
        return profileService.getAll();
    }

    @GET
    @Path("/{name}")
    public Profile getById(@PathParam("name") String name ) {
        return profileService.getProfile(name);
    }


    @DELETE
    @Path("/{name}")
    public void delById(@PathParam("name") String name ) {
        profileService.delProfile(name);
    }


    @POST
    public Profile postProfile(Profile profile ){
        return profileService.postProfile(profile);
    }

    @PUT
    @Path("/{name}")
    public Profile putProfile(@PathParam("name") String name  ,Profile profile){
        profile.setName(name);
        return profileService.putProfile(name, profile);
    }
}
