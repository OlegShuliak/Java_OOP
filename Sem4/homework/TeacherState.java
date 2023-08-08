import java.util.Iterator;
import java.util.List;

public class TeacherState implements Iterable<Teacher>{
    private List<Teacher> teacherList;


    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public void createTeacher(Teacher teacher){
        this.teacherList.add(teacher);
    }
    @Override
    public Iterator<Teacher> iterator() {
        return new TaecherStateIterator(this);
    }
}
