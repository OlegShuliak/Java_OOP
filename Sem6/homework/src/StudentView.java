import java.util.List;
/*
Принцип единственной ответственности и принцип разделения интерфейсов
Осуществлен только один необходимый интерфейс. Класс предоставляет только возможность вывода
в консоль списка студентов.
 */
public class StudentView implements UserView<Student>{

    @Override
    public void sendOnConsole(List<Student> listT) {
        System.out.println("Список студентов:");
        for (Student student: listT) {
            System.out.println(student.getStudentId());
        }
    }
}
