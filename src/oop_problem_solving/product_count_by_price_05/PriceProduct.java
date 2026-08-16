package oop_problem_solving.product_count_by_price_05;

public class PriceProduct {
    
    private String productName;
    private float unitPrice;
    
    // Setter for product name
    public void setProductName(String productName){
        this.productName = productName;
    }
    
    //Setter for unit price
    public void setUnitPrice(float unitPrice){
        this.unitPrice = unitPrice;
    }
    
    // Getter for product name
    public String getProductName(){
        return this.productName;
    }
    
    // Getter for unit price
    public float getUnitPrice() {
        return this.unitPrice;
    }
    
    // Display product information
    @Override
    public String toString(){
        return "Product Name - " + this.productName
                + "\nUnit Price - " + String.format("%.2f", this.unitPrice);
    }
}
