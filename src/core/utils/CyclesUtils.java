package core.utils;

import core.entities.Lecture;

import java.util.Scanner;

public class CyclesUtils {

    public void setConsole(){

        Scanner scanner = new Scanner(System.in);
        String input;
        int lectureNum = 1;

        while(Lecture.lectureCount < 8) {

            System.out.print("Enter number of lectures (1-8) or 'close': ");
            input = scanner.nextLine();

            if(input.trim().equals("")) {
                System.out.println("Invalid input, please try again");
                continue;
            }

            if(input.equalsIgnoreCase("close")) {
                break;
            }

            int numLectures = Integer.parseInt(input);

            if(numLectures < 1 || numLectures > 8 - Lecture.lectureCount) {
                System.out.println("Invalid number, please try again.");
                continue;
            }

            for(int i=0; i<numLectures; i++) {
                if(Lecture.lectureCount < 8) {
                    Lecture lecture = new Lecture("Lecture " + lectureNum, lectureNum);
                    System.out.println(lecture.getLectureName());
                    lectureNum++;
                }
            }

        }

        scanner.close();

        System.out.println("Total lectures created: " + Lecture.lectureCount);



    }

}
