package singleton;

public class Student {
    // make constructor private
    private Student() {
    }
    // create instance variable
    private static Student student;

    //
    public static Student getStudent(){
        if (student == null) student = new Student();
        return student;
    }

}

