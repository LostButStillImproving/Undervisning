package cars;

public interface Car {
    String getName();

    default void dyt(){
        System.out.println("dyt dyt");
    }
}
