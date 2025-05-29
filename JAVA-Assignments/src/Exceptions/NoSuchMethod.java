package Exceptions;
import java.lang.reflect.Method;

class E_14 {
    public void addition(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }
}

public class NoSuchMethod {
    public static void main(String[] args) {
        try {
            // Use correct fully qualified name of the class
            Class<?> c = Class.forName("Exceptions.E_14");

            // This method does NOT exist, so this line throws NoSuchMethodException
            Method m = c.getDeclaredMethod("subtraction", int.class, int.class);
        } catch (NoSuchMethodException | ClassNotFoundException e) {
            e.printStackTrace(); // Print full exception details
        }
    }
}
