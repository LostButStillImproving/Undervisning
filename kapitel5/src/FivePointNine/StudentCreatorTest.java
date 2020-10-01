package FivePointNine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static java.util.Map.entry;

public class StudentCreatorTest {
    public static void main(String[] args) {
        int numberOfStudents = 2;
        String studentName = "Mike";
        int studentScore = 25;

        //Test if a student is being made
        StudentCreator.Student student = new StudentCreator.Student("Mike", 10);
        testStudentClass(student);

        //test if two students are being made
        Map<String, Integer> studentsNameAndAges = Map.ofEntries(
                entry("Mike", 23),
                entry("Anders", 23)
        );
        ArrayList students = StudentCreator.createStudentArrayList(studentsNameAndAges);
        System.out.println("The arraylist contains " + students.size() + " students");
    }

    static Boolean testStudentClass(StudentCreator.Student student){
        if (student instanceof StudentCreator.Student){
            System.out.println("It made a student");
            return true;
        } else {
            System.out.println("This aint no student");
            return false;
        }

    }
}
