package Accessmodifiers;
class DefaultClass_02 {
    int myAge;
    String myName;

    void defaultMethod() {
        System.out.println("My name is " + myName + " and my age is " + myAge);
    }
}

public class DefaultClassFieldsMethod {
    public static void main(String[] args) {
        DefaultClass_02 obj = new DefaultClass_02();
        obj.myAge = 21;
        obj.myName = "Sharan";
        obj.defaultMethod();
    }
}