/*Write a program to take input from user to print name and age 
& compare the age by creating objects and methods in two different classes.*/

import java.util.Scanner;

class UserDetails {
    private String name;
    private int age;

    void getdata(String n, int a) {
        name = n;
        age = a;
    }

    String showname() {
        return name;
    }

    int showage() {
        return age;
    }
}

public class Age {
    public static void main(String args[]) {
        UserDetails user1 = new UserDetails();
        UserDetails user2 = new UserDetails();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name and age of first user");
        String n1 = sc.nextLine();
        int a1 = sc.nextInt();
        user1.getdata(n1, a1);

        System.out.println("Enter name and age of second user");
        String n2 = sc.nextLine();
        int a2 = sc.nextInt();
        user2.getdata(n2, a2);

        System.out.println("Details of user 1 are: Name= " + user1.showname() + "  Age= " + user1.showage());
        System.out.println("Details of user 2 are: Name= " + user2.showname() + "  Age= " + user2.showage());

        if (user1.showage() > user2.showage())
            System.out.println(user1.showname() + " is older");

        else
            System.out.println(user2.showname() + " is older");

        sc.close();
    }
}
