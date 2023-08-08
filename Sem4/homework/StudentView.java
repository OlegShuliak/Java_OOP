import java.util.List;

public class StudentView implements UserView<Student> {
    @Override
    public void sendOnConsole(List<Student> listT) {
        for (Student student: listT) {
            System.out.println(student.toString());
        }
    }
}
