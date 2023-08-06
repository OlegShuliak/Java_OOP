package InterfaceIterable;

import InterfaceIterator.Student;

import java.util.Iterator;
import java.util.List;

public class StudentsGroupIterator implements Iterator<Student> {
    private int counter;
    private  final List<Student> studentList;

    public StudentsGroupIterator(StudentsGroup studentsGroup) {
        this.studentList = studentsGroup.getStudentsList();
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
