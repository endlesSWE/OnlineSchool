package core.entities;

public class Lecture {

    private int lectureId;
    private String lectureName;
    public static int lectureCount = 0;
    private Subject subject;
    Homework homework;
    Teacher teacher;
    Student student;


    public Lecture(String lectureName, int lectureId, Subject subject) {
        this.lectureName = lectureName;
        this.lectureId = lectureId;
        this.subject = subject;
        lectureCount ++;

    }
    public int getLectureId(){
        return lectureId;
    }
    public String getLectureName(){
        return lectureName;
    }
    public Subject subject(){
        return subject;
    }

    public Subject getSubjectId() {
        return subject;
    }

    public static void showLectureCount () {
        System.out.println("Total number of lectures: " + lectureCount);
    }

}
