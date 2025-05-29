package This_and_super;
public class CallUsingThis {

    int num;
    String name;

    CallUsingThis() {
        this(27,"Swetha");
    }

    CallUsingThis(int num, String name) {
        this.num = num;
        this.name = name;
        System.out.println(num + " " + name);
    }

    public static void main(String[] args) {
        CallUsingThis ts1 = new CallUsingThis();
        CallUsingThis ts = new CallUsingThis(12, "Sam");
    }
}
