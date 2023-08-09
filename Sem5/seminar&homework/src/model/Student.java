package model;

public class Student extends User{

    private int studentID;

    public Student(String firstName, String secondName, String lastName, int studentID) {
        super(firstName, secondName, lastName);
        this.studentID = studentID;
    }

    public int getStudentId() {
        return studentID;
    }

    public void setStudentId(int studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                "studentID=" + studentID +
                '}';
    }
}
