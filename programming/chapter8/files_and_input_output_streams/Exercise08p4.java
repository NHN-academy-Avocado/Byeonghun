package programming.chapter8.files_and_input_output_streams;

import java.io.*;

public class Exercise08p4 {
    public static void main(String[] args) throws IOException {
        File f = new File("gugudan.txt");
        gugudan("gugudan.txt", 3);
    }
    public static void gugudan(String fileName, int n) throws IOException {
        FileWriter fw = new FileWriter(fileName);
        PrintWriter out = new PrintWriter(fileName);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                out.print(i*j + " ");
            }
            out.println();
        }
        out.close();
        fw.close();
    }
}
