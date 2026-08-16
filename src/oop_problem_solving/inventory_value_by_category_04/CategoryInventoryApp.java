package oop_problem_solving.inventory_value_by_category_04;

public class CategoryInventoryApp {
    public static void main(String[] args) {
        
        CategoryInventoryItem item1 = new CategoryInventoryItem();
        item1.setItemName("Laptop");
        item1.setCategory("Electronics");
        item1.setQuantity(5);
        item1.setUnitPrice(5000.00f);
        
        CategoryInventoryItem item2 = new CategoryInventoryItem();
        item2.setItemName("Milk");
        item2.setCategory("Groceries");
        item2.setQuantity(2);
        item2.setUnitPrice(200.00f);
        
        CategoryInventoryItem item3 = new CategoryInventoryItem();
        item3.setItemName("Mouse");
        item3.setCategory("Electronics");
        item3.setQuantity(10);
        item3.setUnitPrice(100.00f);
        
        CategoryInventoryItem item4 = new CategoryInventoryItem();
        item4.setItemName("Bread");
        item4.setCategory("Groceries");
        item4.setQuantity(3);
        item4.setUnitPrice(50.00f);
        
        CategoryInventoryItem item5 = new CategoryInventoryItem();
        item5.setItemName("Knife");
        item5.setCategory("KitchenStainSteel");
        item5.setQuantity(2);
        item5.setUnitPrice(10.00f);
        
        System.out.println("=========== Inventory Item By Category Value ========= ");
        
        CategoryInventoryItem[] items = new CategoryInventoryItem[6];
        
        items[0] = item1;
        items[1] = item2;
        items[2] = item3;
        items[3] = item4;
        items[4] = item5;
        items[5] = null;
        
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                
                
                System.out.println(items[i]);
                System.out.println("------------------------------------");
            }
        }
        
        float totalInventoryValueByCategory =
                CategoryValueCalculator.calculateValueByCategory(items, "Electronics");
        
        System.out.println("Total inventory value by Category: " + totalInventoryValueByCategory);
    }
}
