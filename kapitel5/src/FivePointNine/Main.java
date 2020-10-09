package FivePointNine;
import java.util.*;

import static FivePointNine.StudentCreator.*;



public class Main {
        public static int rowSumOddNumbers(int n) {
            int firstInt = 1;
            if (n == 1){
                return 1;
            }
            int step = 2;
            for (int k = 1; k < n; k++) {
                firstInt += step;
                step += 2;
            }
            int counter = 0;
            int sum = firstInt;
            while (counter < n-1) {
                sum += firstInt +2;
                firstInt += 2;
                counter++;
            }
            return sum;
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many students do you wish to add?");
        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        Student[] studentlist = createStudentList(numberOfStudents);
        fillStudentList(studentlist, numberOfStudents);
        int[] scores = StudentSorter.sort(studentlist, numberOfStudents);
        System.out.println(studentlist[scores[0]].name + " had the lowest score of: " + studentlist[scores[0]].score +
                " and " + studentlist[scores[1]].name + " had the second lowest score: of " + studentlist[scores[1]].score);
    }
 }
