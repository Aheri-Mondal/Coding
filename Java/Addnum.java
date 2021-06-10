//Write a program to add two numbers, where numbers is to be accepted using     
//iii)Scanner Class

import java.util.*;
class Addnum 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The sum is " + (a+b));
        sc.close();
    }
}
