package programming2.ch2;

import textio.TextIO;

public class Ch2Ex05 {
    public static void main(String[] args) {
        System.out.print("Enter your number of eggs : ");
        int numberOfEggs = TextIO.getlnInt();
        int gross = numberOfEggs / 144;
        int dozen = (numberOfEggs - gross * 144) / 12;
        int ech = numberOfEggs - (gross * 144) - (dozen * 12);
        System.out.println("Your number of eggs is " + gross + " gross, " + dozen + " dozen, and " +ech);
    }
}
