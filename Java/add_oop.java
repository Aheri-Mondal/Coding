/*write a program to add two numbers using OOP.*/

import java.util.Scanner;

class Calculate {
    private int num1;
    private int num2;

    void getdata(int x, int y) {
        num1 = x;
        num2 = y;
    }

    int showresult() {
        return (num1 + num2);
    }
}

public class add_oop {

    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        a = sc.nextInt();
        System.out.println("Enter second number");
        b = sc.nextInt();
        Calculate c = new Calculate();
        c.getdata(a, b);
        System.out.println("Sum of the two numbers is : " + c.showresult());
    }

}