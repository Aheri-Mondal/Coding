/*
 * Write a program to find area of a square, rectangle and triangle using
 * parameterized constructor.
 */

import java.util.*;

class ConstrOverload {
    ConstrOverload(int l) {
        System.out.println("Area of square is " + (l * l));
    }

    ConstrOverload(int len, int br) {
        System.out.println("Area of rectangle is " + (len * br));
    }

    ConstrOverload(int a, int b, int c) {
        double s = (a + b + c) / 2;
        double ar = Math.pow((s * (s - a) * (s - b) * (s - c)), (1 / 2));
        System.out.println("Area of triangle is " + (ar));
    }
}

class Area_Para {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of a side of square");
        int l = sc.nextInt();

        System.out.println("Enter length and breadth of rectangle");
        int len = sc.nextInt();
        int br = sc.nextInt();

        System.out.println("Enter length of 3 sides of triangle");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        ConstrOverload obj = new ConstrOverload(l);
        obj = new ConstrOverload(len, br);
        obj = new ConstrOverload(a, b, c);

    }
}