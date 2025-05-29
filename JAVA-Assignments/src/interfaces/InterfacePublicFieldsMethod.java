package interfaces;
public interface InterfacePublicFieldsMethod {
    int num = 563; 
    public void myMethod();
}

class sam implements InterfacePublicFieldsMethod {
    public void myMethod() {
        System.out.println("This is a method");
    }

    public static void main(String[] args) {
        sam j = new sam();
        System.out.println(num);
        j.myMethod();
    }
}