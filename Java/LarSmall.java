
//Write a program to find largest and smallest number in an array.
import java.util.Scanner;

class LarSmall {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in an array: ");
        int min, max;
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter the elements ;;;");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        min = arr[0];
        max = arr[0];
        for (int i = 0; i < n; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("The smallest value is: " + min);
        System.out.println("The largest value is: " + max);
        sc.close();
    }
}