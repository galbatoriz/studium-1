package UB09.Aufgabe3;

public class Container {

    private ContainerElement start;
    private ContainerElement iterNext;
    private int maxWeight;

    public Container(int maxWeight) {
        start = null;
        iterNext = null;
        this.maxWeight = maxWeight;
    }

    public int size() {
        int c = 0;
        iterNext = start;
        while (iterNext != null) {
            iterNext = iterNext.getNext();
            c++;
        }
        return c;
    }

    public int getWeight() {
        int weight = 0;
        iterNext = start;
        while (iterNext != null) {
            weight += iterNext.getValue().getWeight();
            iterNext = iterNext.getNext();
        }
        return weight;
    }

    // public void clear() {

    // }

    // public boolean add(Package value) {

    // }
}
