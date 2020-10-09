class GrassHopper {

    public static int summation(int n) {
        int sum = 0;
        int number = n;

        do {
            sum += number;
            number -= 1;
        } while (n > 0);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(summation(4));
    }
}