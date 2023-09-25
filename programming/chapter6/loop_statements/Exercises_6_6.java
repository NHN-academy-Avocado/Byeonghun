package programming.chapter6.loop_statements;

public class Exercises_6_6 {
    public static String decoder(String str, int d){
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            result.append((char) (c-d));
        }
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        System.out.println(decoder("gjoe",1));
    }
}
