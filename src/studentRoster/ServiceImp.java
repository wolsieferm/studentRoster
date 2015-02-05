package studentRoster;

/**
 * Created with IntelliJ IDEA.
 * User: AetherRaven
 * Date: 11/6/14
 * Time: 2:07 PM
 * To change this template use File | Settings | File Templates.
 */

@Sevice
public class ServiceImp {

    private final StudentList studentList;

    public ServiceImp(StudentList studentList){
        this.studentList = studentList;
    }

    public Student addStudent(Student student) {
        Student newStudent = this.studentList.create(student);
        return newStudent;
    }

    public Student update(Student student) {
        return this.studentList.update(student);
    }

    public void remove(String name) {
        this.studentList.remove(name);
    }
}
