package InterfaceIterable;

import InterfaceIterator.Student;

public class StudentController {

    public static void main(String[] args){

        Student student1 = new Student(12, "Сидоров","Петр","Иванович");
        Student student2 = new Student(18, "Седакова","Анна","Александровна");
        Student student3 = new Student(11, "Кублицкий","Сергей","Сергеевич");
        Student student4 = new Student(14, "Шульц","Виктория","Иосифовна");
        Student student5 = new Student(19, "Комаров","Виктор","Петрович");
        Student student6 = new Student(10, "Пушкин","Александр","Сергеевич");

        StudentsGroup studentsGroup = new StudentsGroup();
        studentsGroup.addStudent(student1);
        studentsGroup.addStudent(student2);
        studentsGroup.addStudent(student3);
        studentsGroup.addStudent(student4);
        studentsGroup.addStudent(student5);
        studentsGroup.addStudent(student6);

        StudentsGroupService studentsGroupService = new StudentsGroupService();
        studentsGroupService.setStudentsGroup(studentsGroup);
        System.out.println(studentsGroup);

        studentsGroupService.removeStudent("Кублицкий","Сергей","Сергеевич");
        System.out.println(studentsGroup);
    }
}
