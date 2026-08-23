package object_filtering_practice.products_above_a_price;

public class Product {
    private String productName;
    private int productId;
    private float productPrice;
    
    // Setters for product name, ID, and price
    public void setProductName(String productName){
        this.productName = productName;
    }
    
    public void setProductId(int productId){
        this.productId = productId;
    }
    
    public void setProductPrice(float productPrice){
        this.productPrice = productPrice;
    }
    
    // Getters for product name, ID, and price
    public String getProductName(){
        return this.productName;
    }
    
    public int getProductId(){
        return this.productId;
    }
    
    public float getProductPrice(){
        return this.productPrice;
    }
    
    // Display the information of products
    @Override
    public String toString(){
        return "Product Name - " + this.productName
                + "\nProduct ID - " + this.productId
                + "\nProduct Price - " + String.format("%.2f", this.productPrice);
    }
}
