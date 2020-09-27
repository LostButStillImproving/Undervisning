package cars;

public class KIA implements Car {
    String model = "Sportage";
    @Override
    public void dyt(){
        System.out.println("dyt dyt dyt");
    }
    public String getName(){
        return model;
    }
}
