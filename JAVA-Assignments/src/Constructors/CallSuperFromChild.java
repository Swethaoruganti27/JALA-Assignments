package Constructors;

class ParentClass_01 {
    String name;
    String branch;
    int rollNo;

    ParentClass_01() {
        System.out.println("Default constructor of ParentClass_01");
    }

    ParentClass_01(int rollNo) {
        this.rollNo = rollNo;
        System.out.println("Roll Number: " + this.rollNo);
    }

    ParentClass_01(String name, String branch) {
        this.name = name;
        this.branch = branch;
        System.out.println("Name: " + this.name);
        System.out.println("Branch: " + this.branch);
    }
}
