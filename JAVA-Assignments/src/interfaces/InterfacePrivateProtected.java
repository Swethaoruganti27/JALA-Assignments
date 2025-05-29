package interfaces;
interface sam {

    public int num1 = 11;
    static final int num2 = 22;
    final int num3 = 33;
}

class InterfacePrivateProtected implements sam {

    public static void main(String[] args) {
        System.out.println(sam.num1 + " " + sam.num2);
    }
}
