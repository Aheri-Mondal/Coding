/*Write a program to show use of SUPER keyword.*/

class First {

    int n = 1;

    void show() {
        System.out.println("n is equal to " + n);
    }
}

class Second extends First {

    int n = 2;

    void show() {
        super.show();
        System.out.println("n is equal to " + n);
    }
}

class keyword_super {
    public static void main(String[] args) {
        Second s = new Second();
        s.show();
    }
}