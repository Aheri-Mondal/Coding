/*
 * Write a program to show demonstration of Dynamic method dispatch.
 */

class First_2 {

    void show() {
        System.out.println("Showing from class 1");
    }
}

class Second_2 extends First_2 {

    void show() {
        System.out.println("Showing from class 2");
    }
}

class Third extends First_2 {

    void show() {
        System.out.println("Showing from class 3");
    }
}

class Dynamic_method_dispatch {
    public static void main(String args[]) {

        First_2 ref = new First_2();
        Second_2 b = new Second_2();
        Third c = new Third();

        ref.show();

        ref = b;
        ref.show();

        ref = c;
        ref.show();
    }
}