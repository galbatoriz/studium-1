package UB09.Aufgabe2;

public class SortedLinkedIntList {

    private int counter; // Aktuelle Länge der Liste
    private LinkedIntListElement start;
    private LinkedIntListElement next; // steht auf nächstem Element im Laufe einer Iteration

    public SortedLinkedIntList() {
        start = null;
        next = null;
        counter = 0;
    }

    public LinkedIntListElement findPrev(int value) { // Vorgänger finden, um Elemente dahinter einzufügen
        LinkedIntListElement current = start;
        if (current == null || value < current.getValue()) { // Liste ist leer oder value ist kleiner als das Value des
                                                             // akt. elem
            return null;
        }

        while (current.hasNext()) { // solange es weitere Elemente in der Liste gibt
            if (value < current.getNext().getValue()) { // Wenn unser neues Element kleiner ist als der Wert des
                                                        // Vorgängers
                return current; // zurückgeben des aktuellen Elements
            }
            current = current.getNext(); // nächstes Element wird als aktuelles gesetzt
        }
        return current;
    }

    public void add(int value) {
        LinkedIntListElement elem = new LinkedIntListElement(value);
        counter++; // Neue Elemente werden für den Array Converter (s. unten) gezählt

        if (start == null) { // Wenn Liste noch leer
            start = elem; // erstes elem als Start definieren

        } else {
            LinkedIntListElement prev = findPrev(value);
            if (prev == null) { // Wenn das prev elem auf nichts mehr zeigt (davor einfügen)
                elem.setNext(start); // aktuelles elem deutet auf das elem start (an dem alle anderen elems hängen)
                start = elem;
            } else {
                elem.setNext(prev.getNext());
                prev.setNext(elem); // Nachfolger des vorherigen Elements auf das aktuelle elem verweisen
            }
        }
    }

    public Integer getNext() {
        int result = next.getValue();
        next = next.getNext();
        return result;
    }

    public void reset() {
        next = start;
    }

    public boolean hasNext() {
        return (next != null);
    }

    public int[] toArray() {
        LinkedIntListElement current = start; // lokale Laufvariable für die Liste
        int[] result = new int[counter];
        for (int i = 0; i < counter; i++) {
            result[i] = current.getValue();
            current = current.getNext();
        }
        return result;
    }
}
