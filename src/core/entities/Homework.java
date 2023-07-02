package core.entities;

public class Homework {
    private int homeworkId;
    private String homeworkName;
    private static int homeworkCount = 0;
    Subject subject;
    Lecture lecture;
    Student student;
    Teacher teacher;


    public Homework(int homeworkId, String homeworkName) {
        this.homeworkId = homeworkId;
        this.homeworkName = homeworkName;

        homeworkCount ++;
    }
    public static void showHomeworkCount (){
        System.out.println("Total number of homeworks: " + homeworkCount);
    }
}
