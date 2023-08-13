/*
Принцип открытости/закрытости и принцип Лисков
Наследуется родительский класс User, тем самым наследуются функции и методы из него.
 */


public class Student extends User implements Comparable<Student> {
    private Long studentId;

    public Student(Long studentId, String firstName, String secondName, String lastName){
        super(firstName, secondName, lastName);
        this.studentId = studentId;
    }
    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

   @Override
    public int compareTo(Student o) {
       return this.studentId.compareTo(o.studentId);
    }
}
