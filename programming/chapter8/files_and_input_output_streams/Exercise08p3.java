package programming.chapter8.files_and_input_output_streams;

import java.io.*;

public class Exercise08p3 {
    public static void printFile(String fileName) throws IOException {
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        OutputStream os = System.out;
        PrintStream ps = new PrintStream(os);
        String temp = br.readLine();
        while (temp != null){
            if(temp.charAt(0) == ';'||temp.charAt(0) == '/' || temp.charAt(0) =='%'){
                ps.print(temp);
            }
        }
        br.close();
    }
}
