
public class Circle {
    private static double radius = 1;
    /** Find the area of this circle */
    public double getArea() {
        return radius * radius * Math.PI;
    }
    public static void main(String[] args) {
        Circle myCircle = new Circle();
        System.out.println("Radius is " + Circle.radius);

    }

}