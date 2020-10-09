package FivePointNine;

public class StudentCreatorTest {
    public static void main(String[] args) {
        StudentCreator studentCreator = new StudentCreator();
        int numberOfStudents = 2;
        String studentName = "Mike";
        int studentScore = 25;

        //Test if a studentlist is being made
        StudentCreator.Student[] list = studentCreator.createStudentList(10);
        testStudentClass(list);

        //test if a student is being made
        list[0] = new StudentCreator.Student(studentName, studentScore);
        System.out.println(list[0].name + ' ' + list[0].score);
    }

    static Boolean testStudentClass(StudentCreator.Student[] list){
        if (list instanceof StudentCreator.Student[]){
            System.out.println("It made a list of students");
            return true;
        } else {
            System.out.println("This aint no student");
            return false;
        }

    }
}
