package oop_problem_solving.product_count_by_price_05;

public class ProductPriceCounter {
    
    public static int countProductsAbovePrice(PriceProduct[] products, float minimumPrice){
        
        int countProductsAbovePrice = 0;
        
        for(int i = 0; i < products.length; i++){
            if(products[i] != null){
                if(products[i].getUnitPrice() > minimumPrice){
                    countProductsAbovePrice++;
                }
            }
        }
        
        return countProductsAbovePrice;
    }

}
