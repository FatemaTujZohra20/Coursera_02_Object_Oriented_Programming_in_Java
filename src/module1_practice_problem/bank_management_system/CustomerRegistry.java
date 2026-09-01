package module1_practice_problem.bank_management_system;

// CustomerRegistry class to test the Customer class
public class CustomerRegistry {
    public static void main(String[] args) {
        
        // Create two Customer objects
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();
        
        // Set values for first customer
        customer1.setCustomerId("C001");
        customer1.setName("Alice");
        customer1.setAccountBalance(12000);
        customer1.setIsActive(true);
        
        // Set values for second customer
        customer2.setCustomerId("C002");
        customer2.setName("Bob");
        customer2.setAccountBalance(5000);
        customer2.setIsActive(true);
        
        // Display customer details
        System.out.println("Customer Information:");
        
        System.out.println(customer1.displayCustomerDetails());
        
        System.out.println();
        
        System.out.println(customer2.displayCustomerDetails());
        
        // Deposit money into customer 2's account
        System.out.println("\nDepositing money:");
        
        customer2.deposit(3000);
        
        // Withdraw money from customer 1's account
        System.out.println("\nWithdrawing money:");
        
        customer2.withdraw(2000);
        
        // Try invalid withdrawal
        System.out.println("\nTesting invalid withdrawal:");
        
        customer2.withdraw(10000);
        
        // Check premium status
        System.out.println("\nPremium Customer Status:");
        
        System.out.println(
                customer1.getName() +
                " is " +
                ((customer1.isPremiumCustomer())
                        ? "a premium customer"
                        : "not a premium customer")
        );
        
        System.out.println(
                customer2.getName() +
                " is " +
                ((customer1.isPremiumCustomer())
                        ? "a premium customer"
                        : "not a premium customer")
        );
        
        // Deactivate customer 2
        System.out.println("\nDeactivating Customer 2:");
        
        customer2.deactivateAccount();
        
        // Display final details
        System.out.println("\nFinal Customer Information:");
        
        System.out.println(customer1.displayCustomerDetails());
        
        System.out.println();
        
        System.out.println(customer2.displayCustomerDetails());
        
        // Compare account balances
        Customer higherBalanceCustomer =
                compareBalances(customer1, customer2);
        
        System.out.println("\nBalance Comparison:");
        
        if (higherBalanceCustomer != null) {
            System.out.println(higherBalanceCustomer.getName() +
                    " has the higher balance with $" +
                    higherBalanceCustomer.getAccountBalance()
            );
        } else{
            System.out.println("Equal balances");
        }
        
        // Test invalid balance
        System.out.println("\nTesting balance validation:");
        
        customer1.setAccountBalance(-500);
    }
    
    // Compare balances of two customers
    public static Customer compareBalances(
            Customer customer1,
            Customer customer2) {
        if (customer1.getAccountBalance()
                > customer2.getAccountBalance()) {
            return customer1;
        } else if (customer2.getAccountBalance()
                > customer1.getAccountBalance()) {
            return customer2;
        } else{
            return null;
        }
    }
}
