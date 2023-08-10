package controller;

import model.Student;
import model.Teacher;
import model.Type;
import model.User;
import service.DataService;
import service.StudyGroupService;
import view.StudentView;

import java.util.List;

public class Controller {
    DataService dataService = new DataService();
    StudyGroupService studyGroupService = new StudyGroupService();
    public void createStudent(String firstName, String secondName, String lastName){
        dataService.create(firstName, secondName, lastName, Type.STUDENT);
    }

    public void getAllStudent(){
        List<User> userList = dataService.getAllStudent();
        StudentView view = new StudentView();
        for (User user: userList){
            view.printConsole((Student) user);
        }
    }

    public void FormNewGroup(Teacher teacher, List<Student> studentList){
        studyGroupService.formStudyGroup(teacher, studentList);
    }

}
