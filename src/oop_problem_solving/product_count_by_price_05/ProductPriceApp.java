package oop_problem_solving.product_count_by_price_05;

public class ProductPriceApp {
    public static void main(String[] args){
        
        PriceProduct product1 = new PriceProduct();
        product1.setProductName("Product 1");
        product1.setUnitPrice(50.00f);
        
        PriceProduct product2 = new PriceProduct();
        product2.setProductName("Product 2");
        product2.setUnitPrice(100.00f);
        
        PriceProduct product3 = new PriceProduct();
        product3.setProductName("Product 3");
        product3.setUnitPrice(40.00f);
        
        PriceProduct product4 = new PriceProduct();
        product4.setProductName("Product 4");
        product4.setUnitPrice(60.00f);
        
        PriceProduct[] products = new PriceProduct[5];
        
        products[0] = product1;
        products[1] = product2;
        products[2] = product3;
        products[3] = product4;
        products[4] = null;
        
        System.out.println("========== Product count by price app =========");
        
        for(int i = 0; i < products.length; i++){
            if(products[i] != null){
                System.out.println(products[i]);
                System.out.println("--------------------------------------------");
            }
        }
        
        int countProductsAbovePrice =
                ProductPriceCounter.countProductsAbovePrice(products, 40.00f);
        
        System.out.println("Number of products above 40.00 : " + countProductsAbovePrice);
        
        
    }
}
