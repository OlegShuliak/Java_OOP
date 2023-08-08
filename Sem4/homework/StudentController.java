

import java.util.List;

public class StudentController implements  UserController {
    private final StudentGroupService studentGroupService = new StudentGroupService();

    private  UserView studentView = new StudentView();

    public void removeStudentByFIO(String lastName, String secondName, String firstName){
        studentGroupService.removeStudentByFIO(lastName,secondName,firstName);
    }

    public List<Student> getSortedStudentList(){return studentGroupService.getSortedStudentList();}

    public List<Student> getSortedStudentByFIO(){return getSortedStudentByFIO();}

    @Override
    public void createUser(String firstName, String secondName, String lastName, Long idParameter) {
        Student student = new Student(firstName, secondName, lastName, idParameter);
    }


    public void printConsole(List<Student> student) {
        studentView.sendOnConsole(student);
    }
}
