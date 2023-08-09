package model;

public class Teacher extends User {
    private int teacherID;

    public Teacher(String firstName, String secondName, String lastName, int teacherID) {
        super(firstName, secondName, lastName);
        this.teacherID = teacherID;
    }

    public int getTeacherId() {
        return teacherID;
    }

    public void setTeacherId(int teacherID) {
        this.teacherID = teacherID;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                "teacherID=" + teacherID +
                '}';
    }
}
