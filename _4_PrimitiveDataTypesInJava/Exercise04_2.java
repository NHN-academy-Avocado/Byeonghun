package _4_PrimitiveDataTypesInJava;

public class Exercise04_2 {
    public static boolean sumOverflow(byte x, byte y){
        return x + y < -128 || x + y >127;  //int 밑으론 연산 할 때 int 로 바뀌기 때문에 오버플로우가 안일어난다
    }
}
