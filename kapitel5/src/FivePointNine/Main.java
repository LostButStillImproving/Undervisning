package FivePointNine;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many students do you wish to add?");
        int numberOfStudents = scanner.nextInt();
        HashMap studentshash = StudentCreator.createStudentHashMap(numberOfStudents);

        Set studentshashset = studentshash.entrySet();
        List<String> list = new ArrayList<>();
        list.addAll(studentshashset);
        list.sort(Comparator.naturalOrder());


        }

 }

