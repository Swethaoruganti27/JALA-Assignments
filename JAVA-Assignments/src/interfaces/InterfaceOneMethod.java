package interfaces;
interface sam {
    void oneMethod();
}

public class InterfaceOneMethod implements sam {
    @Override
    public void oneMethod() {
        System.out.println("This is a method");
    }

    public static void main(String[] args) {
        InterfaceOneMethod my = new InterfaceOneMethod();
        my.oneMethod();
    }
}