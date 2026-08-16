package oop_problem_solving.total_inventory_value_03;

public class InventoryCalculator {

    public static float calculateTotalInventoryValue(
            InventoryProduct[] products) {
        
        float totalInventoryValue = 0;
        
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                totalInventoryValue += products[i].getQuantity() * products[i].getUnitPrice();
            }
        }
        
        return totalInventoryValue;
    }
}
