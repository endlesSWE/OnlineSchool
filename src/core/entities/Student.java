package core.entities;

public class Student {
    private int studentId;
    private String studentName;
    private static int studentCount = 0;
    Subject subject;
    Lecture lecture;
    Homework homework;


    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;

        studentCount ++;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public static void showStudentCount(){
        System.out.println("Total number of students:" + studentCount);
    }
}
