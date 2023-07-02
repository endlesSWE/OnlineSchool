package core.entities;

public class Lecture {

    private int id;
    private String lectureName;
    public static int lectureCount = 0;
    Subject subject;
    Homework homework;
    Teacher teacher;
    Student student;


    public Lecture(String lectureName, int id) {
        this.lectureName = lectureName;
        this.id = id;
        lectureCount ++;

    }
    public static void showLectureCount () {
        System.out.println("Total number of lectures: " + lectureCount);
    }
}
