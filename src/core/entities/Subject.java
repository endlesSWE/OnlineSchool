package core.entities;

public class Subject {
    private int subjectId;
    private String subjectName;
    private static int subjectCount = 0;
    Teacher teacher;
    Student student;
    Lecture lecture;
    Homework homework;

    public Subject(int subjectId, String subjectName) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;

        subjectCount ++;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }


    public static void showSubjectCount(){
        System.out.println("Total number of subjects: " + subjectCount);
    }
}
