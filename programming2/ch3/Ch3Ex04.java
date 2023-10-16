package programming2.ch3;

import textio.TextIO;

public class Ch3Ex04 {
    public static void main(String[] args) {
        String input = TextIO.getlnString();
        char[] arr = input.toCharArray();
        boolean check = false;
        for (char ch : arr){
            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
                System.out.print(ch);
                check = true;
            }else if(check) {
                System.out.println();
                check = false;
            }
        }
    }
}
