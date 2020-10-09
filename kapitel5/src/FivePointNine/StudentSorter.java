package FivePointNine;

import java.util.ArrayList;

import static FivePointNine.StudentCreator.*;

public class StudentSorter {


    static int[] sort(Student[] array, int length){
        ArrayList<Integer> arrayOfScores = new ArrayList<Integer>();
        for (Student student:array
        ) {
            arrayOfScores.add(student.score);
        }
        int lowestScore = Integer.MAX_VALUE-1;
        int secondLowestScore = Integer.MAX_VALUE;
        int positionOfLowestScore = 0;
        int positionOfSecondLowestScore = 0;

        int[] positionsOfScores = new int[length];
        int index = 0;
        for (int score:
             arrayOfScores) {
             if (score < secondLowestScore) {
                 if (score < lowestScore) {
                     positionOfSecondLowestScore = positionOfLowestScore;
                     positionOfLowestScore = index;
                     secondLowestScore = lowestScore;
                     lowestScore = score;
                     index++;
                 } else {
                     positionOfSecondLowestScore = index;
                     secondLowestScore = score;
                     index++;
                 }
             }
            if (score < lowestScore) {
                lowestScore = score;
                positionOfLowestScore = index;
            }
        }
        positionsOfScores[0] = positionOfLowestScore;
        positionsOfScores[1] = positionOfSecondLowestScore;
        return positionsOfScores;
    }
}
