package Probeklausur2.Aufgabe1;

import java.util.LinkedList;

public class Polynomial {
    private double[] coefficients;

    public Polynomial(double[] coefficients) {
        this.coefficients = coefficients;
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < coefficients.length; i++) {
            if (i == 0) {
                result += coefficients[i] + "x^" + i;
            } else {
                result += " + " + coefficients[i] + "x^" + i;
            }
        }
        return result;
    }

    public double calculate(double x) {
        double result = 0;
        for (int i = 0; i < coefficients.length; i++) {
            result += coefficients[i] * Math.pow(x, i);
        }
        return result;
    }

    public Polynomial derivative() {
        double[] coefficients = new double[this.coefficients.length - 1];
        for (int i = 0; i < coefficients.length; i++) {
            coefficients[i] = this.coefficients[i + 1] * (i + 1);
        }
        return new Polynomial(coefficients);
    }

    public LinkedList<Double> testNulls() {
        LinkedList<Double> list = new LinkedList<Double>();
        for (double i = -1000; i < 1000; i++) {
            if (calculate(i) == 0) {
                list.add(i);
            }
        }
        return list;
    }
}
