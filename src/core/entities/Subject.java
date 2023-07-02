package core.entities;

public class Subject {
    private int subjectId;
    private int subjectName;
    private static int subjectCount = 0;
    Teacher teacher;
    Student student;
    Lecture lecture;
    Homework homework;

    public Subject(int subjectId, int subjectName) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;

        subjectCount ++;
    }
    public static void showSubjectCount(){
        System.out.println("Total number of subjects: " + subjectCount);
    }
}
