/*Write a program to enter name salary of two employees 
and show whose salary is higher. Use proper user defined methods.*/
class Emp {
    private String name;
    private double salary;

    void getdata(String n, double s) {
        name = n;
        salary = s;
    }

    String showname() {
        return name;
    }

    double showsal() {
        return salary;
    }
}

public class Employees {
    public static void main(String args[]) {
        Emp employee1 = new Emp();
        Emp employee2 = new Emp();
        employee1.getdata("Sushma", 24000);
        employee2.getdata("Srishti", 32000);

        System.out.println(
                "Details of Employee 1 are: Name= " + employee1.showname() + "  Salary= " + employee1.showsal());
        System.out.println(
                "Details of Employee 2 are: Name= " + employee2.showname() + "  Salary= " + employee2.showsal());

        if (employee1.showsal() > employee2.showsal())
            System.out.println(employee1.showname() + " has higher salary");

        else
            System.out.println(employee2.showname() + " has higher salary");
    }
}
