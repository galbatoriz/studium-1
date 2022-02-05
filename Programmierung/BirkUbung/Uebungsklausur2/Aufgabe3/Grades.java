package BirkUbung.Uebungsklausur2.Aufgabe3;

import java.util.LinkedList;

public class Grades {

    public static LinkedList<String> transfer(String[][] vips, String[][] studip) {
        int zeilen = vips.length;
        double stupidgrade;
        int intgrade;
        String grade;
        String value;
        LinkedList<String> list = new LinkedList<String>();
        for (int z = 2; z < zeilen; z++) {
            stupidgrade = Double.parseDouble(vips[z][3].replace(",", "."));
            stupidgrade = stupidgrade * 100;
            intgrade = (int) stupidgrade;
            grade = String.valueOf(intgrade);
        
        for (int i = 2; i < zeilen; i++) {
            for (int j = 1; j < studip.length; j++) {
                if (vips[i][0] == studip[j][2] && vips[i][1] == studip[j][1] && vips[i][2] == studip[j][0]) {
                    if (j == 2) {
                        list.add("Test");
                    }else {
                        value = studip[i][j];
                        list.add(value);
                    }

                } 
            }
        }
    }

        // for (int i = 0; i < studip.length; i++) {
        //     for (int j = 0; j < studip[0].length; j++) {
        //         value = studip[i][j];
        //         list.add(value);
        //     }
        // }

        return list;
    }

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
        /*
         * Erwartete Ausgabe:
         * Matriculation Number | First Name | Last Name | Grade |
         * 12345 | Tick | Duck | 170 |
         * 12346 | Trick | Duck | 200 |
         * 12347 | Track | Duck | 130 |
         * 00007 | Phantomias | Duck | |
         * Errors: [00007]
         */
    }
}
