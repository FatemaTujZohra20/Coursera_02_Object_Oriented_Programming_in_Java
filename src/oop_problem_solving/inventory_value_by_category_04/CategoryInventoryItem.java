package oop_problem_solving.inventory_value_by_category_04;

public class CategoryInventoryItem {
    
    private String itemName;
    private String category;
    private int quantity;
    private float unitPrice;
    
    // Setter for item name
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    
    // Setter for category
    public void setCategory(String category){
        this.category = category;
    }
    
    // Setter for quantity
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    
    // Setter for unit price
    public void setUnitPrice(float unitPrice){
        this.unitPrice = unitPrice;
    }
    
    // Getter for item name
    public String getItemName(){
        return this.itemName;
    }
    
    // Getter for category
    public String getCategory(){
        return this.category;
    }
    
    // Getter for quantity
    public int getQuantity(){
        return this.quantity;
    }
    
    // Getter for unit price
    public float getUnitPrice(){
        return this.unitPrice;
    }
    
    // Display Inventory Values
    @Override
    public String toString(){
        return "Item name - " + this.itemName
                + "\nCategory - " + this.category
                + "\nQuantity - " + this.quantity
                + "\nUnit Price - " + String.format("%.2f", this.unitPrice);
    }
}
