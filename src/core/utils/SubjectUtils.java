package core.utils;

import core.entities.Subject;

public class SubjectUtils {

    private Subject subject;

    public SubjectUtils(Subject subject) {
        this.subject = subject;
    }

    void printSubject(){
        System.out.println(subject);
    }
}
