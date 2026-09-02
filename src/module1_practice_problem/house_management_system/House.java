package module1_practice_problem.house_management_system;

public class House {
    private String houseId;
    private String address;
    private double price;
    private int bedrooms;
    private boolean available;
    
    // Getters
    public String getHouseId() {
        return this.houseId;
    }
    
    public String getAddress() {
        return this.address;
    }
    
    public double getPrice() {
        return this.price;
    }
    
    public int getBedrooms() {
        return this.bedrooms;
    }
    
    public boolean isAvailable() {
        return this.available;
    }
    
    // Setters
    public void setHouseId(String houseId) {
        if (houseId != null && !houseId.trim().isEmpty()) {
            this.houseId = houseId;
        } else {
            System.out.println("Error: HouseId cannot be null or empty.");
        }
    }
    
    public void setAddress(String address) {
        if (address != null && !address.trim().isEmpty()) {
            this.address = address;
        } else {
            System.out.println("Error: Address cannot be null or empty.");
        }
    }
    
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Error: Price cannot be negative.");
        }
    }
    
    public void setBedrooms(int bedrooms) {
        if (bedrooms > 0) {
            this.bedrooms = bedrooms;
        } else {
            System.out.println("Error: Bedrooms cannot be negative or zero.");
        }
    }
    
    public void setIsAvailable(boolean available) {
        this.available = available;
    }
    
    // Display House Details
    public String displayHouseDetails() {
        
        String status;
        
        if (this.available) {
            status = "Available";
        } else {
            status = "Not Available";
        }
        
        return "House Id: " + this.houseId +
                "\nAddress: " + this.address +
                "\nPrice: $" + this.price +
                "\nBedrooms: " + this.bedrooms +
                "\nStatus: " + status;
        
    }
    
    // Rented house
    public void rentHouse() {
        if (this.available) {
            this.available = false;
            System.out.println(this.houseId + " has been rented.");
        } else {
            System.out.println(this.houseId + " is already rented.");
        }
    }
    
    // Return House
    public void returnHouse() {
        if (!this.available) {
            this.available = true;
            System.out.println(this.houseId + " is available now.");
        } else {
            System.out.println(this.houseId + " is already available.");
        }
    }
    
    // Luxury House or Not Luxury House
    public boolean isLuxuryHouse() {
        if (this.price >= 100000) {
            return true;
        } else {
            return false;
        }
    }
}
