package UB08.Aufgabe3;

import java.util.Scanner;

public class Volume {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Körper initialisieren
        Cube cube = new Cube(inputcubelenght(input));
        Sphere sphere = new Sphere(inputsphereradius(input));

        // Volumen und Differnzvolumen ausgeben
        System.out.println("Das Volumen des Würfels beträgt: " + cube.getVolume());
        System.out.println("Das Volumen der Kugel beträgt: " + sphere.getVolume());
        System.out.println("Die Differnz der Volumina beträgt: " + Math.abs(cube.getVolume() - sphere.getVolume()));
        System.out.println("Gebe nun einen Inkrement Wert ein, um die Volumina anzugleichen");

        // Inkrement Wert erfragen
        double increment = inputincrement(input);
        int step = 0;

        // Volumen angleichen
        if (sphere.getVolume() > cube.getVolume()) {
            while (sphere.getVolume() > cube.getVolume()) {
                cube.change(increment);
                sphere.change(-1 * increment);
                step++;
            }
            System.out.println("In " + step + " Schritten:");
            System.out.println("Das Volumen des Würfel beträgt: " + cube.getVolume());
            System.out.println("Das Volumen der Kugel beträgt: " + sphere.getVolume());
            System.out.println("Die Oberfläche des Würfel beträgt: " + cube.getSurfaceArea());
            System.out.println("Die Oberflächeder Kugel beträgt: " + sphere.getSurfaceArea());
        } else {
            while (sphere.getVolume() < cube.getVolume()) {
                cube.change(-1 * increment);
                sphere.change(increment);
                step++;
            }
            System.out.println("In " + step + " Schritten:");
            System.out.println("Das Volumen des Würfels beträgt: " + cube.getVolume());
            System.out.println("Das Volumen der Kugel beträgt: " + sphere.getVolume());
            System.out.println("Die Oberfläche des Würfels beträgt: " + cube.getSurfaceArea());
            System.out.println("Die Oberflächeder Kugel beträgt: " + sphere.getSurfaceArea());
        }

        input.close();
    }

    // User Input Checker
    public static double inputcubelenght(Scanner input) {
        double edgelenght;
        do {
            System.out.println("Gebe die Kantenlänge eines Würfels ein:");
            while (!input.hasNextDouble() && !input.hasNextInt()) {
                System.out.println(
                        "Das ist keine Nummer!\nDu kannst eine postive nicht-ganze Zahl eingeben (z.B.: 10,5)\nGebe die Kantenlänge eines Würfels ein:");
                input.next();
            }
            edgelenght = input.hasNextDouble() ? input.nextDouble() : input.nextInt();
        } while (edgelenght <= 0);
        return edgelenght;
    }

    public static double inputsphereradius(Scanner input) {
        double radius;
        do {
            System.out.println("Gebe den Radius einer Kugel ein:");
            while (!input.hasNextDouble() && !input.hasNextInt()) { // for (;!scr.hasNextDouble();){}
                System.out.println(
                        "Das ist keine Zahl!\nDu kannst eine postive nicht-ganze Zahl eingeben (z.B.: 10,5)\nGebe den Radius einer Kugel ein:");
                input.next();
            }
            radius = input.hasNextDouble() ? input.nextDouble() : input.nextInt();
        } while (radius <= 0);
        return radius;
    }

    public static double inputincrement(Scanner input) {
        double increment;
        do {
            System.out.println("Gebe einen Inkrement Wert ein:");
            while (!input.hasNextDouble() && !input.hasNextInt()) {
                System.out.println(
                        "Das ist keine Zahl!\nDu kannst eine postive nicht-ganze Zahl eingeben (z.B.: 10,5)\nGebe einen Inkrement Wert ein:");
                input.next();
            }
            increment = input.hasNextDouble() ? input.nextDouble() : input.nextInt();
        } while (increment <= 0);
        return increment;
    }

}
