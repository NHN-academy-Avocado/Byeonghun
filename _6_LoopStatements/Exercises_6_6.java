package _6_LoopStatements;

public class Exercises_6_6 {
    public static String decoder(String str, int d){
        char[] arr = new char[str.length()];
        char tmp;
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            tmp = str.charAt(i);
            tmp -= d;
            result = result + tmp;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(decoder("gjoe",1));
    }
}
