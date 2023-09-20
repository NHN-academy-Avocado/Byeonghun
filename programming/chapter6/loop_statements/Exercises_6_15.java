package programming.chapter6.loop_statements;

import javax.swing.*;

public class Exercises_6_15 {
    public static String deleteBlank(String str) {
        StringBuilder result = new StringBuilder();
        boolean isBlank = false;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ' '){
                result.append(str.charAt(i));
                isBlank = true;
            }else if(isBlank){
                result.append(' ');
                isBlank = false;
            }
        }
        return result.substring(0,result.length()-1);
    }
    public static String deleteVowel(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(isNotVowel(str.charAt(i))){
                result.append(str.charAt(i));
            }
        }

        return String.valueOf(result);
    }

    private static boolean isNotVowel(char c) {
        return c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && c != 'y';
    }
    public static String compression(){
        String str = JOptionPane.showInputDialog("압축하고 싶은 문장을 쓰세요");
        String select = JOptionPane.showInputDialog("압축 단계 입력 1 : 공백 삭제 || 2 : 모음 삭제 || 3 : 둘다");
        if(str.isEmpty()) throw new IllegalArgumentException("문장을 입력해 주세요");
        if(select.equals("1"))
            return deleteBlank(str);
        if(select.equals("2"))
            return deleteVowel(str);
        if(select.equals("3"))
            return deleteBlank(deleteVowel(str));
        return "잘목 입력된 값 입니다";
    }

    public static void main(String[] args) {
        System.out.println(compression());
    }
}
