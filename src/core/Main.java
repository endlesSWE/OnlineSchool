package core;

import core.entities.Lecture;
import core.entities.Subject;

public class Main {

    public static void main (String [] args) {
        Subject subject = new Subject(1,"History");
        Subject subject1 = new Subject(2,"Biology");
        Subject subject2 = new Subject(3,"Literature");

        Lecture lecture = new Lecture("Introduction to Ancient Civilizations",1, subject);
        Lecture lecture1 = new Lecture("The Rise and Fall of the Roman Empire",2, subject);
        Lecture lecture2 = new Lecture("The Middle Ages: Feudalism and Knights",3, subject);
        Lecture lecture3 = new Lecture("The Renaissance and the Age of Discovery",4, subject);
        Lecture lecture4 = new Lecture("Introduction to Cell Biology", 1, subject1);
        Lecture lecture5 = new Lecture("Genetics and Inheritance", 2, subject1);
        Lecture lecture6 = new Lecture("Evolution and Natural Selection", 3, subject1);
        Lecture lecture7 = new Lecture("Human Anatomy and Physiology", 4, subject1);
        Lecture lecture8 = new Lecture("Introduction to Literary Analysis",1, subject2);
        Lecture lecture9 = new Lecture("Shakespearean Plays and Sonnets", 2, subject2);
        Lecture lecture10 = new Lecture("Romanticism and the Poetry of William Wordsworth", 3, subject2);
        Lecture lecture11 = new Lecture("Modernism and the Works of T.S. Eliot", 4, subject2);

        int subjectID = lecture5.subject().getSubjectId();
        System.out.println("Subject ID of 6th lecture: " + subjectID);

        Lecture.showLectureCount();
    }


}
