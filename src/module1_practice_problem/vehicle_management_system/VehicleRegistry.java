package module1_practice_problem.vehicle_management_system;

public class VehicleRegistry {
    
    public static void main(String[] args) {
        
        // Create two vehicles
        Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle2 = new Vehicle();
        
        // Set first vehicle
        vehicle1.setVehicleId("V001");
        vehicle1.setBrand("Toyota");
        vehicle1.setPrice(25000);
        vehicle1.setMileage(15000);
        vehicle1.setIsAvailable(true);
        
        // Set second vehicle
        vehicle2.setVehicleId("V002");
        vehicle2.setBrand("BMW");
        vehicle2.setPrice(45000);
        vehicle2.setMileage(5000);
        vehicle2.setIsAvailable(true);
        
        // Display vehicles
        System.out.println("Vehicle 1:");
        System.out.println(vehicle1.displayVehicleDetails());
        
        System.out.println("\nVehicle 2:");
        System.out.println(vehicle2.displayVehicleDetails());
        
        // Compare prices
        Vehicle expensiveVehicle =
                comparePrices(vehicle1, vehicle2);
        
        System.out.println("\nMore expensive vehicle:");
        
        if (expensiveVehicle != null) {
            
            System.out.println(
                    expensiveVehicle.getBrand() +
                            " - $" +
                            expensiveVehicle.getPrice()
            );
            
        } else {
            
            System.out.println(
                    "Both vehicles have the same price."
            );
        }
        
        // Check used vehicle status
        System.out.println("\nVehicle Type:");
        
        System.out.println(
                vehicle1.getBrand() +
                        " is " +
                        (vehicle1.isUsedVehicle()
                                ? "a used vehicle"
                                : "a new vehicle")
        );
        
        System.out.println(
                vehicle2.getBrand() +
                        " is " +
                        (vehicle2.isUsedVehicle()
                                ? "a used vehicle"
                                : "a new vehicle")
        );
        
        // Calculate discounted prices
        System.out.println("\nDiscounted Prices:");
        
        System.out.println(
                vehicle1.getBrand() +
                        " after 10% discount: $" +
                        vehicle1.calculateDiscountedPrice(10)
        );
        
        System.out.println(
                vehicle2.getBrand() +
                        " after 15% discount: $" +
                        vehicle2.calculateDiscountedPrice(15)
        );
        
        // Sell vehicle
        System.out.println("\nSelling Vehicle 1:");
        
        vehicle1.sellVehicle();
        
        System.out.println(vehicle1.displayVehicleDetails());
        
        // Try selling again
        System.out.println("\nTrying to sell Vehicle 1 again:");
        
        vehicle1.sellVehicle();
        
        // Test invalid values
        System.out.println("\nTesting validation:");
        
        vehicle2.setPrice(-5000);
        vehicle2.setMileage(-100);
        vehicle2.setBrand("");
    }
    
    public static Vehicle comparePrices(
            Vehicle vehicle1,
            Vehicle vehicle2) {
        
        if (vehicle1.getPrice() > vehicle2.getPrice()) {
            
            return vehicle1;
            
        } else if (vehicle2.getPrice() > vehicle1.getPrice()) {
            
            return vehicle2;
            
        } else {
            
            return null;
        }
    }
    
}
