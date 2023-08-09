package service;

import model.Student;
import model.Teacher;
import model.Type;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    private List<User> userList;

    public void create(String firstName, String secondName, String lastName, Type type){
        int id = getFreeID(type);
        if (Type.STUDENT == type){
            Student student = new Student(firstName, secondName, lastName, id);
            userList.add(student);
        }
        if (Type.TEACHER == type){
            Teacher teacher = new Teacher(firstName, secondName, lastName, id);
            userList.add(teacher);
        }
    }

    public User getUserID(Type type, int id){
        User resultUser = null;
        boolean itsStudent = Type.STUDENT == type;
        for (User user : userList) {
            if (itsStudent && user instanceof Student && ((Student) user).getStudentId() == id) {
                resultUser = user;
            }
            if (!itsStudent && user instanceof Teacher && ((Teacher) user).getTeacherId() == id) {
                resultUser = user;
            }
        }
        return resultUser;
    }

    public List<User> getAllUsers(){
        return  userList;
    }

    public List<User> getAllStudent(){
        List<User> resultList = new ArrayList<>();
        for (User user: userList){
            if (user instanceof Student){
                resultList.add(user);
            }
        }
        return resultList;
    }

    private int getFreeID(Type type) {
        int lastID = 1;
        boolean itsStudent = Type.STUDENT == type;
        for (User user : userList) {
            if (itsStudent && user instanceof Student) {
                lastID = ((Student) user).getStudentId() + 1;
            }
            if (!itsStudent && user instanceof Teacher) {
                lastID = ((Teacher) user).getTeacherId() + 1;
            }
        }
        return lastID;
    }

}
