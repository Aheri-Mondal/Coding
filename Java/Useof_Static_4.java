//static class

class Useof_Static_4 {
    static int data = 10;

    static class Inner {
        void msg() {
            System.out.println("Data is:  " + data);
        }
    }

    public static void main(String[] args) {
        Lab4_4_4.Inner obj = new Lab4_4_4.Inner();
        obj.msg();
    }
}