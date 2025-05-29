package This_and_super;
class Parent {
    String name = "Swetha";
    Parent() {
        System.out.println("This is parent class constructor");
    }
}
class Child extends Parent {
    String name = "Sam";
    Child() {
        super();
        System.out.println("This is child class constructor");
    }
    void myMethod() {
       System.out.println("My name is " + super.name);
    }
}

public class CallUsingSuper {
    public static void main(String[] args) {
        Child c = new Child();
        c.myMethod();
    }
}
