import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TeacherStateService {
    private TeacherState teacherState;
    public void removeTeacherByFIO(String lastName, String secondName, String firstName){
        Iterator<Teacher> iterator = teacherState.iterator();
        while (iterator.hasNext()){
            Teacher student = iterator.next();
            if (student.getFirstName().equals(firstName) && student.getSecondName().equals(secondName)&&
                    student.getLastName().equals(lastName)){
                iterator.remove();
            }
        }
    }
    public List<Teacher> getSortedTeacherList(){
        List<Teacher> teacherList = new ArrayList<>(teacherState.getTeacherList());
        Collections.sort(teacherList);
        return teacherList;
    }

    public List<Teacher> getSortedTeacherByFIO(){
        List<Teacher> teacherList = new ArrayList<>(teacherState.getTeacherList());
        teacherList.sort(new UserComparator());
        return teacherList;
    }

    public void createTeacher(Teacher teacher){
        this.teacherState.createTeacher(teacher);
    }
}
