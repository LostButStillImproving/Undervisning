package NinePointEight;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final static int FAST = 3;

    private int speed;
    private Boolean on = false;
    private Double radius = 5.0;
    String colour = "blue";

    Fan(int speed, String colour, double radius) {
        this.speed = speed;
        this.colour = colour;
        this.radius = radius;
    }
    public Boolean getOn() {
        return on;
    }

    public void setOn() {
        this.on = true;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String toString(){
        if (this.on == true) {
            return "FAN SPEED: " + this.speed + " color: " + this.colour + " radius: " + this.radius;
        } else return "color: " + this.colour + " radius: " + this.radius + "\n" + "Fan is OFF";

    }

    public static void main(String[] args) {
        Fan fan = new Fan(3,"yellow", 10.);
        Fan fan1 = new Fan(2, "blue", 5.);
        System.out.println(fan.toString());
        System.out.println(fan1.toString());
        fan.setOn();
        fan1.setOn();
        System.out.println(fan.toString());
        System.out.println(fan1.toString());
        System.out.println();
    }

}
