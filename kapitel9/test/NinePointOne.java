public class NinePointOne {
    static class Rectangle {
        double width = 1;
        double height = 1;

        Rectangle() {

        }

        Rectangle(Double width,Double height) {
            this.width = width;
            this.height = height;
        }

        Double getArea(){
            return this.width*this.height;
        }

        Double getPerimeter(){
            return (this.height+this.width) * 2;
        }

    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4.0, 40.0);
        Rectangle r2 = new Rectangle(3.5, 35.9);

        System.out.println(r1.width + " " + r1.height + " " + r1.getArea() + " " + r1.getPerimeter());
        System.out.println(r2.width + " " + r2.height + " " + r2.getArea() + " " + r2.getPerimeter());
    }
}
