package module1_practice_problem.book_management_system;

public class Book {
    
    private String bookId;
    private String title;
    private String author;
    private double price;
    private boolean available;
    
    // Getters
    public String getAuthor() {
        return this.author;
    }
    
    public boolean getIsAvailable() {
        return this.available;
    }
    
    public String getBookId() {
        return this.bookId;
    }
    
    public double getPrice() {
        return this.price;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    // Setters
    public void setAuthor(String author) {
        if (author != null && !author.trim().isEmpty()) {
            this.author = author;
        } else {
            System.out.println("Error: Author cannot be null or empty.");
        }
        
    }
    
    public void setIsAvailable(boolean available) {
        this.available = available;
    }
    
    public void setBookId(String bookId) {
        if (bookId != null && !bookId.trim().isEmpty()) {
            this.bookId = bookId;
        } else {
            System.out.println("Error: BookId cannot be null or empty.");
        }
    }
    
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Error: Price cannot be negative.");
        }
    }
    
    public void setTitle(String title) {
        if (title != null && !title.trim().isEmpty()) {
            this.title = title;
        } else {
            System.out.println("Error: Title cannot be null or empty.");
        }
    }
    
    
    // Display book information
    public String displayBookDetails() {
        
        String status;
        
        if (this.available) {
            status = "Available";
        } else {
            status = "Borrowed";
        }
        return "ID: " + this.bookId +
                "\nTitle: " + this.title +
                "\nAuthor: " + this.author +
                "\nPrice: $" + this.price +
                "\nStatus: " + status;
    }
    
    // Borrow Book
    public void borrowBook(){
        
        if(this.available){
            this.available = false;
            System.out.println(this.title + " has been borrowed.");
        } else{
            System.out.println(this.title + " is already borrowed.");
        }
    }
    
    // Return Book
    public void returnBook(){
        if(!this.available){
            this.available = true;
            
            System.out.println(this.title + " has been returned.");
        } else{
            System.out.println(this.title + " is already returned.");
        }
    }
    
    // Expensive or not expensive
    public boolean isExpensive(){
        
        if(this.price >= 50) {
            return true;
        } else{
            return false;
        }
    }

}
