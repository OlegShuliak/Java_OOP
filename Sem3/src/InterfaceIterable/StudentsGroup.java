package InterfaceIterable;

import InterfaceIterator.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentsGroup implements Iterable<Student>{
    private List<Student> studentsList;

    public StudentsGroup(){ studentsList = new ArrayList();}

    public StudentsGroup(List<Student> studentsList){ setStudentsList(studentsList);}
    public List<Student> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(List<Student> studentsList) {
        this.studentsList = studentsList;
    }

    public void addStudent(Student student){
        if (student != null){
            studentsList.add(student);
        }
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "studentsList=" + studentsList +
                '}';
    }

    @Override
    public StudentsGroupIterator iterator() {
        return new StudentsGroupIterator(this);
    }
}
