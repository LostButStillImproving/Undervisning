package FivePointSeven;

public class TuitionCalculator {
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
    double calculateTotalTuition(int followYears, int fromYear) {
        double totalTuition = calculateTuitionPerYear(fromYear+1);

        for (int i = 1; i<followYears; i++){
            totalTuition += calculateTuitionPerYear(fromYear+i+1);
        }
        return (int) totalTuition;
    }

}
