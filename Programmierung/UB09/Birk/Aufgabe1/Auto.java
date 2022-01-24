package UB09.Birk.Aufgabe1;


public class Auto {

    private Reifen[] reifen;
    private Motor motor;
    private Kofferraum kofferraum;
    private int vmax;
    private int anzahlsitze;
    private int anzahltüren;

    public Auto(int vmax, int anzahlsitze, int anzahltüren) {
        
        this.motor = motor;
        this.kofferraum = kofferraum;
        this.vmax = vmax;
        this.anzahlsitze = anzahlsitze;
        this.anzahltüren = anzahltüren;
    }

    // Eigene Atribute getter und setter
    public int getVmax() {
        return vmax;
    }

    public void setVmax(int vmax) {
        this.vmax = vmax;
    }

    public int getAnzahlsitze() {
        return anzahlsitze;
    }

    public void setAnzahlsitze(int anzahlsitze) {
        this.anzahlsitze = anzahlsitze;
    }

    public int getAnzahltüren() {
        return anzahltüren;
    }

    public void setAnzahltüren(int anzahltüren) {
        this.anzahltüren = anzahltüren;
    }

    // Fremde getter und setter
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
    public Kofferraum getKofferraum() {
        return kofferraum;
    }
    public void setKofferraum(Kofferraum kofferraum) {
        this.kofferraum = kofferraum;
    }

    // Funktionen
    public void reifenwechsel(int index, Reifen austauschreifen){
        reifen[index] = austauschreifen;    
    }
 



    
}