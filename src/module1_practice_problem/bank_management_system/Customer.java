package module1_practice_problem.bank_management_system;

// Customer class to store and manage customer information
public class Customer {
    // Private variables for customer data
    private String customerId;
    private String name;
    private double accountBalance;
    private boolean active;
    
    // Getter for customer ID
    public String getCustomerId() {
        return this.customerId;
    }
    
    // Getter for name
    public String getName() {
        return this.name;
    }
    
    // Getter for account balance
    public double getAccountBalance() {
        return this.accountBalance;
    }
    
    // Getter for active status
    public boolean getIsActive() {
        return this.active;
    }
    
    // Setter for customer ID
    public void setCustomerId(String customerId) {
        
        if (customerId != null && !customerId.trim().isEmpty()) {
            this.customerId = customerId;
        } else {
            System.out.println("Error: Customer ID cannot be null or empty.");
        }
    }
    
    // Setter for name
    public void setName(String name) {
        
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Error: Name cannot be null or empty.");
        }
    }
    
    // Setter for account balance
    public void setAccountBalance(double accountBalance) {
        
        if (accountBalance >= 0) {
            this.accountBalance = accountBalance;
        } else {
            System.out.println("Error: Account balance cannot be negative.");
        }
    }
    
    // Setter for active status
    public void setIsActive(boolean active) {
        this.active = active;
    }
    
    // Display customer details
    public String displayCustomerDetails() {
        
        String status;
        
        if (this.active) {
            status = "Active";
        } else {
            status = "Inactive";
        }
        
        return "ID: " + this.customerId +
                "\nName: " + this.name +
                "\nBalance: $" + this.accountBalance +
                "\nStatus: " + status;
    }
    
    // Deposit money
    public void deposit(double amount) {
        
        if (amount > 0) {
            
            this.accountBalance += amount;
            
            System.out.println(
                    "$" + amount +
                            " deposited into " +
                            this.name + "'s account."
            );
            
        } else {
            
            System.out.println(
                    "Error: Deposit amount must be greater than 0."
            );
        }
    }
    
    // Withdraw money
    public void withdraw(double amount) {
        
        if (amount <= 0) {
            
            System.out.println(
                    "Error: Withdrawal amount must be greater than 0."
            );
            
        } else if (amount > this.accountBalance) {
            
            System.out.println(
                    "Error: Insufficient account balance."
            );
            
        } else {
            
            this.accountBalance -= amount;
            
            System.out.println(
                    "$" + amount +
                            " withdrawn from " +
                            this.name + "'s account."
            );
        }
    }
    
    // Check whether customer is premium
    public boolean isPremiumCustomer() {
        
        if (this.accountBalance >= 10000) {
            return true;
        } else {
            return false;
        }
    }
    
    // Deactivate account
    public void deactivateAccount() {
        
        if (this.active) {
            
            this.active = false;
            
            System.out.println(
                    this.name + "'s account has been deactivated."
            );
            
        } else {
            
            System.out.println(
                    this.name + "'s account is already inactive."
            );
        }
    }
}
