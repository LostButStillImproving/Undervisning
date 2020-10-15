package NinePointEight;

public class Fan {
    public final static int SLOW = 1;
    public final static int MEDIUM = 2;
    public final static int FAST = 3;

    private int speed;
    private Boolean on = false;
    private final Double radius;
    String colour;

    Fan() {
        this.colour = "blue";
        this.speed = SLOW;
        this.on = false;
        this.radius = 5.0;
    }
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

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public String toString(){
        if (this.on) {
            return "FAN SPEED: " + this.speed + " color: " + this.colour + " radius: " + this.radius;
        } else return "color: " + this.colour + " radius: " + this.radius + "\n" + "Fan is OFF";

    }

    public static void main(String[] args) {
        Fan fan = new Fan(SLOW,"yellow", 10.);
        Fan fan1 = new Fan(FAST, "blue", 5.);
        Fan fan2 = new Fan(MEDIUM, "blue", 3.);
        Fan fanDefault = new Fan();
        System.out.println(fan.toString());
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
        fan.setOn();
        fan1.setOn();
        fan2.setOn();
        fan.setSpeed(FAST);
        System.out.println(fan.toString());
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
        System.out.println(fanDefault.toString());
    }

}
