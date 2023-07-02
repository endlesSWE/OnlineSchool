package core.utils;

import core.entities.Teacher;

public class TeacherUtils {

    private Teacher teacher;

    public TeacherUtils(Teacher teacher) {
        this.teacher = teacher;
    }

    void printTeacher(){
        System.out.println(teacher);
    }
}
