/*Create a database for 3 students. Display their information. 
Use proper OOP approach.*/
public class OOP {

    public static void main(String[] args) {
        Student s1 = new Student("Aheri", 20, 11);
        Student s2 = new Student("Alex", 20, 8);
        Student s3 = new Student("Ritika", 20, 43);
        System.out.println("Details of Student 1:");
        s1.details();
        System.out.println("Details of Student 2:");
        s2.details();
        System.out.println("Details of Student 3:");
        s3.details();

    }
}

/*
 * student database
 */
class Student {
    private String name;
    private final String branch = "CSE";
    private int age;
    private int roll_no;

    public Student(String name, int age, int roll_no) {
        this.name = name;
        this.age = age;
        this.roll_no = roll_no;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return int return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return int return the roll_no
     */
    public int getRoll_no() {
        return roll_no;
    }

    /**
     * @param roll_no the roll_no to set
     */
    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public void details() {
        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
        System.out.println("Age: " + age);
        System.out.println("Roll no: " + roll_no);
    }

}