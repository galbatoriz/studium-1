package Probeklausur1.Aufgabe2;

public class Hund {
    private String name;
    private boolean hungry = true;

    public Hund() {
    }

    public Hund(boolean hungry) {
        this.hungry = hungry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
        if (hungry) {
            System.out.println(this.name + " is getting hungry.");
        } else {
            System.out.println(this.name + " is not hungry anymore.");
        }
    }

    public boolean eat() {
        if (hungry) {
            System.out.println(this.name + " is eating.");
            this.setHungry(false);
            return true;
        }
        System.out.println(this.name + " is not hungry.");
        return false;
    }

    public void wagTail() {
        System.out.println(this.name + " wags its Tail.");
    }

    public void bark() {
        System.out.println(this.name + " goes \'whuff\'.");
    }
}
