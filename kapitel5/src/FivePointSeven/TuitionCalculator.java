package FivePointSeven;

public class TuitionCalculator {
    public class NotAPositiveInt extends Exception {
        public NotAPositiveInt(String errorMessage) {
            super(errorMessage);
        }
    }
    double startTuition;
    double interest;

    public TuitionCalculator(double startTuition, double interest) {
        this.startTuition = startTuition;
        this.interest = interest;
    }

    double calculateTuitionPerYear( int years) {
        double tuition = startTuition*Math.pow(interest, years);
        return tuition;
    }
    double calculateTotalTuition(int followYears, int fromYear) throws NotAPositiveInt {
        if (followYears < 0) throw new NotAPositiveInt("Not a positive number");
        double totalTuition = calculateTuitionPerYear(fromYear+1);

        for (int i = 1; i<followYears; i++){
            totalTuition += calculateTuitionPerYear(fromYear+i+1);
        }
        return (int) totalTuition;
    }

}
