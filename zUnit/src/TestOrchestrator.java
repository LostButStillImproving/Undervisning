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
    private static class TestMethodGetter {
        static Method[] getTestMethods() throws ClassNotFoundException {
            Class c = Class.forName("tests1");
            return c.getDeclaredMethods();
        }
    }
    private static class TestMethodInvoker {
        public static  ArrayList<String> results = new ArrayList<>();
        public static ArrayList<String> methodNames = new ArrayList<>();
        static ArrayList<String> invoke(Method[] methods) throws InvocationTargetException, IllegalAccessException {

            for (Method m:methods
            ) {
                methodNames.add(m.getName());
                results.add(m.invoke(methods).toString());
            }
            return results;
        }

    }
    private static class Summarizer{
        static void printSummary(ArrayList<String> results){
            for (int i = 0; i < results.size() ; i++) {
                System.out.print(TestMethodInvoker.methodNames.get(i) + "\t");
                System.out.println(results.get(i));
            }
        }
    }
    void run() throws InvocationTargetException, IllegalAccessException {
        try {
            Method[] testMethods = TestMethodGetter.getTestMethods();
            Summarizer.printSummary(TestMethodInvoker.invoke(testMethods));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
