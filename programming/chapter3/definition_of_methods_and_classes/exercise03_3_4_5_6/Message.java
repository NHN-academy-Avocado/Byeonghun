package programming.chapter3.definition_of_methods_and_classes.exercise03_3_4_5_6;

import javax.swing.*;

public class Message {
    private String numberToCall;
    private String numberOfSender;
    private final MessageText messageText;

    public Message(MessageText messageText, String numberToCall, String numberOfSender){
        this.messageText = messageText;
        this.numberToCall = numberToCall;
        this.numberOfSender = numberOfSender;
    }


    public Message(MessageText messageText, String numberOfSender) {
        this.numberOfSender = numberOfSender;
        this.messageText = messageText;
    }

    public Message(MessageText messageText) {
        this.messageText = messageText;
    }

    public void setNumberToCall(String numberToCall) {
        this.numberToCall = numberToCall;
    }

    public void setNumberToCall() {
        this.numberToCall = readInput("Number to call : ");
    }

    public void print(){
        System.out.println(messageText.getText());
    }
    public static String readInput(String show){
        return JOptionPane.showInputDialog(show);
    }

}
