/*
 * Write a program to find area and perimeter of a circle. With outer class
 * calculate area, with inner class calculate perimeter.
 */

class Outerclass {

    void ar(int r) {
        double area = 3.14 * r * r;
        System.out.println("Area is: " + area);
    }

    class Innerclass {
        void pr(int r) {
            double peri = 2 * 3.14 * r;
            System.out.println("Perimeter is: " + peri);
        }
    }
}

class InOut_class {
    public static void main(String[] args) {
        Outerclass myOuter = new Outerclass();
        Outerclass.Innerclass myInner = myOuter.new Innerclass();
        System.out.println("Radius is 4 units");
        myOuter.ar(4);
        myInner.pr(4);
    }
}