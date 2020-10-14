package NinePointOne;

public class NinePointOne {
    public static class rectangle {
        double width = 1;
        double height = 1;

        public rectangle() {

        }

        public rectangle(Double width, Double height) {
            this.width = width;
            this.height = height;
        }

        public Double getArea(){
            return this.width*this.height;
        }

        public Double getPerimeter(){
            return (this.height+this.width) * 2;
        }

    }

    public static void main(String[] args) {
       rectangle r1 = new rectangle(4.0, 40.0);
       rectangle r2 = new rectangle(3.5, 35.9);

       System.out.println(r1.width + " " + r1.height + " " + r1.getArea() + " " + r1.getPerimeter());
       System.out.println(r2.width + " " + r2.height + " " + r2.getArea() + " " + r2.getPerimeter());
    }
}
