/*Show a simple example of method overriding.*/

class Food {

    void waste() {
        System.out.println("Do not waste food");
    }

    void country() {
        System.out.println("Every country have their own cuisine");
    }
}

class India extends Food {
    void country() {
        System.out.println("Indian food is tasty.");
    }
}

public class EgOfOverriding {
    public static void main(String[] args) {

        Food f = new Food();
        f.country();
        India i = new India();
        i.waste();
        i.country();

    }
}
