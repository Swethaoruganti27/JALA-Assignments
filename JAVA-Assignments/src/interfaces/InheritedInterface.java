package interfaces;

interface Animal {
    void methodOne();
}

//inherited interface
interface dog extends Animal {
    void methodTwo();
}

class InheritedInterface implements dog {
    @Override
    public void methodOne() {
        System.out.println("This is Animal");
    }
    @Override
    public void methodTwo() {
        System.out.println("This is my pet");
    }

    public static void main(String[] args) {
        InheritedInterface my = new InheritedInterface();
        my.methodOne();
        my.methodTwo();
    }
}