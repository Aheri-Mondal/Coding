/* Write a program to pass and return an object from methods. */

class Arrange {

    int num;

    void value(int n) {
        num = n;
    }

    boolean check(Arrange obj) {
        if (num == 5)
            return true;
        else
            return false;
    }
}

class pass_return_obj {
    public static void main(String[] args) {
        Arrange a = new Arrange();
        Arrange b = new Arrange();
        a.value(5);
        b.check(a);
        System.out.println(b.check(a));
    }
}