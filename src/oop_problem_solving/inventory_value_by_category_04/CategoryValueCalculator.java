package oop_problem_solving.inventory_value_by_category_04;

public class CategoryValueCalculator {

    public static float calculateValueByCategory(CategoryInventoryItem[] items, String Category) {
        
        float totalInventoryValue = 0;
        
        for(int i = 0; i < items.length; i++){
            if(items[i] != null) {
                if(items[i].getCategory().equals(Category)) {
                    totalInventoryValue += items[i].getQuantity() * items[i].getUnitPrice();
                }
            }
        }
        
        return totalInventoryValue;
    }

}
