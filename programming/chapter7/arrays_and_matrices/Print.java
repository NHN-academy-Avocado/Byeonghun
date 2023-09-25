package programming.chapter7.arrays_and_matrices;


public class Print<T> {
    public void print(T[] a, PrintArr<T> p){
        for(T f : a){
            p.printArr(f);
        }
    }
}

interface PrintArr<T>{
    void printArr(T t);
}
class Print1D<T> implements PrintArr<T>{
    @Override
    public void printArr(T f) {
        System.out.print(f + "\t");
    }
}
class Print2D<T> implements PrintArr<T[]>{
    Print<T> p = new Print<>();
    @Override
    public void printArr(T[] t) {
        p.print(t, new Print1D<>());
        System.out.println();
    }
}
