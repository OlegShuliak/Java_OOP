

import java.util.Iterator;
import java.util.List;

/*
Принцип единой ответственности и принцип разделения интерфейсов
Осуществлен только один интерфейс итератора. Класс описывает только функционал итератора
для работы с группой студенов
 */
public class StudentGroupIterator implements Iterator<Student> {
    private int counter;
    private  final List<Student> studentList;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentList = studentGroup.getStudentsList();
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < studentList.size() - 1;
    }

    @Override
    public Student next() {
        if (!hasNext()){
            return null;
        }
        counter++;
        return studentList.get(counter);
    }


    @Override
    public void remove() {
        studentList.remove(counter);
    }
}
