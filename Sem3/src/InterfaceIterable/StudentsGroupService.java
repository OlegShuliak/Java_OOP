package InterfaceIterable;

import InterfaceIterator.Student;

import java.util.List;

public class StudentsGroupService {
    private  StudentsGroup studentsGroup;
    public StudentsGroupService(StudentsGroup studentsGroup){
        this.studentsGroup = studentsGroup;
    }

    public StudentsGroupService(){
        this.studentsGroup = new StudentsGroup();
    }

    public StudentsGroup getStudentsGroup() {
        return studentsGroup;
    }

    public void setStudentsGroup(StudentsGroup studentsGroup) {
        this.studentsGroup = studentsGroup;
    }

    public boolean removeStudent(String firstName, String secondName, String lastName){
        if (studentsGroup.getStudentsList() == null) return false;
        Student removeStudent = new Student(null, firstName, secondName, lastName);
        List<Student> studentList = studentsGroup.getStudentsList();
        for (Student student: studentList) {
            if (student.equals(removeStudent)){
                studentList.remove(student);
                return true;
            }
        }
        return  false;
    }
}
