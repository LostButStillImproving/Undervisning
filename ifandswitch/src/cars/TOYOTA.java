package cars;
public class TOYOTA implements Car {
    String model = "Sportage";
    @Override
    public void dyt(){
        System.out.println("beep bop dyt");
    }
    public String getName(){
        return model;
    }
}