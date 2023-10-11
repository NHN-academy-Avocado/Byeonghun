package programming.chapter10.recursion;

public class Exercise10p6 {
    public static int countChar(String str, char c, int count, int maxlen){
        if(str.isEmpty()) return maxlen;
        if(str.charAt(0) == c){
            if(maxlen < count){
                maxlen = count;
            }
            return countChar(str.substring(1),c,++count,maxlen);
        }
        return countChar(str.substring(1),c,0,maxlen);
    }
    public static int countChar(String str, char c){
        return countChar(str,c,0,0);
    }

    public static void main(String[] args) {
        System.out.println(countChar("acccacccc",'c'));;
    }
}
