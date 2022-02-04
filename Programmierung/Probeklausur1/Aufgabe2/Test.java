package Probeklausur1.Aufgabe2;

public class Test {
    public static void main(String[] args) {
        Person alice = new Person();
        alice.setName("Alice");

        Hund bella = new Hund();
        bella.setName("Bella");

        Hund lady = new Hund();
        lady.setName("Lady");

        Hund daisy = new Hund(false);
        daisy.setName("Daisy");

        Hund[] dogs = new Hund[] { bella, lady, daisy };
        alice.setDogs(dogs);

        alice.feedAll();
        alice.feed(bella);
        alice.feed(daisy);
        alice.feed(lady);
        daisy.bark();
        alice.pet(daisy);
        System.out.println(1 % 7);
    }
}
