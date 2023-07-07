package core.entities;

public class Teacher {
    private int teacherId;
    private String teacherName;
    private static int teacherCount = 0;
    Subject subject;
    Lecture lecture;
    Homework homework;


    public Teacher(int teacherId, String teacherName) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;

        teacherCount ++;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public static void showTeacherCount(){
        System.out.println("Total number of teachers: " + teacherCount);
    }
}
