package UB09.Birk.Aufgabe1;

public class Reifen {
    private int profilgüte;
    private boolean platt;

    public Reifen(int profilgüte, boolean platt) {
        this.profilgüte = profilgüte;
        this.platt = platt;
    }

    public int getProfilgüte() {
        return profilgüte;
    }

    public void setProfilgüte(int profilgüte) {
        this.profilgüte = profilgüte;
    }

    public boolean isPlatt() {
        return platt;
    }

    public void setPlatt(boolean platt) {
        this.platt = platt;
    }
    
}
