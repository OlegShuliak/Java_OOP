
import java.util.Iterator;
import java.util.List;

/*
Принцип единой ответственности и принцип разделения интерфейсов
Осуществлен только один интерфейс итератора. Класс описывает группу студентов
и осуществяет необходимый функционал только для работы с группой
 */
public class StudentGroup implements Iterable<Student> {
    private List<Student> studentsList;


    public List<Student> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(List<Student> studentsList) {
        this.studentsList = studentsList;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }
}
