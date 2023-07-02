package core.utils;

import core.entities.Student;

public class StudentUtils {

    private Student student;

    public StudentUtils(Student student) {
        this.student = student;
    }

    void printStudent(){
        System.out.println(student);
    }
}