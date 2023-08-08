import java.util.Iterator;
import java.util.List;

public class TaecherStateIterator implements Iterator<Teacher> {
    private int counter;
    private  final List<Teacher> teacherList;

    public TaecherStateIterator(TeacherState teacherState) {
        this.teacherList = teacherState.getTeacherList();
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < teacherList.size() - 1;
    }

    @Override
    public Teacher next() {
        if (!hasNext()){
            return null;
        }
        counter++;
        return teacherList.get(counter);
    }


    @Override
    public void remove() {
        teacherList.remove(counter);
    }
}
