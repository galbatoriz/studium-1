package UB06;

import java.util.Scanner;

public class Aufgabe4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Zahl: ");
        int n = sc.nextInt();
        sc.close();

        convert(n);

        System.out.println(n);
    }

    public static void convert(int n) {

        if (n <= 0) {
            System.out.println("Die Zahl muss größer als 0 sein");
        } else {
            if (n != 4) {
                if (n % 10 == 4) {
                    n = (n - 4) / 10;
                } else if (n % 10 == 0) {
                    n = n / 10;
                } else {
                    n = n * 2;
                }
                convert(n);
                System.out.println(n);
            }
        }
    }
}
