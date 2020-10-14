import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

class TestOrchestrator {

    private TestOrchestrator() {
    }
    private static class TestMethodGetter {
        static Method[] getTestMethods() throws ClassNotFoundException {
            Class<?> testSuit = Class.forName("tests");
            return testSuit.getDeclaredMethods();
        }
    }
    private static class TestMethodInvoker {
        public static  ArrayList<String> methodOutputs = new ArrayList<>();
        public static ArrayList<String> methodNames = new ArrayList<>();
        static ArrayList<String> invoke(Method[] methods) throws InvocationTargetException, IllegalAccessException {

            for (Method m:methods
            ) {
                methodNames.add(m.getName());
                methodOutputs.add(m.invoke(methods).toString());
            }
            return methodOutputs;
        }

    }
    private static class Summarizer{
        static void printSummary(ArrayList<String> methodOutputs){
            int count = 0;
            for (String output: methodOutputs
                 ) {
                System.out.print(TestMethodInvoker.methodNames.get(count) + "\t");
                System.out.println(methodOutputs.get(count));
                count++;
            }
        }
    }
    static void runTestSuite() throws InvocationTargetException, IllegalAccessException {
        try {
            Method[] testMethods = TestMethodGetter.getTestMethods();
            Summarizer.printSummary(TestMethodInvoker.invoke(testMethods));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
