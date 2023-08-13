
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/*
Принцип единственной ответственности
Описаны методы работы с группой студентов
 */
public class StudentGroupService {
    private StudentGroup studentGroup;
    public void removeStudentByFIO(String lastName, String secondName, String firstName){
        Iterator<Student> iterator = studentGroup.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if (student.getFirstName().equals(firstName) && student.getSecondName().equals(secondName)&&
            student.getLastName().equals(lastName)){
                iterator.remove();
            }
        }
    }
    public List<Student> getSortedStudentList(){
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentsList());
        Collections.sort(studentList);
        return studentList;
    }

    public List<Student> getSortedStudentByFIO(){
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentsList());
        studentList.sort(new UserComparator());
        return studentList;
    }
}
