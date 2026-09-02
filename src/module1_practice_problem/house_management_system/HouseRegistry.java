package module1_practice_problem.house_management_system;

public class HouseRegistry {
    public static void main(String[] args) {
        
        // Create two house objects
        House house1 = new House();
        House house2 = new House();
        
        // Details of House 1
        house1.setHouseId("House001");
        house1.setAddress("Road 5, Rajshahi");
        house1.setPrice(15000.0);
        house1.setBedrooms(2);
        house1.setIsAvailable(true);
        
        // Details of House 2
        house2.setHouseId("House002");
        house2.setAddress("Road 7, Rajshahi");
        house2.setPrice(20000.0);
        house2.setBedrooms(3);
        house2.setIsAvailable(true);
        
        // Display both house
        System.out.println("House 1:");
        System.out.println(house1.displayHouseDetails());
        
        System.out.println();
        
        System.out.println("House 2:");
        System.out.println(house2.displayHouseDetails());
        
        System.out.println();
        
        // Rent House 1
        System.out.println("Renting House 1:");
        house1.rentHouse();
        
        System.out.println();
        
        // Check new details of House 1
        System.out.println(house1.displayHouseDetails());
        System.out.println();
        
        // Try renting House 1 again
        house1.rentHouse();
        
        // Return the House 1
        System.out.println("Returning House 1:");
        house1.returnHouse();
        
        System.out.println();
        
        // Check new details for House 1 again after returning it
        System.out.println(house1.displayHouseDetails());
        System.out.println();
        
        // Check whether each house is luxury house
        System.out.println("Checking luxury House:");
        
        System.out.println(house1.getHouseId() + " is " +
                (house1.isLuxuryHouse() ? "Luxury house" : "not Luxury house"));
        
        System.out.println(house2.getHouseId() + " is " +
                (house2.isLuxuryHouse() ? "Luxury house" : "not Luxury house"));
        
        System.out.println();
        
        // Testing invalid price and bedroom values
        System.out.println("Testing invalid price:");
        house1.setPrice(-500000.0);
        
        System.out.println();
        
        System.out.println("Testing invalid bedroom values");
        house1.setBedrooms(-5);
        
        System.out.println();
        
        // Comparing the prices of the houses
        System.out.println("More expensive house:");
        House expensiveHouse = comparePrices(house1, house2);
        
        if (expensiveHouse != null) {
            System.out.println(expensiveHouse.getHouseId() +
                    " - $" + expensiveHouse.getPrice());
        } else {
            System.out.println("Both houses have the same price.");
        }
    }
    
    public static House comparePrices(House house1, House house2) {
        if (house1.getPrice() > house2.getPrice()) {
            return house1;
        } else if (house2.getPrice() > house1.getPrice()) {
            return house2;
        } else {
            return null;
        }
    }
}
