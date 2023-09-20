package programming.chapter6.loop_statements;

public class Exercises_6_7 {
    public static int countChar(String str, char c){
        int tmp = 0;
        int result = -1;
        int count = 0;
        int maxlen = 0;
        for (int i = 0; i < str.length(); i++) {
            if(count == 0 && str.charAt(i) == c){
                tmp = i;
                count++;
            }else if(str.charAt(i) == c){
                count++;
                if(maxlen < count){
                    result = tmp;
                    maxlen =count;
                }
            }else {
                count = 0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(countChar("acbcccacc", 'c'));
        System.out.println(countChar("asdas", 'c'));
    }
}
