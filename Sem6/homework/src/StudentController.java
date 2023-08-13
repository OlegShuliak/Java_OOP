import java.util.List;

/*
Принцип единственной ответственности.
Осуществляются только методы, для работы с группой студенотов (сортировки и удаления из группы)
 */
public class StudentController {
    private final StudentGroupService studentGroupService = new StudentGroupService();

    public void removeStudentByFIO(String lastName, String secondName, String firstName){
        studentGroupService.removeStudentByFIO(lastName,secondName,firstName);
    }

    public List<Student> getSortedStudentList(){return studentGroupService.getSortedStudentList();}

    public List<Student> getSortedStudentByFIO(){return getSortedStudentByFIO();}
}
