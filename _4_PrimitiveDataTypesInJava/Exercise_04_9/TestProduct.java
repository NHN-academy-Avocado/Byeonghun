package _4_PrimitiveDataTypesInJava.Exercise_04_9;

public class TestProduct {
    public static void main (String[] args) {
        Product lamp = new Product("Lamp 60 Watt");
        System.out.println("Before the loading: " + lamp);
        lamp.downLoad(1000);
        lamp.upLoad(100);
        System.out.println("After the loading: " + lamp);
    }
}