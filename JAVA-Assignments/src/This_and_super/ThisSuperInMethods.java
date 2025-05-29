package This_and_super;
class Parent {
    void method1() {
        System.out.println("Used this() and super() in methods");
    }

    void method2() {
        this.method1();
    }
}
class Child extends Parent {
    void method3() {
        super.method2();
    }
}

public class ThisSuperInMethods {
    public static void main(String[] args) {
        Child c = new Child();
        c.method3();
    }
}
