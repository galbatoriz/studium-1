package Übungsklausur2.Aufgabe1;

import java.util.LinkedList;

public class Polynomial {
    private double[] coefficients;

    public Polynomial(double[] coefficients) {

        this.coefficients = coefficients;

    }

    public String toString() {
        String string = "";
        for (int i = 0; i < coefficients.length; i++) {
            if (string == "") {
                string = coefficients[i] + "x^" + i;
            } else {
                string = string + " + " + coefficients[i] + "x^" + i;
            }

        }
        return string;
    }

    private double calculate(double x) {
        double result = 0;
        for (int i = 0; i < coefficients.length; i++) {
            result = result + (Math.pow(x, i) * coefficients[i]);
        }
        return result;
    }

    public Polynomial derivative() {
        double[] temp = new double[coefficients.length - 1];
        for (int i = 0; i < coefficients.length; i++) {
            if (i == coefficients.length - 1) {

            } else {
                temp[i] = coefficients[i + 1] * (i + 1);
            }
        }
        return new Polynomial(temp);
    }

    public LinkedList<Double> testNulls() {
        LinkedList<Double> list = new LinkedList<Double>();
        for (double i = -10000.0; i <= 1000.0; i++) {
            if (this.calculate(i) == 0) {
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        double[] coe = new double[] { 1, -2, 3 };
        Polynomial gradIII = new Polynomial(coe);
        System.out.println(gradIII.toString());
        System.out.println(gradIII.calculate(1));
        System.out.println(gradIII.derivative().toString());

        Polynomial p1 = new Polynomial(new double[] { 0.0 / 3.0, 1.0 / 3.0, 2.0 / 3.0, 3.0 / 3.0 });
        System.out.println(p1.toString());
        System.out.println(p1.derivative().toString());
        System.out.println("Nulls: " + p1.testNulls());
        System.out.println("Nulls: " + gradIII.testNulls());
    }

}
