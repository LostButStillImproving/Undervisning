import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Studerende Mike = new Studerende();
        Studerende Mikkel = new Studerende();
        Studerende Kim = new Studerende();
        Studerende Anders = new Studerende();
        Studerende Mathias = new Studerende();

        Mike.age = 29;
        Mike.city = "Næstved";
        Mike.name = "Mike";

        Mikkel.age = 27;
        Mikkel.city = "Randers Regnskov";
        Mikkel.name = "Mikkel";

        Kim.age = 29;
        Kim.city = "Næstved";
        Kim.name = "Kim";

        Anders.age = 26;
        Anders.city = "Vordingbord";
        Anders.name = "Anders";

        Mathias.age = 23;
        Mathias.city = "Næstved";
        Mathias.name = "Mathias";

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
