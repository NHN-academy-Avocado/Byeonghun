package programming.chapter6.loop_statements;

public class Exercises_6_6 {
    public static String decoder(String str, int d){
        char tmp;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            tmp = str.charAt(i);
            tmp -= d;
            result.append(tmp);
        }
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        System.out.println(decoder("gjoe",1));
    }
}
