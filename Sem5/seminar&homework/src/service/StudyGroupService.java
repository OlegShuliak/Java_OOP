package service;

import model.Student;
import model.Teacher;
import model.User;

import java.util.List;

public class StudyGroupService {
   private List<User> studyGroup;

    public void formStudyGroup(Teacher teacher, List<Student> studentList){
        studyGroup.add(teacher);
        studyGroup.addAll(studentList);
    }

    public List<User> getStudyGroup(){
        return studyGroup;
    }

}
