package FivePointOne;

public class Method {

    public static String checkScore(int score){
        int passingScore = 60;

        if (score >= passingScore) {
            return "You pass the exam.";
        } else if (score == -1)
            return "break";
        else return "You don't pass the exam.";
    }
}
