package oop_problem_solving.average_product_price_01;

public class ProductPriceApp {
    
    public static void main (String[] args) {
        
        Product product1 = new Product();
        product1.setProductName("Laptop");
        product1.setProductPrice(80000.00f);
        
        Product product2 = new Product();
        product2.setProductName("Mouse");
        product2.setProductPrice(1000.00f);
        
        Product product3 = new Product();
        product3.setProductName("Keyboard");
        product3.setProductPrice(2000.00f);
        
        Product[] products = new Product[4];
        
        products[0] = product1;
        products[1] = product2;
        products[2] = product3;
        
        // products[3] intentionally remains null
        
        System.out.println("===========  Products  ===========");
        
        for(int i = 0; i < products.length; i++) {
            
            if (products[i] != null) {
                System.out.println(products[i]);
                System.out.println("---------------------------------");
            }
        }
        
        float averagePrice =
                ProductPriceCalculator.calculateAveragePrice(products);
        
        System.out.println(
                "Average Product Price: "
                        + String.format("%.2f", averagePrice));
    }
}
