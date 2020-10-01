package FivePointNine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentCreator {

    public static class Student {
        String name;
        int age;
        public Student(String name, int score) {
            this.name = name;
            this.age = score;
        }
    }


    static HashMap createStudentHashMap(int numberOfStudents) {
        Scanner scanner = new Scanner(System.in);
        int ageCreate;
        String nameCreate;
        HashMap<String, Integer> nameAndAge = new HashMap<String, Integer>();
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("What's the name of the student?");
            nameCreate = scanner.nextLine();
            System.out.println("Whats the age of the student?");
            ageCreate = Integer.parseInt(scanner.nextLine());
            nameAndAge.put(nameCreate, ageCreate);
        }
        return nameAndAge;
    }
    static ArrayList<Student> createStudentArrayList(HashMap nameAndScore){
        ArrayList students = new ArrayList();
        nameAndScore.forEach((key, value) -> students.add(new Student(key.toString(), (Integer) value)));
        return students;
    }
    static ArrayList<Student> createStudentArrayList(Map nameAndScore){
        ArrayList students = new ArrayList();
        nameAndScore.forEach((key, value) -> students.add(new Student(key.toString(), (Integer) value)));
        return students;
    }

    public static void main(String[] args) {
        HashMap studentshash = createStudentHashMap(2);
        System.out.println(studentshash);
    }
}
