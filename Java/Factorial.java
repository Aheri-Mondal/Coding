
//WAP to find factorial of a number using method.
import java.util.Scanner;

//Factorial of a number
class Factorial {
    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        System.out.println("Enter the number");
        int number = sc.nextInt();
        fact = factorial(number);
        System.out.println("Factorial of " + number + " is: " + fact);
        sc.close();
    }
}