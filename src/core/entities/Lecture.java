package core.entities;

public class Lecture {

    private int lectureId;
    private String lectureName;
    public static int lectureCount = 0;
    private int subjectId;
    private Subject subject;
    Homework homework;
    Teacher teacher;
    Student student;


    public Lecture(String lectureName, int lectureId) {
        this.lectureName = lectureName;
        this.lectureId = lectureId;
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
