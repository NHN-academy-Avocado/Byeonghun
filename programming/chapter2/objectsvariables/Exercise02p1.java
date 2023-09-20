package programming.chapter2.objectsvariables;

public class Exercise02p1 {
    public static void main(String[] args) {
        String name = "Byeonghun Jung";
        String front;
        String back;
        front = name.substring(0,1);
        back = name.substring(13,14);
        System.out.println(front);
        System.out.println(back);
    }
}
