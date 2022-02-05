package Probeklausur2.Aufgabe1;

public class Test {
    public static void main(String[] args) {
        Polynomial test = new Polynomial(new double[] { 3.0, 1.0 });
        System.out.println(test.toString());
        System.out.println(test.calculate(4));
        System.out.println(test.derivative().toString());
        System.out.println(test.testNulls());
    }
}
