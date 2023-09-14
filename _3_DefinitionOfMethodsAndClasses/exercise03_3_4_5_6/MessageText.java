package exercise03_3_4_5_6;

import java.util.Scanner;

public class MessageText {
    private String text;
    private  String code;


    public MessageText(String code, String text){
        this.code = code;
        this.text = text;
    }
    public MessageText(Scanner sc){
        System.out.print("code : ");
        this.code = sc.nextLine();
        System.out.print("text : ");
        this.text =sc.nextLine();
    }

    public String getText() {
        return this.text;
    }

    public String getCode() {
        return this.code;
    }
}
