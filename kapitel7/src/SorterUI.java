import java.util.Scanner;
public class SorterUI {

  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      System.out.println("Gimme a string to sort");
      String string = scan.nextLine();
      System.out.println(Sorter.sort(string));;

  }
}
