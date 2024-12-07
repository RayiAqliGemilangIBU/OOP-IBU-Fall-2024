package week10.secondTask;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class run {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        List<Integer> grades = Arrays.asList(90, 85, 95, 88, 92);
        gradeAnalyzer gradeAnalyzer = new gradeAnalyzer(grades);
        Class<?> gradeAnalyzerClass = gradeAnalyzer.getClass();

        Field[] fields = gradeAnalyzerClass.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            System.out.println("Field name: " + field.getName() + ", Value: " + field.get(gradeAnalyzer));
        }

        Method[] methods = gradeAnalyzerClass.getDeclaredMethods();
        for (Method method : methods) {
            if (method.getName().startsWith("calculate") || method.getName().startsWith("print")) {
                System.out.println("Method name: " + method.getName() + ", Result: " + method.invoke(gradeAnalyzer));
            }
        }
    }
}
