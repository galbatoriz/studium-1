package UB09.Birk.Aufgabe3;

public class Container {

    private int maxWeight;
    private int size;                   // Number of Packets in Conatiner
    private int weight;

    ContainerElement packageList;       //	Liste von package-objekten

    public Container(int maxWeight) {
        this.maxWeight = maxWeight;
        size = 0;
        weight = 0;
        packageList = null;

    }


    // Getter

    public int size(){
        return size;
    }

    public int getWeight(){
        return weight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }



    // Operation

    public void clear(){
        size = 0;
        weight = 0;
    }

    public boolean add(Package value){
        if (weight + value.getWeight() > maxWeight) {
            return false;
        }
        size++;
        weight += value.getWeight();
        packageList = new ContainerElement(packageList, value);
        return true;
    }
    
    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void addOpt(Package[] values) {
        for (Package val : values) {
            add(val);
        }
  
    }

    // public void setWeight(int weight) {
    //     this.weight = weight;
    // }



    // public int getSize() {
    //     return size;
    // }

    // public void setSize(int size) {
    //     this.size = size;
    // }



    
    
}
