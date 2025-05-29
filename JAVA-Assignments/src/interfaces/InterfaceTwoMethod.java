package interfaces;
interface sam {
    void methodOne();
    void methodTwo();
}
public class InterfaceTwoMethod implements sam {
    public void methodOne() {
        System.out.println("First Method");
    }

    public void methodTwo() {
        System.out.println("Second Method");
    }

    public static void main(String[] args) {
        InterfaceTwoMethod my= new InterfaceTwoMethod();
        my.methodOne();
        my.methodTwo();
    }
}
