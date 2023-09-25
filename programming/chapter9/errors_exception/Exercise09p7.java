package programming.chapter9.errors_exception;

import java.io.File;

public class Exercise09p7 {
    public static boolean fileExists(String fileName){
        File test = new File(fileName);
        return test.exists();
    }
    public static boolean isInt(String str){
        try {
            Integer.parseInt(str);
        }catch (Exception e){
            return false;
        }
        return true;
    }
    public static boolean isDouble(String str){
        try {
            Double.parseDouble(str);
        }catch (Exception e){
            return false;
        }
        return true;
    }
}
