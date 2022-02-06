package BirkUbung.Uebungsklausur2.Aufgabe3;

import java.util.LinkedList;

public class Grades {

    public static LinkedList<String> transfer(String[][] vips, String[][] studip) {
        LinkedList<String> error = new LinkedList<String>();
        int vipszeilen = vips.length;
        int supidzielen = studip.length;
        String matrikelnummer;
        double grade;
        int intgrade;
        String strgrade;
        String vorname;
        String lastname;
        String name;
        String wholename;

        for (int z = 2; z < vips.length; z++) {
            boolean found = false;
            matrikelnummer = vips[z][1];

            name = vips[z][0];

           

            for (int j = 1; j < studip.length; j++) {

                if (studip[j][0].contains(matrikelnummer)) {
                    grade = Double.parseDouble(vips[z][3].replace(",", ".")) * 100;
                    intgrade = (int) grade;

                    vorname = studip[j][1];
                    lastname = studip[j][2];
                    wholename = lastname + ", " + vorname;
                    

                    if (name.contains(wholename)) {
                        found = true;
                        studip[j][3] = String.valueOf(intgrade);
                    }
                }
            }
            if (!found) {
                error.add(matrikelnummer);
            }
        }
        return error;

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
