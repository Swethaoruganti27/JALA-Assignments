package basics;
public class LocalGlobalVariables {
    int a = 11;
    public void localVariable() {
        int a = 22;
        System.out.println("Local variable a : " + a);
    }

    public static void main(String[] args) {
        LocalGlobalVariables obj = new LocalGlobalVariables();
        System.out.println("Instance variable a : " + obj.a);
        obj.localVariable();
    }
}