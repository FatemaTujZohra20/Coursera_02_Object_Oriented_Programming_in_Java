package module1_practice_problem.movie_management_system;

public class Movie {
    
    // Private fields
    private String movieId;
    private String title;
    private String genre;
    private double rating;
    private int duration;
    private boolean available;
    
    // Default constructor
    public Movie(){
        this.movieId = "Unknown";
        this.title = "Unknown";
        this.genre = "Unknown";
        this.rating = 0.0;
        this.duration = 1;
        this.available = true;
    }
    
    // Parameterized constructor
    public Movie(String movieId,
                 String title,
                 String genre,
                 double rating,
                 int duration,
                 boolean available) {
        setMovieId(movieId);
        setTitle(title);
        setGenre(genre);
        setRating(rating);
        setDuration(duration);
        setAvailable(available);
    }
    
    // =====================
    // Getters
    // =====================
    public String getMovieId() {
        return this.movieId;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public String getGenre() {
        return this.genre;
    }
    
    public double getRating() {
        return this.rating;
    }
    
    public int getDuration() {
        return this.duration;
    }
    
    public boolean isAvailable() {
        return this.available;
    }
    
    // ================================
    // Setters with validation
    // ================================
    public void setMovieId(String movieId) {
        
        if(movieId != null && !movieId.trim().isEmpty()){
            this.movieId = movieId;
        }else{
            System.out.println("Error: Movie ID cannot be null or empty");
        }
    }
    
    public void setTitle(String title) {
        
        if(title != null && !title.trim().isEmpty()){
            this.title = title;
        }else{
            System.out.println("Error: Title cannot be null or empty");
        }
    }
    
    public void setGenre(String genre) {
        if(genre != null && !genre.trim().isEmpty()){
            this.genre = genre;
        }else {
            System.out.println("Error: Genre cannot be null or empty");
        }
    }
    
    public void setRating(double rating) {
        
        if(rating >= 0 && rating <= 10){
            this.rating = rating;
        }else{
            System.out.println("Error: Rating should be between 0 and 10");
        }
    }
    
    public void setDuration(int duration) {
        if(duration > 0){
            this.duration = duration;
        }else {
            System.out.println("Error: Duration cannot be null or zero");
        }
    }
    
    public void setAvailable(boolean available) {
        this.available = available;
    }
    
    // =============================================
    // Display Movie Details
    // =============================================
    public String displayMovieDetails(){
        
        String status;
        
        if(this.available){
            status = "Available";
        } else{
            status = "Not Available";
        }
        
        return "Movie ID: " + this.movieId +
                "\nTitle: " + this.title +
                "\nGenre: " + this.genre +
                "\nRating: " + this.rating +
                "\nDuration: " + this.duration + " minutes" +
                "\nStatus: " + status;
    }
    
    // =============================================
    // Rating Category
    // =============================================
    public String getRatingCategory(){
        
        if(this.rating >= 8.0){
            return "Excellent";
        }else if(this.rating >= 6.0){
            return "Good";
        } else if(this.rating >= 4.0){
            return "Average";
        }else{
            return "Poor";
        }
    }
    
    // =============================================
    // Duration Category
    // =============================================
    public String getDurationCategory(){
        if(this.duration <= 50){
            return "Short";
        } else if(this.duration <= 150){
            return "Medium";
        }else{
            return "Long";
        }
    }
    
    // =============================================
    // Rent Movie
    // =============================================
    public void rentMovie(){
        if(this.available){
            this.available = false;
            System.out.println(this.title + " has been rented.");
        }else{
            System.out.println(this.title + " is already unavailable.");
        }
    }
    
    // =============================================
    // Return Movie
    // =============================================
    public void returnMovie(){
        if(!this.available){
            this.available = true;
            System.out.println(this.title + " has been returned.");
        }else{
            System.out.println(this.title + " is already returned.");
        }
    }
    
    // =============================================
    // Update Rating
    // =============================================
    public void updateRating(double newRating){
        
        if(newRating >= 0 && newRating <= 10){
            this.rating = newRating;
            
            System.out.println(this.title + "'s rating has been updated to " + newRating);
        }else{
            System.out.println("Error: Rating must be between 0 and 10");
        }
    }
}
