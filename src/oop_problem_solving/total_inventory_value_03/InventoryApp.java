package oop_problem_solving.total_inventory_value_03;

public class InventoryApp {
    public static void main(String[] args){
        
        InventoryProduct product1 = new InventoryProduct();
        product1.setProductName("Laptop");
        product1.setQuantity(5);
        product1.setUnitPrice(5000.00f);
        
        InventoryProduct product2 = new InventoryProduct();
        product2.setProductName("Mouse");
        product2.setQuantity(2);
        product2.setUnitPrice(400.00f);
        
        InventoryProduct product3 = new InventoryProduct();
        product3.setProductName("Desktop");
        product3.setQuantity(3);
        product3.setUnitPrice(10000.00f);
        
        InventoryProduct product4 = new InventoryProduct();
        product4.setProductName("Keyboard");
        product4.setQuantity(5);
        product4.setUnitPrice(500.00f);
        
        System.out.println("============  Inventory Products ============");
        
        InventoryProduct[] products = new InventoryProduct[5];
        
        products[0] = product1;
        products[1] = product2;
        products[2] = product3;
        products[3] = product4;
        products[4] = null;
        
        for(int i = 0; i < products.length; i++){
            
            if(products[i] != null){
                System.out.println(products[i]);
                System.out.println("-----------------------------------");
            }
        }
        
        float totalInventoryValue =
                InventoryCalculator.calculateTotalInventoryValue(products);
        
        System.out.println(
                "Total Inventory Value: " + String.format("%.2f", totalInventoryValue)
        );
    }
}
