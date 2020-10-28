package SevenPointThirtySeven;

import java.util.Random;
import java.util.Scanner;

public class BeanMachine {

    Random random = new Random();
    Scanner scan = new Scanner(System.in);
    private int ballCount;
    private int[] slots;

    private String paths = "";

    private int dertermineSlot() {

        int countRIGHT = 0;

        for (int i = 0; i < slots.length - 1; i++) {

            if (random.nextBoolean()) {
                paths +=  "R";
                countRIGHT++;
            } else paths += "L";
        }
        return countRIGHT;
    }

    private void howManySlots(){
        System.out.println("How many slots are there?");
        var slotCount = scan.nextInt();
        this.slots = new int[slotCount];


    }
    private void howManyBalls(){
        System.out.println("How many balls do you wish to drop?");
        this.ballCount = scan.nextInt();
    }

    private void increaseSlotBallCount(int slotToBeIncreased){
        slots[slotToBeIncreased] += 1;
    }

  private void printResult() {
      for (int i = 1; i < paths.length() + 1 ; i++) {
        if (i % (slots.length - 1)  == 0) {
            System.out.println(paths.charAt(i - 1) + "\n");
        } else System.out.print(paths.charAt(i - 1));
    }
  }
    public void startGame(){

        howManySlots();
        howManyBalls();
        for (int i = 0; i < ballCount; i++) {
            increaseSlotBallCount(dertermineSlot());
        }
        printResult();
    }
}
