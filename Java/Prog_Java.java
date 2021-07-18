/*In a single program show method overriding and method
overloading.*/

class Food {

    void country(String country_name) {
        System.out.println(country_name + " does not waste food.");
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

public class Prog_Java {
    public static void main(String[] args) {

        India i = new India();
        i.country("New Zealand");
        i.country();
    }
}