package FivePointNine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.BiConsumer;

public class StudentCreatorTest {
    public static void main(String[] args) {
        int numberOfStudents = 2;
        String studentName = "Mike";
        int studentAge = 25;

        //Test if a student is being made
        StudentCreator.Student student = new StudentCreator.Student("Mike", 10);
        testStudentClass(student);

        //test if two students are being made
        HashMap nameAndAge = StudentCreator.createStudentHashMap(2);
        ArrayList students = StudentCreator.create(nameAndAge);
        System.out.println(students);
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
