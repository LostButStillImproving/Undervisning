import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

class TestOrchestrator {
    private static TestOrchestrator single_instance = null;
    public static TestOrchestrator getInstance(){
        if (single_instance == null){
            single_instance = new TestOrchestrator();
        }
        return single_instance;
    }
    private static TestMethodGetter methodGetter = new TestMethodGetter();
    private static TestMethodInvoker methodInvoker = new TestMethodInvoker();
    private static Summarizer Summarizer = new Summarizer();
    private static Method[] methods;
    private static ArrayList<String> results = new ArrayList<>();
    private static ArrayList<String> methodNames = new ArrayList<>();
    protected static class TestMethodGetter {
        void getTestMethods(Class tests) throws ClassNotFoundException {
            Class c = tests.forName("tests1");
            methods = c.getDeclaredMethods();
        }
    }
    protected static class TestMethodInvoker {
        void invoke(Method[] methods) throws InvocationTargetException, IllegalAccessException {
            for (Method m:methods
            ) {
                methodNames.add(m.getName());
                results.add(m.invoke(methods).toString());
            }
        }

    }
    protected static class Summarizer{
        void printSummary(ArrayList results){
            for (int i = 0; i < results.size() ; i++) {
                System.out.print(methodNames.get(i) + "\t");
                System.out.println(results.get(i));
            }
        }
    }
    void run() throws InvocationTargetException, IllegalAccessException {
        try {
            methodGetter.getTestMethods(tests.class);
            methodInvoker.invoke(methods);
            Summarizer.printSummary(results);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
