package InterfaceIterator;

import java.util.ArrayList;
import java.util.List;

public class StudentGroup {
    private List<Student> studentsList;

    public StudentGroup(){ studentsList = new ArrayList();}

    public StudentGroup(List<Student> studentsList){ setStudentsList(studentsList);}
    public List<Student> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(List<Student> studentsList) {
        this.studentsList = studentsList;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "studentsList=" + studentsList +
                '}';
    }
}
