package programming.chapter9.errors_exception;

import java.io.*;

public class Exercise09p6 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("test6.txt"))){
            String line = br.readLine();
            while (line != null){
                if(line.length() > 80) throw new ExceptionLineTooLong("The strings is too long");
                line = br.readLine();
            }
        }catch (ExceptionLineTooLong | IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
class ExceptionLineTooLong extends Throwable{
    private final String message;

    public ExceptionLineTooLong (String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage(){
        return this.message;
    }
}
