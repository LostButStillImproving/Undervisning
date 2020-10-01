package FivePointNine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentCreator {


    public static class Student {
        String name;
        int age;

        public Student(String name, int age ) {
            this.name = name;
            this.age = age;
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
            ageCreate = scanner.nextInt();
            nameAndAge.put(nameCreate, ageCreate);
        }
        return nameAndAge;
    }
    static ArrayList<Student> create(HashMap nameAndAge){
        ArrayList students = new ArrayList();
        nameAndAge.forEach((key, value) -> students.add(new Student(key.toString(), (Integer) value)));
        return students;
    }

    public static void main(String[] args) {
        HashMap studentshash = createStudentHashMap(2);
        ArrayList students = create(studentshash);
        System.out.println(students);
    }
}
