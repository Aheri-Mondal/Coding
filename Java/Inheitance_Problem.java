
/*Write a program to create Teacher class and enter data
through keyboard. Create another class Student which
extends Teacher class. Print teacher student information.*/

import java.util.*;

class Teacher {

    String name;
    int id;

    void SetName(String name) {
        this.name = name;
    }

    String ShowName() {
        return name;
    }

    void SetId(int id) {
        this.id = id;
    }

    int ShowId() {
        return id;
    }
}

class Student extends Teacher {

    int marks;

    void SetMarks(int marks) {
        this.marks = marks;
    }

    int ShowMarks() {
        return marks;
    }
}

class Inheitance_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Teacher obT = new Teacher();
        System.out.println("Enter name of Teacher");
        obT.name = sc.nextLine();
        System.out.println("Enter id of Teacher");
        obT.id = sc.nextInt();
        sc.nextLine();

        Student obS = new Student();
        System.out.println("Enter name of Student");
        obS.name = sc.nextLine();
        System.out.println("Enter id of Student");
        obS.id = sc.nextInt();
        System.out.println("Enter marks of Student");
        obS.marks = sc.nextInt();

        System.out.println("Name of Teacher is " + obT.ShowName());
        System.out.println("Id of Teacher is " + obT.ShowId());

        System.out.println("Name of Student is " + obS.ShowName());
        System.out.println("Id of Student is " + obS.ShowId());
        System.out.println("Marks of Student is " + obS.ShowMarks());

        sc.close();
    }
}