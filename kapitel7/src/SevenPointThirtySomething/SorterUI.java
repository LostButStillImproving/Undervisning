package SevenPointThirtySomething;

import java.util.Scanner;
public class SorterUI {

  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      System.out.println("Gimme a string to sortString");
      String string = scan.nextLine();
      System.out.println(Sorter.sortString(string));

  }
}
