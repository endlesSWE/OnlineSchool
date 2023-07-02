package core.utils;

import core.entities.Homework;

public class HomeworkUtils {
    private Homework homework;

    public HomeworkUtils(Homework homework) {
        this.homework = homework;
    }

    void printHomework(){
        System.out.println(homework);
    }
}