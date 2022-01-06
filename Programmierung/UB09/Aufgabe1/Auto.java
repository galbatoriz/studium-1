package UB09.Aufgabe1;

public class Auto {

    private Reifen[] reifen;
    private Motor motor;
    private Kofferraum kofferrraum;
    private double geschwindigkeit;
    private int sitze;
    private int tueren;
    
    //empty constructor 
    public Auto() {}

    public Reifen[] getReifen() {
        return reifen;
    }

    public void setReifen(Reifen[] reifen) {
        this.reifen = reifen;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Kofferraum getKofferrraum() {
        return kofferrraum;
    }

    public void setKofferrraum(Kofferraum kofferrraum) {
        this.kofferrraum = kofferrraum;
    }

    public int getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(double geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

    public int getSitze() {
        return sitze;
    }

    public void setSitze(int sitze) {
        this.sitze = sitze;
    }

    public int getTueren() {
        return tueren;
    }

    public void setTueren(int tueren) {
        this.tueren = tueren;
    }

    public boolean schneller(Auto other) {
        if (getGeschwindigkeit() > other.getGeschwindigkeit()) {
            return true;
        }
        return false;
    }

    public void reifenwechsel(int index, Reifen neu) {
        reifen[index] = neu;
    }
}
