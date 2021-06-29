/*
 * Write a program to print name of two students and their marks, and show whose
 * marks is higher using parameterized constructor.
 */

import java.util.Scanner;

class Constr {

    Constr(String s1, String s2, int a, int b) {
        System.out.println("\nFirst Student \nName: " + s1 + "\nMarks: " + a);
        System.out.println("\nSecond Student \nName: " + s2 + "\nMarks: " + b);

        if (a > b)
            System.out.println("\n" + s1 + " got higher marks.");
        else
            System.out.println("\n" + s2 + " got higher marks.");
    }
}

class Marks {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter names of 2 students");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println("Enter their marks respectively");
        int a = sc.nextInt();
        int b = sc.nextInt();

        Constr obj = new Constr(s1, s2, a, b);

        sc.close();

    }
}