package programming2.ch2;

import textio.TextIO;

public class Ch2Ex04 {
    public static void main(String[] args) {
        int quarter;
        int dime;
        int nickel;
        int penny;
        System.out.print("input number of quarter : ");
        quarter = TextIO.getlnInt();
        System.out.print("input number of dime : ");
        dime = TextIO.getlnInt();
        System.out.print("input number of nuckel : ");
        nickel = TextIO.getlnInt();
        System.out.print("input number of penny : ");
        penny = TextIO.getlnInt();
        int total = (quarter * 25) + (dime * 10) + (nickel * 5) + (penny);
        System.out.println("total is " + total);
    }
}
