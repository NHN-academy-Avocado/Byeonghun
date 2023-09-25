package programming.chapter9.errors_exception;

import java.io.*;

public class Exercise09p8 {
}
class Matrix {
    private int x;
    private int y;
    private int[][] matrix;

    public Matrix(int n, int m) {
        this.x = n;
        this.y = m;
        this.matrix = new int[n][m];
    }
    public void save(String filename)  {
        try(PrintWriter out = new PrintWriter(new FileWriter(filename));) {
            out.println(this.x);
            out.println(this.y);
            for (int i = 0; i < this.x; i++) {
                for (int j = 0; j < this.y; j++) {
                    out.println(matrix[i][j]);
                }
            }
        }catch (IOException e){
            throw new RuntimeException(e.getMessage());
        }
    }
    public Matrix read(String filename){
        Matrix tmp = null;
        try (BufferedReader br = new BufferedReader(new FileReader(filename));){
            this.canRead(filename);
            int n = 0;
            while ((n = Integer.parseInt(br.readLine())) != 0) {
                tmp = new Matrix(n, Integer.parseInt(br.readLine()));
                for (int i = 0; i < tmp.x; i++) {
                    for (int j = 0; j < tmp.y; j++) {
                        tmp.matrix[i][j] = Integer.parseInt(br.readLine());
                    }
                }
            }
        }catch (IOException e){
            throw new RuntimeException(e.getMessage());
        }
        return tmp;
    }

    private void canRead(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename));){
            String str = br.readLine();
            int count = 0;
            while (str != null){
                count++;
            }
            if(count != this.x*this.y) throw new ExceptionWrongMatrixDimension("행렬의 크기가 다릅니다");
        }catch (IOException e){
            throw new RuntimeException(e.getMessage());
        } catch (ExceptionWrongMatrixDimension e) {
            throw new RuntimeException(e);
        }

    }


    public Matrix sum(Matrix m) throws ExceptionWrongMatrixValues {
        if(this.x ==m.x && this.y ==m.y){
            Matrix tmp = new Matrix(this.x,this.y);
            for(int i = 0; i<this.x; i++){
                for(int j = 0; j < this.y; j++){
                    tmp.matrix[i][j]=this.matrix[i][j]+m.matrix[i][j];
                }
            }
            return tmp;
        }else{
            throw new ExceptionWrongMatrixValues("행렬의 합을 하려면 두 행렬의 크기가 같아야 합니다");
        }
    }

    public Matrix product(Matrix m) throws ExceptionWrongMatrixValues {
        Matrix tmp;
        if(this.y ==m.x){
            tmp = new Matrix(this.x,m.y);
            for(int i = 0; i<tmp.x; i++){
                for(int j = 0; j<tmp.y; j++){
                    for(int k = 0; k<tmp.y; k++){
                        tmp.matrix[i][j] = this.matrix[i][k] * m.matrix[k][j];
                    }
                }
            }
        }else {
            throw new ExceptionWrongMatrixValues("행렬곱을 하기 위해선 앞행렬의 행과 뒷행렬의 열의 크기가 밭아야 합니다");
        }
        return tmp;
    }
}
class ExceptionWrongMatrixValues extends Throwable{
    public ExceptionWrongMatrixValues() {
    }

    public ExceptionWrongMatrixValues(String message) {
        super(message);
    }
}
class ExceptionWrongMatrixDimension extends Throwable{
    public ExceptionWrongMatrixDimension() {
    }

    public ExceptionWrongMatrixDimension(String message) {
        super(message);
    }
}