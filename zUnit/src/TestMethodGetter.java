
import java.lang.reflect.Method;

public class TestMethodGetter {

    tests tests = new tests();

    static Method[] getTestMethod(Class tests) throws ClassNotFoundException {
        Class c = tests.forName("tests");
        Method[] method = c.getDeclaredMethods();
        return method;
    }
}
