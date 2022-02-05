package Probeklausur2.Aufgabe3;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        String[][] vips = new String[][] {
                { "Vips Examination Results" },
                { "Last Name", "First Name", "Matriculation Number", "Score", "Grade" },
                { "Duck, Track", "12347", "85", "1,3" },
                { "Duck, Tick", "12345", "80", "1,7" },
                { "Duck, Trick", "12346", "75", "2" },
                { "Duck, Phantomas", "00007", "55", "3,3" }
        };
        String[][] studip = new String[][] {
                { "Matriculation Number", "First Name", "Last Name", "Grade" },
                { "12345", "Tick", "Duck", "" },
                { "12346", "Trick", "Duck", "" },
                { "12347", "Track", "Duck", "" },
                { "00007", "Phantomias", "Duck", "" }
        };
        LinkedList<String> errors = transfer(vips, studip);
        for (String[] row : studip) {
            for (String cell : row) {
                System.out.print(cell + " | ");
            }
            System.out.println();
        }
        System.out.println("Errors: " + errors);
    }

    public static LinkedList<String> transfer(String[][] vips, String[][] studip) {
        LinkedList<String> error = new LinkedList<String>();
        String[] names = new String[vips.length - 2];
        for (int i = 2; i < vips.length; i++) {
            boolean found = false;
            names[i - 2] = vips[i][0];
            double mark = Double.parseDouble(vips[i][3].replace(",", "."));
            for (int j = 1; j < studip.length; j++) {
                if (names[i - 2].equals(studip[j][2] + ", " + studip[j][1])) {
                    found = true;
                    studip[j][3] = String.valueOf((int) (mark * 100));
                }
            }
            if (!found) {
                error.add(vips[i][1]);
            }
        }
        return error;
    }
}
