import java.util.List;

public class TeacherController implements UserController<Teacher>{

    private final TeacherStateService teacherStateService = new TeacherStateService();

    private  UserView teacherView = new StudentView();

    public void removeTeacherByFIO(String lastName, String secondName, String firstName){
        teacherStateService.removeTeacherByFIO(lastName,secondName,firstName);
    }

    public List<Teacher> getSortedTeacherList(){return teacherStateService.getSortedTeacherList();}

    public List<Teacher> getSortedTeacherByFIO(){return getSortedTeacherByFIO();}

    @Override
    public void createUser(String firstName, String secondName, String lastName, Long idParameter) {
        Teacher student = new Teacher(firstName, secondName, lastName, idParameter);
    }


    public void printConsole(List<Teacher> teacher) {
        teacherView.sendOnConsole(teacher);
    }
}
