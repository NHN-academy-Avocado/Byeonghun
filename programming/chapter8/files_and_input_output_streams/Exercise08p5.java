package programming.chapter8.files_and_input_output_streams;

import java.io.*;

public class Exercise08p5 {
    public static void main(String[] args) throws IOException {
        File f = new File("studentlist.txt");
        addStudent("studentlist.txt","로시", 25, 24, 26, 30, 24, 30);
        addStudent("studentlist.txt","비앙키", 20, 24, 25);
        addStudent("studentlist.txt","베르디", 30, 24, 30, 27);
        System.out.println(topStudent("studentlist.txt"));
        f.delete();
    }
    public static void addStudent(String fileName, String name, int... score) throws IOException {
        FileWriter f = new FileWriter(fileName, true);
        PrintWriter in = new PrintWriter(f);
        in.print(name + " ");
        for (int i = 0; i < score.length; i++) {
            in.print(score[i] + " ");
        }
        in.println();
        f.close();
        in.println();
    }
    public static String topStudent(String filename) throws IOException {
        FileReader f = new FileReader(filename);
        BufferedReader in = new BufferedReader(f);
        String line = in.readLine();
        double average = 0.0;
        double maxave = 0.0;
        String name = "";
        while (line != null){
            String[] tmp = line.split(" ");
            for (int i = 1; i < tmp.length; i++) {
                average += Double.parseDouble(tmp[i]);
            }
            average /= tmp.length-1;
            if(maxave < average){
                maxave = average;
                name = tmp[0];
            }
            average = 0.0;
            line = in.readLine();
        }
        return name;
    }
}
