package interfaces;
interface Jala_5 {
    void sameMethod();
}

//interface 2
interface Jala_05 {
    void sameMethod();
}

class TwoInterfaceSameMethod implements Jala_5, Jala_05 {
    public void sameMethod() {
        System.out.println("This is same method in both the interfaces");
    }
    public static void main(String[] args) {
        TwoInterfaceSameMethod if5 = new TwoInterfaceSameMethod();
        if5.sameMethod();
    }
}
