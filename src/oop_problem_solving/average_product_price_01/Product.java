package oop_problem_solving.average_product_price_01;

public class Product {
    
    private String productName;
    private float productPrice;
    
    // Setter for product name
    public void setProductName(String productName) {
        this.productName = productName;
    }
    
    // Setter for product price
    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }
    
    // Getter for product name
    public String getProductName() {
        return this.productName;
    }
    
    // Getter for product price
    public float getProductPrice() {
        return this.productPrice;
    }
    
    // Display Product Information
    public String toString() {
        return "Product Name - " + this.productName
                + "\nProduct Price - " + String.format("%.2f", this.productPrice);
    }
}
