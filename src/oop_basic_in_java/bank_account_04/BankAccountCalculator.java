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
    
    // 2. Find accounts whose balance is greater than a given amount
    public static BankAccount[] findAccountsAboveBalance(BankAccount[] accounts, float minimumBalance){
        BankAccount[] matchingAccounts = new BankAccount[accounts.length];
        
        int matchCount = 0;
        
        for(int i = 0; i < accounts.length; i++){
            if(accounts[i] != null){
                if(accounts[i].getAccountBalance() > minimumBalance){
                    matchingAccounts[matchCount] = accounts[i];
                    matchCount++;
                }
            }
        }
        
        return matchingAccounts;
    }
    
    // 3. Find accounts whose account number is greater than a given number
    public static BankAccount[] findAccountsAboveAccountNumber(BankAccount[] accounts, float minimumAccountNumber){
        BankAccount[] matchingAccounts = new BankAccount[accounts.length];
        
        int matchCount = 0;
        for(int i = 0; i < accounts.length; i++){
            if(accounts[i] != null){
                if(accounts[i].getAccountNumber() > minimumAccountNumber){
                    matchingAccounts[matchCount] = accounts[i];
                    matchCount++;
                }
            }
        }
        
        return matchingAccounts;
    }
}
