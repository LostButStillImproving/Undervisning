import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Studerende> studerende = new Arraylist(Studerende Mikkel = new Studerende("Mikkel",27, "Randers Regnskov", "Datamatiker"),
                Studerende Kim = new Studerende("Kim", 29),
                Studerende Anders = new Studerende("Anders", 26, "Næstved"),
                Studerende Mathias = new Studerende("Mathias", 23),
                Studerende Mike = new Studerende("Mike", 29));




        Boolean done = false;
        while (!done) {
            try {
                System.out.println("show age of student: ");
                String student = scan.nextLine();
                switch (student) {
                    case "Mike" -> {
                        System.out.println("Mike is " + Mike.getAge() + " years old"); done = true;
                    }
                    case "Anders" -> {
                        System.out.println("Anders is " + Anders.getAge() + " years old"); done = true;
                    }
                    case "Mikkel" -> {
                        System.out.println("Mikkel is " + Mikkel.getAge() + " years old"); done = true;
                    }
                    case "Kim" -> {
                        System.out.println("Kim is " + Kim.getAge() + " years old"); done = true;
                    }
                    case "Mathias" -> {
                        System.out.println("Mathias is " + Mathias.getAge() + " years old"); done = true;
                    }
                    default -> throw new IllegalStateException();
                }
            } catch (Exception e) {
                System.out.println("This student isnt't a member");
            }
        }
    }
}
