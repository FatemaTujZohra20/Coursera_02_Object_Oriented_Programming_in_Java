package object_filtering_practice.products_above_a_price;

public class ProductApp {
    public static void main(String[] args) {
        
        Product product1 = new Product();
        product1.setProductName("Laptop");
        product1.setProductId(1);
        product1.setProductPrice(10000.00f);
        
        Product product2 = new Product();
        product2.setProductName("Mouse");
        product2.setProductId(2);
        product2.setProductPrice(100.00f);
        
        Product product3 = new Product();
        product3.setProductName("MacBookPro");
        product3.setProductId(3);
        product3.setProductPrice(200000.00f);
        
        Product product4 = new Product();
        product4.setProductName("NoteBook");
        product4.setProductId(4);
        product4.setProductPrice(11000.00f);
        
        Product product5 = new Product();
        product5.setProductName("KeyBoard");
        product5.setProductId(5);
        product5.setProductPrice(5000.00f);
        
        Product product6 = new Product();
        product6.setProductName("Microsoft Windows");
        product6.setProductId(6);
        product6.setProductPrice(500.00f);
        
        Product[] products = new Product[8];
        
        products[0] = product1;
        products[1] = product2;
        products[2] = product3;
        products[3] = product4;
        products[4] = product5;
        products[5] = product6;
        products[6] = null;
        
        System.out.println("=============== Product information ===============");
        
        for (int i = 0; i < products.length; i++){
            if(products[i] != null){
                System.out.println(products[i]);;
                System.out.println("----------------------------------------------");
            }
        }
        
        // Find accounts above a given price
        Product[] productsAboveGivenPrice = ProductCalculator.productsAboveGivenPrice(products, 1000.00f);
        
        System.out.println("================ Products Above 1000.00f Price ================");
        
        for(int i = 0; i < productsAboveGivenPrice.length; i++){
            System.out.println(productsAboveGivenPrice[i]);
            System.out.println("------------------------------------------------------------");
        }
        
        
    }
}
