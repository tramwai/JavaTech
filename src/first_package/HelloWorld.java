package first_package;

import singleton.Student;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Mihail");
        System.out.println("Hariton");

        Student student = Student.getStudent();
        System.out.println(student);
    }
}
