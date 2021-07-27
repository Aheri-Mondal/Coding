/*
 * Write a program to show demonstration of Constructor in Inheritance.
 */

class First_1 {

    First_1() {
        System.out.println("Constructor of parent class");
    }
}

class Second_1 extends First_1 {

    Second_1() {
        super();
        System.out.println("Hello from inheritted class");
    }
}

class Demo {
    public static void main(String[] args) {
        Second_1 s = new Second_1();
    }
}
