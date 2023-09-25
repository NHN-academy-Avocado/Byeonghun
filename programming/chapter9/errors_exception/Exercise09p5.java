package programming.chapter9.errors_exception;

import java.io.*;

public class Exercise09p5 {
    public static void main(String[] args){
        String fileName = "test.txt";
        System.out.println(countLines(fileName));
    }
    public static int countLines(String fileName){
        int result = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            while (br.readLine() != null) {
                result++;
            }
        }catch (IOException e){
            throw new RuntimeException(e.getMessage());
        }
        return result;
    }
    public void print(String fileName){
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        }catch (IOException e){
            throw new RuntimeException(e.getMessage());
        }
    }

    public void copy(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName));
             PrintWriter pw = new PrintWriter(new FileWriter(fileName));) {
            String s;
            while ((s = br.readLine()) != null) {
                pw.println(s);
            }
        }catch (IOException e){
            throw new RuntimeException(e.getMessage());
        }
    }

    public void delete(String fileName) {
        File file = new File(fileName);
        System.out.println(file.delete()? fileName + " 삭제성공" : fileName + " 삭제실패");
    }

}

