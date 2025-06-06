package operators;
public class IncrementDecrement {
    static void preIncrement(int a, int b) {
        int d;                 
        d = b + (++a);          
        System.out.println("Values after Pre-Increment a,b : " + a + "," + d);
    }

    static void postIncrement(int a, int b) {
        int d;                  
        d = b + (a++);          
        System.out.println("Values after Post-Increment a,b : " + a + "," + d);
    }
    static void preDecrement(int a, int b) {
        int d;                  
        d = b + (--a);          
        System.out.println("Values after Pre-Decrement a,b : " + a + "," + d);//a=9,b=14
    }

    static void postDecrement(int a, int b) {
        int d;                  
        d = b + (a--);          
        System.out.println("Values after Post-Decrement a,b : " + a + "," + d);//a=9,b=15
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        preIncrement(a, b);
        postIncrement(a, b);
        preDecrement(a, b);
        postDecrement(a, b);
    }
}