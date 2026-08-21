package oop_basic_in_java.bank_account_04;

public class BankAccountApp {
    public static void main(String[] args) {
        
        BankAccount account1 = new BankAccount();
        account1.setAccountHolderName("Alex");
        account1.setAccountNumber(1001);
        account1.setAccountBalance(5000.00f);
        
        BankAccount account2 = new BankAccount();
        account2.setAccountHolderName("John");
        account2.setAccountNumber(1002);
        account2.setAccountBalance(8000.00f);
        
        BankAccount account3 = new BankAccount();
        account3.setAccountHolderName("Jane");
        account3.setAccountNumber(1003);
        account3.setAccountBalance(12000.00f);
        
        BankAccount account4 = new BankAccount();
        account4.setAccountHolderName("Mike");
        account4.setAccountNumber(1004);
        account4.setAccountBalance(3000.00f);
        
        BankAccount account5 = new BankAccount();
        account5.setAccountHolderName("Sara");
        account5.setAccountNumber(1005);
        account5.setAccountBalance(15000.00f);
        
        BankAccount[] accounts = new BankAccount[6];
        
        accounts[0] = account1;
        accounts[1] = account2;
        accounts[2] = account3;
        accounts[3] = account4;
        accounts[4] = account5;
        accounts[5] = null;

// Display all accounts
        
        System.out.println("=========== Bank Accounts ===========");
        
        for (int i = 0; i < accounts.length; i++) {
            
            if (accounts[i] != null) {
                
                System.out.println(accounts[i]);
                
                System.out.println("-----------------------------------");
                
            }
            
        }

// Calculate total balance
        
        float totalBalance =
                
                BankAccountCalculator.totalAccountBalance(accounts);
        
        System.out.println(
                
                "Total Account Balance: "
                        
                        + String.format("%.2f", totalBalance)
        
        );

// Find accounts above balance
        
        BankAccount[] accountsAboveBalance =
                
                BankAccountCalculator.findAccountsAboveBalance(
                        
                        accounts, 7000.00f);
        
        System.out.println(
                
                "\n=========== Accounts Above 7000 ==========="
        
        );
        
        for (int i = 0; i < accountsAboveBalance.length; i++) {
            
            if (accountsAboveBalance[i] != null) {
                
                System.out.println(accountsAboveBalance[i]);
                
                System.out.println("-----------------------------------");
                
            }
            
        }

// Find accounts above account number
        
        BankAccount[] accountsAboveNumber =
                
                BankAccountCalculator.findAccountsAboveAccountNumber(
                        
                        accounts, 1002);
        
        System.out.println(
                
                "\n=========== Accounts Above Number 1002 ==========="
        
        );
        
        for (int i = 0; i < accountsAboveNumber.length; i++) {
            
            if (accountsAboveNumber[i] != null) {
                
                System.out.println(accountsAboveNumber[i]);
                
                System.out.println("-----------------------------------");
                
            }
            
        }
        
    }
    
}
