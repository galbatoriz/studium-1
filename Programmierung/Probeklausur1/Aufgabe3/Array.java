package Probeklausur1.Aufgabe3;

public class Array {
    public static void main(String[] args) {
        double[] arr = new double[] { -1, 4, 5, -6, 0 };
        for (double i : sumPosNeg(arr)) {
            System.out.println(i);
        }
        System.out.println(avg(arr));
    }

    public static double[] sumPosNeg(double[] arr) {
        double[] result = new double[2];
        for (double v : arr) {
            if (v > 0) {
                result[1] += v;
            } else if (v < 0) {
                result[0] += v;
            }
        }
        return result;
    }

    public static double avg(double[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int sum = 0;
        for (double i : sumPosNeg(arr)) {
            sum += i;
        }
        return sum / arr.length;
    }

    public static double[] matrixSumPosNeg(double[][] arr) {
        double[] result = new double[2];
        for (double[] inner : arr) {
            result[0] += sumPosNeg(inner)[0];
            result[1] += sumPosNeg(inner)[1];
        }
        return result;
    }

    public static int abs(double[] arr) {
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = Math.abs(arr[i]);
                c++;
            }
        }
        return c;
    }

    public static double[][] splitPosNeg(double[] arr) {
        int neg = 0;
        int pos = 0;
        for (double v : arr) {
            if (v > 0) {
                pos++;
            } else if (v < 0) {
                neg++;
            }
        }
        double[][] result = new double[2][];
        result[0] = new double[pos];
        result[1] = new double[neg];
        neg = 0;
        pos = 0;
        for (double v : arr) {
            if (v > 0) {
                result[0][pos] = v;
            } else if (v < 0) {
                result[1][neg] = v;
            }
        }
        return result;
    }
}
