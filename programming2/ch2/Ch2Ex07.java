package programming2.ch2;

import textio.TextIO;

public class Ch2Ex07 {
    public static void main(String[] args) {

        String name;
        int score1;
        int score2;
        int score3;
        double average;

        TextIO.readFile("testdata.txt");  // Read from the file.

        name = TextIO.getln();
        score1 = TextIO.getlnInt();
        score2 = TextIO.getlnInt();
        score3 = TextIO.getlnInt();

        average = ( score1 + score2 + score3 ) / 3.0;

        System.out.printf("The average grade for %s was %1.1f", name, average);
        System.out.println();

    }
}
