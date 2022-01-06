package UB08.Aufgabe1;

public class Star {
    private String name;
    private String id;
    private String type;
    private double distance;
    private double apparentMagnitude;

    public Star() {
    }

    public Star(String _name, String _id) {
        name = _name;
        id = _id;
    }

    public String name() {
        return name;
    }

    public void name(String value) {
        name = value;
    }

    public String id() {
        return id;
    }

    public void id(String value) {
        id = value;
    }

    public String type() {
        return type;
    }

    public void type(String value) {
        type = value;
    }

    public double distance() {
        return distance;
    }

    public void distance(double value) {
        distance = value;
    }

    public double apperentMagnitude() {
        return apparentMagnitude;
    }

    public void apperentMagnitude(double value) {
        apparentMagnitude = value;
    }

    public boolean isCloserThan(Star other) {
        if (other.apparentMagnitude < apparentMagnitude) {
            return true;
        }
        return false;
    }

    public double getDistanceInPC() {
        return distance / 3.26D;
    }

    public double getAbsoluteMagnitude() {
        return apparentMagnitude - 5 * Math.log10(getDistanceInPC()) + 5;
    }

    public boolean checkType() {
        String[][] types = { { "Blue supergiant", "Yellow supergiant", "Red supergiant", "Hypergiant" },
                { "Giant", "Bright giant" }, { "Main sequence", "Subgiant" }, { "Subdwarf" },
                { "Red dwarf, White dwarf" }, { "Brown dwarf" } };
        for (int i = 0; i < types.length; i++) {
            for (String type : types[i]) {
                if (type.equals(this.type)) {
                    if (-10 + 5 * i <= getAbsoluteMagnitude() && -10 + 5 * (i + 1) >= getAbsoluteMagnitude()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return name;
    }
}
