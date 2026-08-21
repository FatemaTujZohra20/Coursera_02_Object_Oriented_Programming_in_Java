package oop_basic_in_java.bank_account_04;

public class BankAccountCalculator {
    
    // 1. Calculate total balance
    public static float totalAccountBalance(BankAccount[] accounts){
        float totalBalance = 0;
        
        for(int i = 0; i < accounts.length; i++){
            if(accounts[i] != null){
                totalBalance += accounts[i].getAccountBalance();
            }
        }
        
        return totalBalance;
    }
}
