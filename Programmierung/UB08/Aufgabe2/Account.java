package UB08.Aufgabe2;

public class Account {

    private String owner = ""; // OWNER Value
    private double balance = 0D; // BALANCE Value

    /**
     * Konstruktor zum Erstellen eines Kontos mit Initialwert und Owner
     *
     * @param name    Owner dieses Kontos
     * @param balance Initialwert des Kontos
     */
    public Account(String name, double balance) {
        owner = name;
        this.balance = balance;
    }

    /**
     * Get Owner
     *
     * @return Owner eines Kontos
     */
    public String owner() {
        return owner;
    }

    /**
     * Set Owner
     *
     * @param value Neuer Owner
     */
    public void owner(String value) {
        owner = value;
    }

    /**
     * Get Balance
     *
     * @return Balance eines Kontos
     */
    public double balance() {
        return balance;
    }

    /**
     * Zahle Geld auf ein Konto ein
     *
     * @param value Betrag des einzuzahlenden Geldes
     * @return Status des Erfolgs der Einzahlung
     */
    public boolean einzahlen(double value) {
        if (value > 0) {
            balance += value;
            return true;
        }
        return false;
    }

    /**
     * Zahle Geld eines Kontos aus
     *
     * @param value Betrag des auszuzahlenden Geldes
     * @return Status des Erfolgs der Auszahlung
     */
    public boolean auszahlen(double value) {
        if (value > 0) {
            if (balance >= value) {
                balance -= value;
                return true;
            }
        }
        return false;
    }

    /**
     * Überweise Geld von einem Account auf einen anderen
     *
     * @param amount die Menge des zu überweisenden Geldes
     * @param other  der Account an den das Geld überwiesen werden soll
     * @return Status des Erfolgs der Überweisung
     */
    public boolean transfer(double amount, Account other) {
        if (amount > 0) {
            if (other != this) {
                if (auszahlen(amount)) {
                    other.einzahlen(amount);
                    return true;
                }
            }
        }
        return false;
    }
}
