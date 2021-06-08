class Square {
    void calculate(int n) {
        System.out.println("Square is: " + (n * n));
    }
}

class Cube extends Square {
    void calculate(int n) {
        System.out.println("Cube is: " + (n * n * n));
    }
}

class Overriding {
    public static void main(String args[]) {
        Square x = new Square();
        Cube y = new Cube();
        x.calculate(5);
        y.calculate(5);
    }
}