package studentRoster;

/**
 * Created with IntelliJ IDEA.
 * User: AetherRaven
 * Date: 11/6/14
 * Time: 1:51 PM
 * To change this template use File | Settings | File Templates.
 */

import java.util.List;

public interface Service {

        List<Student> getAllStudents();

        Student newStudent(Student student);

        Student update(Student student);

        void remove(String name);

}
