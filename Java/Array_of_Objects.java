/*Write a program to show an example of array of objects.*/

class Squares {
    void show(int i) {
        System.out.println(i * i);
    }
}

class Array_of_Objects {
    public static void main(String[] args) {
        Squares objar[] = new Squares[5];
        for (int i = 0; i < 5; i++) {
            objar[i] = new Squares();
            objar[i].show(i);
        }
    }

}