package oop_basic_in_java.bank_account_04;

public class BankAccount {
    
    private String accountHolderName;
    private int accountNumber;
    private float accountBalance;
    
    // Setters for account name, number, balance
    
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
    
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }
    
    // Getters for account name, number, balance
    
    public String getAccountHolderName() {
        return this.accountHolderName;
    }
    
    public int getAccountNumber() {
        return this.accountNumber;
    }
    
    public float getAccountBalance() {
        return this.accountBalance;
    }
    
    // Display account information
    @Override
    public String toString() {
        return "Account holder name - " + this.accountHolderName
                + "\nAccount number - " + this.accountNumber
                + "\nAccount balance - " + String.format("%.2f", this.accountBalance);
    }
}
