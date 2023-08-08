public class Teacher extends User implements Comparable<Teacher>{

    private Long teacherId;

    public Teacher(String firstName, String secondName, String lastName, Long teacherId) {
        super(firstName, secondName, lastName);
        this.teacherId = teacherId;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId + '\'' +
                "firstName=" + super.getFirstName() + '\'' +
                "secondName=" + super.getSecondName() + '\'' +
                "lastName=" + super.getLastName() +
                '}';
    }

    @Override
    public int compareTo(Teacher o) {
        return this.teacherId.compareTo(o.teacherId);
    }
}
