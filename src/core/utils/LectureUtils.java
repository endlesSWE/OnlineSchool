package core.utils;

import core.entities.Lecture;

public class LectureUtils {
    private Lecture lecture;

    public LectureUtils(Lecture lecture) {
        this.lecture = lecture;
    }

    void printLecture(){
        System.out.println(lecture);
    }
}
