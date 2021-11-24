
package finalchallenge;

public class Merchandise {
    private String merchName;
    private String merchSize;
    private double unitPrice;
    private int quantity;
    
    public Merchandise(String merchName, String merchSize, double unitPrice, int quantity) {
        this.merchName = merchName;
        this.merchSize = merchSize;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }
    
    public void setMerchName(String aMerchName) {
        this.merchName = aMerchName;
    }
    
    public String getMerchName() {
        return merchName;
    }
    
    public void setMerchSize(String aMerchSize) {
        this.merchSize = aMerchSize;
    }
    
    public String getMerchSize() {
        return merchSize;
    }
    
    public void setUnitPrice(double aUnitPrice) {
        this.unitPrice = aUnitPrice;
    }
    
    public double getUnitPrice() {
        return unitPrice;
    }
    
    public void setQuantity(int aQuantity) {
        this.quantity = aQuantity;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public String toString() {
        return "Merchandise{"
                + "name: " + merchName 
                + " size: " + merchSize
                + " price: " + unitPrice
                + " quantity: " + quantity +
                "}";
    }
}
