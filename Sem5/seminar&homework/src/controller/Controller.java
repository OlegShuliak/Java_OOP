package controller;

import model.Student;
import model.Type;
import model.User;
import service.DataService;
import view.StudentView;

import java.util.List;

public class Controller {
    DataService dataService = new DataService();
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
}
