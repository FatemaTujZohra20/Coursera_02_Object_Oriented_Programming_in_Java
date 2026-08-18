package oop_basic_in_java.product_inventory_02;

public class ProductInventoryApp {
    
    public static void main(String[] args) {
        
        StoreProduct product1 = new StoreProduct();
        product1.setProductName("Laptop");
        product1.setQuantity(5);
        product1.setUnitPrice(5000.00f);
        
        StoreProduct product2 = new StoreProduct();
        product2.setProductName("MacBookPro");
        product2.setQuantity(10);
        product2.setUnitPrice(100000.00f);
        
        StoreProduct product3 = new StoreProduct();
        product3.setProductName("Ram");
        product3.setQuantity(20);
        product3.setUnitPrice(100.00f);
        
        StoreProduct product4 = new StoreProduct();
        product4.setProductName("Desktop");
        product4.setQuantity(5);
        product4.setUnitPrice(20000.00f);
        
        StoreProduct product5 = new StoreProduct();
        product5.setProductName("Keyboard");
        product5.setQuantity(10);
        product5.setUnitPrice(500.00f);
        
        StoreProduct product6 = new StoreProduct();
        product6.setProductName("WebCam");
        product6.setQuantity(10);
        product6.setUnitPrice(1000.00f);
        
        StoreProduct[] products = new StoreProduct[7];
        
        products[0] = product1;
        products[1] = product2;
        products[2] = product3;
        products[3] = product4;
        products[4] = product5;
        products[5] = product6;
        products[6] = null;
        
        System.out.println("===========  Products Inventory Details  ========");
        
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                System.out.println(products[i]);
                System.out.println("--------------------------------------------------");
            }
        }
        
        float totalInventoryValue = InventoryValueCalculator.totalInventoryValue(products);
        
        System.out.println("Total Inventory Value : " + totalInventoryValue);
        
    }
}
