package object_filtering_practice.products_above_a_price;

public class ProductCalculator {
    
    public static Product[] productsAboveGivenPrice(Product[] products, float minimumPrice){
        
        int matchCountOfProducts = 0;
        
        for(int i = 0; i < products.length; i++){
            if(products[i] != null) {
                if(products[i].getProductPrice() > minimumPrice){
                    matchCountOfProducts++;
                }
            }
        }
        
        Product[] productsAboveGivenPrice = new Product[matchCountOfProducts];
        
        int resultOfMatchedProductsAboveGivenPrice = 0;
        
        for(int i = 0; i < products.length; i++) {
            if(products[i] != null){
                if(products[i].getProductPrice() > minimumPrice){
                    productsAboveGivenPrice[resultOfMatchedProductsAboveGivenPrice] = products[i];
                    resultOfMatchedProductsAboveGivenPrice++;
                }
            }
        }
        
        return productsAboveGivenPrice;
    }
}
