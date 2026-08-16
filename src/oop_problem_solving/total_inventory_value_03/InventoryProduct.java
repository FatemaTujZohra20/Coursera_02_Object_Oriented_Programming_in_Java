package oop_problem_solving.total_inventory_value_03;

public class InventoryProduct {
    
    private String productName;
    private int quantity;
    private float unitPrice;
    
    // Setter for product name
    public void setProductName(String productName) {
        this.productName = productName;
    }
    
    // Setter for quantity
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    
    // Setter for unit price
    public void setUnitPrice(float unitPrice){
        this.unitPrice = unitPrice;
    }
    
    // Getter for product name
    public String getProductName() {
        return this.productName;
    }
    
    // Getter for quantity
    public int getQuantity() {
        return this.quantity;
    }
    
    // Getter for unit price
    public float getUnitPrice() {
        return this.unitPrice;
    }
    
    // Display Inventory Product Details
    @Override
    public String toString() {
        return "Product Name - " + this.productName
                + "\nQuantity - " + this.quantity
                + "\nUnit Price - " + String.format("%.2f", this.unitPrice);
    }

}
