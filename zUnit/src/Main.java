import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, IllegalAccessException {
        ArrayList<String> results = new ArrayList<>();
        ArrayList<String> methodName = new ArrayList<>();
        Method[] methods = TestMethodGetter.getTestMethod(tests.class);

        for (Method m:methods
        ) {
            methodName.add(m.getName());
            results.add(m.invoke(methods).toString());
        }
        for (int i = 0; i < methods.length ; i++) {
            System.out.print(methodName.get(i) + "\t");
            System.out.println(results.get(i));

        }
    }
}
