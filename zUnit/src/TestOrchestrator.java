import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
        static Map<String, String> buildResults(Method[] methods) throws InvocationTargetException, IllegalAccessException {

            for (Method m:methods
            ) {
                methodNames.add(m.getName());
                methodOutputs.add(m.invoke(methods).toString());
            }
            return IntStream.range(0, methodNames.size()).boxed()
                    .collect(Collectors.toMap(methodNames::get, methodOutputs::get));
        }
    }
    private static class Summarizer{
        static void printSummary(Map<String, String> mapOfMethodNamesAndOutputs){
            mapOfMethodNamesAndOutputs.forEach((k, v) -> System.out.println(k + "   " + v));
        }
    }
    static void runTestSuite() throws InvocationTargetException, IllegalAccessException {
        try {
            Summarizer.printSummary(TestMethodInvoker
                                                            .buildResults(TestMethodGetter.getTestMethods()));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
