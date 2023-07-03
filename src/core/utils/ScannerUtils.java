package core.utils;

import core.entities.Lecture;
import core.entities.Student;
import core.entities.Subject;
import core.entities.Teacher;

import java.util.Scanner;

public class ScannerUtils {

    public void setUpConsole() {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Please choose the category (Attention! Use only numbers from 0 to 4!)");
        System.out.println("1 — open to create new Subject");
        System.out.println("2 — open to create new Teacher");
        System.out.println("3 — open to create new Student");
        System.out.println("4 — open to create new Lecture");
        System.out.println("0 — shut down");

        final int type = scanner.nextInt();

        Subject subject;
        Teacher teacher;
        Student student;
        Lecture lecture;

        switch (type) {
            case 1:
                subject = createSubjectFromUserInput();
                System.out.println("New subject's ID — " + subject.getSubjectId() + "; new subject's Name — " + subject.getSubjectName());
                System.out.println("Do you want to create another subject? (Y/N)");
                scanner.nextLine();
                String choice = scanner.nextLine();
                if (choice.equals("Y")){
                    subject = createSubjectFromUserInput();
                    System.out.println("New subject's ID — " + subject.getSubjectId() + "; new subject's Name — " + subject.getSubjectName());
                }
                if (choice.equals("N")) {
                    System.out.println("Shutting down...");
                    System.exit(0);
                }
                break;

            case 2:
                teacher = createTeacherFromUserInput();
                System.out.println("New teacher's ID — " + teacher.getTeacherId() + "; new teacher's Name — " + teacher.getTeacherName());
                System.out.println("Do you want to create another teacher? (Y/N)");
                scanner.nextLine();
                String choice1 = scanner.nextLine();
                if (choice1.equals("Y")){
                    teacher = createTeacherFromUserInput();
                    System.out.println("New teacher's ID — " + teacher.getTeacherId() + "; new teacher's Name — " + teacher.getTeacherName());
                }
                if (choice1.equals("N")) {
                    System.out.println("Shutting down...");
                    System.exit(0);
                }
                break;

            case 3:
                student = createStudentFromUserInput();
                System.out.println("New student's ID — " + student.getStudentId() + "; new student's Name — " + student.getStudentName());
                System.out.println("Do you want to create another student? (Y/N)");
                scanner.nextLine();
                String choice2 = scanner.nextLine();
                if (choice2.equals("Y")){
                    student = createStudentFromUserInput();
                    System.out.println("New student's ID — " + student.getStudentId() + "; new student's Name — " + student.getStudentName());
                }
                if (choice2.equals("N")) {
                    System.out.println("Shutting down...");
                    System.exit(0);
                }
                break;

            case 4:
                lecture = createLectureFromUserInput();
                System.out.println("New lecture's ID — " + lecture.getLectureId() + "; new lecture's Name — " + lecture.getLectureName());
                System.out.println("Do you want to create another lecture? (Y/N)");
                scanner.nextLine();
                String choice3 = scanner.nextLine();
                if (choice3.equals("Y")){
                    lecture = createLectureFromUserInput();
                    System.out.println("New lecture's ID — " + lecture.getLectureId() + "; new lecture's Name — " + lecture.getLectureName());
                }
                if (choice3.equals("N")) {
                    System.out.println("Shutting down...");
                    System.exit(0);
                }
                break;

            case 0:
                System.out.println("Shutting down...");
                System.exit(0);
                break;

            default:
                System.out.println("Invalid choice!");
                break;
        }
    }

    private Subject createSubjectFromUserInput() {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the subject ID:");
        int subjectId = scanner.nextInt();

        System.out.println("Enter the subject name:");
        scanner.nextLine();
        String subjectName = scanner.nextLine();

        return new Subject(subjectId, subjectName);
    }

    private Teacher createTeacherFromUserInput() {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Enter teacher's ID:");
        int teacherId = scanner.nextInt();

        System.out.println("Enter teacher's name:");
        scanner.nextLine();
        String teacherName = scanner.nextLine();

        return new Teacher(teacherId, teacherName);
    }

    private Student createStudentFromUserInput(){
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student's Id:");
        int studentId = scanner.nextInt();

        System.out.println("Enter student's Name:");
        scanner.nextLine();
        String studentName = scanner.nextLine();

        return new Student(studentId, studentName);
    }

    private Lecture createLectureFromUserInput(){
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Enter lecture's Id:");
        int lectureId = scanner.nextInt();

        System.out.println("Enter lecture's Name:");
        String lectureName = scanner.nextLine();

        return new Lecture(lectureName, lectureId, );
    }

}

