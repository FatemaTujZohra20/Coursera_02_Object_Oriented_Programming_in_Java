package oop_problem_solving.average_product_price_01;

public class ProductPriceCalculator {
    
    // Product Price Calculator Logic
    public static float calculateAveragePrice(Product[] products){
        
        float totalPrice = 0;
        int productCount = 0;
        
        for(int i = 0; i < products.length; i++){
            
            if (products[i] != null){
                totalPrice += products[i].getProductPrice();
                productCount++;
            }
        }
        
        if (productCount > 0) {
            return totalPrice / productCount;
        }
        
        return 0;
    }
}
