package UB06;

public class Aufgabe2 {
    public static void main(String[] args) {

        int max = 5;

        System.out.println("Sequence: " + symetricDigitSequence(max));

        System.out.println("SequenceRec: " + symetricDigitSequenceRec(max));
    }

    public static String symetricDigitSequence(int max) {
        String decreasing = "";
        for (int i = max; i > 0; i--) {
            decreasing += i;
        }
        String increasing = "";
        for (int i = 0; i < max + 1; i++) {
            increasing += i;
        }
        return decreasing + increasing;
    }

    // FALSCH
    public static String symetricDigitSequenceRec(int max) {
        String result = String.valueOf(max);
        if (result.length() > 0) {
            if (max > 0) {
                if (result.charAt(result.length()) == result.charAt(0)) {
                    return result;
                }
                max++;
                symetricDigitSequenceRec(max);
            } else {
                max--;
                symetricDigitSequenceRec(max);
            }
        }
        return String.valueOf(0);
    }
}
