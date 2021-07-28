/*Find the square, Square_1 root and cube of number. Use abstract class
to design your program.*/

abstract class Calculation {
    abstract void Cal(int n);
}

class Square_1 extends Calculation {
    void Cal(int n) {
        System.out.println("Square_1 of the given number is " + (n * n));
    }
}

class SquareRoot extends Calculation {
    void Cal(int n) {
        System.out.println("Square_1 root of the given number is " + Math.sqrt(n));
    }
}

class Cube_1 extends Calculation {
    void Cal(int n) {
        System.out.println("Cube of the given number is " + (n * n * n));
    }
}

public class Prog7_1 {
    public static void main(String[] args) {
        Square_1 ob1 = new Square_1();
        SquareRoot ob2 = new SquareRoot();
        Cube_1 ob3 = new Cube_1();

        ob1.Cal(4);
        ob2.Cal(25);
        ob3.Cal(3);
    }
}
