package programming.chapter4.primitive_data_types_In_java.Exercise_04_9;

public class Product {
    private final String peoductName;
    private int numberOfStoredPieces;
    public Product(String productName){
        this.peoductName = productName;
    }
    public void downLoad(int i) {
        this.numberOfStoredPieces += i;
    }

    public void upLoad(int i) {
        this.numberOfStoredPieces -= i;
    }

    public String toString(){
        return "\"" + peoductName +"," + numberOfStoredPieces + "\"";
    }
}
