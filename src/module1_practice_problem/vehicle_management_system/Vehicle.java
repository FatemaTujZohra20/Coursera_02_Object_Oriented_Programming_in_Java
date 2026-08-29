package module1_practice_problem.vehicle_management_system;

public class Vehicle {
    
    private String vehicleId;
    private String brand;
    private double price;
    private int mileage;
    private boolean available;
    
    // Getters
    public String getVehicleId() {
        return this.vehicleId;
    }
    
    public String getBrand() {
        return this.brand;
    }
    
    public double getPrice() {
        return this.price;
    }
    
    public int getMileage() {
        return this.mileage;
    }
    
    public boolean isAvailable() {
        return this.available;
    }
    
    // Setters
    public void setVehicleId(String vehicleId) {
        if(vehicleId != null && !vehicleId.trim().isEmpty()){
            this.vehicleId = vehicleId;
        }else{
            System.out.println("Error: Vehicle ID cannot be null or empty.");
        }
    }
    
    public void setBrand(String brand){
        if(brand != null && !brand.trim().isEmpty()){
            this.brand = brand;
        } else {
            System.out.println("Error: Brand cannot be null or empty.");
        }
    }
    
    public void setPrice(double price){
        if (price >= 0) {
            this.price = price;
        } else{
            System.out.println("Error: Price cannot be negative.");
        }
    }
    
    public void setMileage(int mileage){
        if(mileage >= 0) {
            this.mileage = mileage;
        } else {
            System.out.println("Error: Mileage cannot be negative.");
        }
    }
    
    public void setIsAvailable(boolean available){
        this.available = available;
    }
    
    // Display vehicle details
    public String displayVehicleDetails(){
        
        return "Vehicle ID: " + this.vehicleId +
                "\nBrand: " + this.brand +
                "\nPrice: " + this.price +
                "\nMileage: " + this.mileage + " km" +
                "\nStatus: " +
                (this.available ? "Available" : "Sold");
    }
    
    // Sell vehicle
    public void sellVehicle(){
        if(this.available){
            this.available = false;
            
            System.out.println(this.brand + " has been sold.");
        }else{
            System.out.println(this.brand + " is already sold.");
        }
    }
    
    // Check whether vehicle is used
    public boolean isUsedVehicle(){
        return this.mileage > 0;
    }
    
    // Calculate price after discount
    public double calculateDiscountedPrice(double percentage) {
        if(percentage > 0 && percentage <= 100) {
            double discount = this.price * percentage / 100;
            
            return this.price - discount;
        } else {
            System.out.println("Error: Discount must be between 0 and 100.");
            return this.price;
        }
    }
}
