package interfaces;

interface sam {
    default void defaultMethod() {
        System.out.println("This is a default method");
    }
}

class InterfaceDefaultMethod implements sam {
    public static void main(String[] args) {
        InterfaceDefaultMethod my = new InterfaceDefaultMethod();
        my.defaultMethod();
    }
}