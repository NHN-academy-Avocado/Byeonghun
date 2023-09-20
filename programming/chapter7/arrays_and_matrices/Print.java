package programming.chapter7.arrays_and_matrices;

public class Print<T> {
    public void print(T[][] m){
        for(T[] a : m){
            print(a);
            System.out.println();
        }
    }
    public void print(T[] a){
        for(T f : a){
            System.out.print(f+"\t");
        }
    }
}
