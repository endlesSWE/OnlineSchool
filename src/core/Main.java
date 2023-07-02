package core;

import core.entities.Lecture;
import core.utils.LectureUtils;

public class Main {

    public static void main (String [] args) {
        Lecture lecture = new Lecture("Algebra",1);
        Lecture lecture1 = new Lecture("Mechanics",2);
        Lecture lecture2 = new Lecture("Geometry",3);
        Lecture lecture3 = new Lecture("Art", 4);
        Lecture lecture4 = new Lecture("History", 5);

        Lecture.showLectureCount();
    }


}
