package studentRoster;

/**
 * Created with IntelliJ IDEA.
 * User: AetherRaven
 * Date: 11/6/14
 * Time: 1:52 PM
 * To change this template use File | Settings | File Templates.
 */

import studentRoster.Service;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/")
public class RESTService {

    private final Service service;

    public RESTService(Service service) {
        this.service = service;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Student> getStudentInJSON() {
        return service.getAllStudents();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Student create(Student student) {
        return service.newstudent(student);
    }

    @PUT
    @Path("{name}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Student update(Student student) {
        return service.update(student);
    }

    @DELETE
    @Path("{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public void remove(@PathParam("name") String name) {
        service.remove(name);
    }
}