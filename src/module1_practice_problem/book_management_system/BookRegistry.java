package module1_practice_problem.book_management_system;

public class BookRegistry {
    public static void main(String[] args) {
        
        // Create two book objects
        Book book1 = new Book();
        Book book2 = new Book();
        
        // Set values for first Book
        book1.setBookId("B001");
        book1.setTitle("Clean Code");
        book1.setAuthor("Robert C. Martin");
        book1.setPrice(45.0);
        book1.setIsAvailable(true);
        
        // Set values for second books
        book2.setBookId("B002");
        book2.setTitle("Effective Java");
        book2.setAuthor("Joshua Bloch");
        book2.setPrice(55.0);
        book2.setIsAvailable(true);
        
        // Display books
        System.out.println("Book 1:");
        System.out.println(book1.displayBookDetails());
        
        System.out.println("Book 2:");
        System.out.println(book2.displayBookDetails());
        
        // Borrow first book
        System.out.println("\nBorrowing Book 1:");
        book1.borrowBook();
        
        System.out.println(book1.displayBookDetails());
        
        // Try Borrowing again
        System.out.println("\nTrying to borrow Book 1 again:");
        book1.borrowBook();
        
        // Return Book
        System.out.println("\nReturning Book 1:");
        book1.returnBook();
        
        // Compare prices
        Book expensiveBook = comparePrices(book1, book2);
        
        System.out.println("\nMore expensive book:");
        
        if(expensiveBook != null){
            System.out.println(expensiveBook.getTitle() +
                    " - $" +
                    expensiveBook.getPrice());
        } else{
            System.out.println("Both books have the same price");
        }
        
        // Check expensive status
        System.out.println("\nExpensive status:");
        
        System.out.println(book1.getTitle() + " is " +
                (book1.isExpensive() ? "expensive" : "not expensive")
        );
        
        System.out.println(book2.getTitle() + " is " +
                (book2.isExpensive() ? "expensive" : "not expensive")
        );
        
        // Test Invalid Price
        System.out.println("\nTesting price validation:");
        book1.setPrice(-100);
        
    }
    
    public static Book comparePrices(Book book1, Book book2) {
        if(book1.getPrice() > book2.getPrice()){
            return book1;
        } else if(book1.getPrice() < book2.getPrice()){
            return book2;
        } else{
            return null;
        }
    }
}
