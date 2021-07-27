/*
 * Write a program to show demonstration of Constructor in Inheritance.
 */

class First {

    First() {
        System.out.println("Constructor of parent class");
    }
}

class Second extends First {

    Second() {
        super();
        System.out.println("Hello from inheritted class");
    }
}

class Demo {
    public static void main(String[] args) {
        Second s = new Second();
    }
}
