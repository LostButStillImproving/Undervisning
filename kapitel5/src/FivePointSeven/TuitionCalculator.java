package FivePointSeven;

public class TuitionCalculator {
    public class NotAPositiveNumberException extends Exception {
        public NotAPositiveNumberException(String errorMessage) {
            super(errorMessage);
        }
    }
    double startTuition;
    double interest;

    public TuitionCalculator(double startTuition, double interest) throws NotAPositiveNumberException {
        if (startTuition < 0 || interest < 0) throw new NotAPositiveNumberException("Not a positive number");
        this.startTuition = startTuition;
        this.interest = interest;
    }

    double calculateTuitionPerYear( int years) throws NotAPositiveNumberException {
        if (years < 0) throw new NotAPositiveNumberException("Not a positive number");
        double tuition = startTuition*Math.pow(interest, years);
        return tuition;
    }
    double calculateTotalTuition(int followYears, int fromYear) throws NotAPositiveNumberException {
        if (followYears < 0 || fromYear < 0) throw new NotAPositiveNumberException("Not a positive number");
        double totalTuition = calculateTuitionPerYear(fromYear+1);

        for (int i = 1; i<followYears; i++){
            totalTuition += calculateTuitionPerYear(fromYear+i+1);
        }
        return (int) totalTuition;
    }

}
