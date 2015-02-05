package studentRoster;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {

    private String firstName;

    public String getName() {
        return firstName;
    }

    public void setName(String firstName) {
        this.firstName = firstName;
    }
}