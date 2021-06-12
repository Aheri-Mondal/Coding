/*Write a program to add two integers, three integers and two floating
point numbers using method overloading.*/
class Adder {
    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static double add(double a, double b) {
        return a + b;
    }
}

class Overload {
    public static void main(String[] args) {
        System.out.println(Adder.add(6, 82));
        System.out.println(Adder.add(50, 40, 60));
        System.out.println(Adder.add(18.2, 6.4));
    }
}