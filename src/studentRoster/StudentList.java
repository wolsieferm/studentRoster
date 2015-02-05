package studentRoster;

/**
 * Created with IntelliJ IDEA.
 * User: AetherRaven
 * Date: 11/6/14
 * Time: 2:12 PM
 * To change this template use File | Settings | File Templates.
 */

import java.util.List;

public interface StudentList extends List<Student> {
    Student create(Student student);

    Student update(Student student);

    void remove(String name);
}