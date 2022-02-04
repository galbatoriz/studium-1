package Probeklausur1.Aufgabe2;

public class Person {
    private String name;
    private Hund[] dogs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hund[] getDogs() {
        return dogs;
    }

    public void setDogs(Hund[] dogs) {
        this.dogs = dogs;
    }

    public boolean feed(Hund hund) {
        System.out.println(this.name + " feeds " + hund.getName() + ".");
        return hund.eat();
    }

    public void feedAll() {
        System.out.println(this.name + " feeds all their dogs.");
        for (Hund hund : dogs) {
            feed(hund);
        }
    }

    public void pet(Hund hund) {
        System.out.println(this.name + " pets " + hund.getName());
        hund.wagTail();
    }
}
