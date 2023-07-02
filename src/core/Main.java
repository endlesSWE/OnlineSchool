package core;

import core.entities.Lecture;

public class Main {

    public static void main (String [] args) {
        Lecture lecture = new Lecture("Algebra",1);
        Lecture lecture1 = new Lecture("Mechanics",2);
        Lecture lecture2 = new Lecture("Geometry",3);
        Lecture lecture3 = new Lecture("Literature",4);

        Lecture.showLectureCount();
    }


}
