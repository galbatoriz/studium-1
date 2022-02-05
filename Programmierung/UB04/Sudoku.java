package UB04;

import java.util.HashSet;

public class Sudoku {
    public static void main(String[] args) {
        int[][] sudoku = new int[][] { // input
                { 0, 9, 0, 0, 0, 0, 1, 1, 0 }, { 8, 0, 4, 0, 2, 0, 3, 0, 7 }, { 0, 6, 0, 9, 0, 7, 0, 2, 0 },
                { 0, 0, 5, 0, 3, 0, 1, 0, 0 }, { 0, 7, 0, 5, 0, 1, 0, 3, 0 }, { 0, 0, 3, 0, 9, 0, 8, 0, 0 },
                { 0, 2, 0, 8, 0, 5, 0, 6, 0 }, { 1, 0, 7, 0, 6, 0, 4, 0, 9 }, { 0, 3, 0, 0, 0, 0, 0, 8, 0 } };
        int[][] layout = new int[][] { // square layout
                { 0, 0, 0, 1, 1, 1, 2, 2, 2 }, { 0, 0, 0, 1, 1, 1, 2, 2, 2 }, { 0, 0, 0, 1, 1, 1, 2, 2, 2 },
                { 3, 3, 3, 4, 4, 4, 5, 5, 5 }, { 3, 3, 3, 4, 4, 4, 5, 5, 5 }, { 3, 3, 3, 4, 4, 4, 5, 5, 5 },
                { 6, 6, 6, 7, 7, 7, 8, 8, 8 }, { 6, 6, 6, 7, 7, 7, 8, 8, 8 }, { 6, 6, 6, 7, 7, 7, 8, 8, 8 }, };

        HashSet<String> discovered = new HashSet<String>();
        long startTime = System.nanoTime();
        for (int r = 0; r < 9; r++) { // loop rows = zeile // soduko.lenght
            for (int c = 0; c < 9; c++) { // loop columns = spalte // soduko[0].lneght
                int current_value = sudoku[r][c];
                if (current_value != 0) { // ignore empty fields
                    if (!discovered.add("Duplicate number <" + current_value + "> in row " + r)) { // HashSet can not
                                                                                                   // contain duplicate
                                                                                                   // elements ->
                                                                                                   // returns false if
                                                                                                   // element already
                                                                                                   // exists
                        System.out.println("Duplicate number <" + current_value + "> in row " + r);
                    }
                    if (!discovered.add("Duplicate number <" + current_value + "> in suqare " + r / 3 + "-" + c / 3)) {
                        System.out.println("Duplicate number <" + current_value + "> in suqare " + layout[r][c]);
                    }
                    if (!discovered.add("Duplicate number <" + current_value + "> in column " + c)) {
                        System.out.println("Duplicate number <" + current_value + "> in column " + c);
                    }
                }
            }
        }
        long stopTime = System.nanoTime();
        long time = (stopTime - startTime) / 1000000;
        System.out.println("This took me around: " + time + " ms");
    }
}
