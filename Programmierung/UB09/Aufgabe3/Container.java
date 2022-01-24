package UB09.Aufgabe3;

public class Container {

    private ContainerElement start;
    private ContainerElement next;
    private int maxWeight;
    private int weight;
    private int packages;

    public Container(int _maxWeight) {
        this.maxWeight = _maxWeight;
        this.start = null;
        this.next = null;
    }

    public ContainerElement findPrev() {
        ContainerElement current = start;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        return current;
    }

    public int size() {
        return this.packages;
    }

    public int getWeight() {
        return this.weight;
    }

    public void reset() {
        next = start;
    }

    public Package getNext() {
        Package result = next.getValue();
        next = next.getNext();
        return result;
    }

    public void clear() {
        this.weight = 0;
        this.packages = 0;
        this.start = null;
        this.next = null;
    }

    public boolean hasNext() {
        return (next != null);
    }

    public boolean add(Package value) {
        ContainerElement elem = new ContainerElement(null, value);
        if (weight + value.getWeight() <= maxWeight) {
            packages++;
            weight += value.getWeight();
            if (start == null) {
                start = elem;
            } else {
                ContainerElement prev = findPrev();
                prev.setNext(elem);
            }
            return true;
        }
        return false;
    }

    public void addOpt(Package[] values) {
        for (Package pack : values) {
            if (!add(pack)) {
                break;
            }
        }
    }

    public Package[] toArray() {
        ContainerElement current = start; // lokale Laufvariable für die Liste
        Package[] result = new Package[packages];
        for (int i = 0; i < packages; i++) {
            result[i] = current.getValue();
            current = current.getNext();
        }
        return result;
    }

}
