import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        TestOrchestrator.getInstance().run();
    }
}
