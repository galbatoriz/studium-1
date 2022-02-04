package Probeklausur1.Aufgabe1;

public class Test {
    public static void main(String[] args) {
        int[] data = new int[] { 4, 7, 8, 3, 9, 0, 2 };
        System.out.println(randomSearch(data, 8));
        System.out.println(randomSearch(data, 1));
    }

    public static int randomSearch(int[] data, int key) {
        boolean[] proofed = new boolean[data.length];
        if (data.length == 0) {
            return -1;
        }
        for (int i = 0; i < data.length; i++) {
            int test = (int) (Math.random() * data.length);
            while (proofed[test]) {
                test = (int) (Math.random() * data.length);
            }
            if (data[test] == key) {
                return test;
            }
            proofed[test] = true;
        }
        return -1;
    }
}
