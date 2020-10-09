package FivePointNine;

import java.util.Scanner;

public class StudentCreator {

    static class Student {
        String name;
        int score;

        public Student(String name, int score){
            this.name = name;
            this.score = score;
        }
    }

     static Student[] createStudentList(int numberOfStudents) {
        Scanner scanner = new Scanner(System.in);
        Student[] list = new Student[numberOfStudents];
        return list;
    }
    static void fillStudentList(Student[] list, int numberOfStudents){
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("What's the name of the student?");
            String nameCreate = scanner.nextLine();
            System.out.println("Whats the score of the student?");
            int scoreCreate = Integer.parseInt(scanner.nextLine());

            list[i] = new Student(nameCreate, scoreCreate);
        }
    }
}

