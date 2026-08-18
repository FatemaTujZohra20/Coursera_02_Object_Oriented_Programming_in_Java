package oop_basic_in_java.product_inventory_02;

public class InventoryValueCalculator {
    
    public static float totalInventoryValue(StoreProduct[] products) {
        
        float totalInventoryValue = 0;
        
        for (int i = 0; i < products.length; i++){
            if(products[i] != null) {
                totalInventoryValue += products[i].getQuantity() * products[i].getUnitPrice();
            }
        }
        
        return totalInventoryValue;
        
    }
    
}
