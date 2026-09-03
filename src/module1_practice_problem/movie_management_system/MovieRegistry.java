package module1_practice_problem.movie_management_system;

public class MovieRegistry {
    public static void main(String[] args) {
        // =====================================
        // 1. Create two Movie objects
        // =====================================
        
        Movie movie1 = new Movie(
                "M001",
                "Inception",
                "Sci-Fi",
                8.8,
                148,
                true
        );
        
        Movie movie2 = new Movie(
                "M002",
                "Interstellar",
                "Sci-Fi",
                8.6,
                169,
                true
        );
        
        // =====================================
        // 2. Display movie details
        // =====================================
        
        System.out.println("Movie 1:");
        System.out.println(movie1.displayMovieDetails());
        
        System.out.println();
        
        System.out.println("Movie 2:");
        System.out.println(movie2.displayMovieDetails());
        
        // =====================================
        // 3. Rating categories
        // =====================================
        
        System.out.println("\nRating Categories:");
        
        System.out.println(
                movie1.getTitle() +
                        ": " +
                        movie1.getRatingCategory()
        );
        
        System.out.println(
                movie2.getTitle() +
                        ": " +
                        movie2.getRatingCategory()
        );
        
        // =====================================
        // 4. Duration categories
        // =====================================
        
        System.out.println("\nDuration Categories:");
        
        System.out.println(
                movie1.getTitle() +
                        ": " +
                        movie1.getDurationCategory()
        );
        
        System.out.println(
                movie2.getTitle() +
                        ": " +
                        movie2.getDurationCategory()
        );
        
        // =====================================
        // 5. Rent Movie 1
        // =====================================
        
        System.out.println("\nRenting Movie 1:");
        
        movie1.rentMovie();
        
        // =====================================
        // 6. Try renting Movie 1 again
        // =====================================
        
        System.out.println("\nTrying to rent Movie 1 again:");
        
        movie1.rentMovie();
        
        // =====================================
        // 7. Return Movie 1
        // =====================================
        
        System.out.println("\nReturning Movie 1:");
        
        movie1.returnMovie();
        
        // =====================================
        // 8. Update Movie 2 rating
        // =====================================
        
        System.out.println("\nUpdating Movie 2 rating:");
        
        movie2.updateRating(9.0);
        
        System.out.println(
                "New Rating: " +
                        movie2.getRating()
        );
        
        // =====================================
        // 9. Compare ratings
        // =====================================
        
        System.out.println("\nMovie Rating Comparison:");
        
        Movie higherRatedMovie =
                compareRatings(movie1, movie2);
        
        if (higherRatedMovie != null) {
            
            System.out.println(
                    higherRatedMovie.getTitle() +
                            " has the higher rating: " +
                            higherRatedMovie.getRating()
            );
            
        } else {
            
            System.out.println("Both movies have the same rating.");
        }
        
        // =====================================
        // 10. Create Movie array
        // =====================================
        
        Movie[] movies = {
                movie1,
                movie2,
                new Movie(
                        "M003",
                        "The Dark Knight",
                        "Action",
                        9.0,
                        152,
                        true
                )
        };
        
        // =====================================
        // 11. Find highly rated movie
        // =====================================
        
        System.out.println("\nHighly Rated Movie:");
        
        Movie highlyRatedMovie =
                findHighlyRatedMovie(movies);
        
        if (highlyRatedMovie != null) {
            
            System.out.println(
                    highlyRatedMovie.getTitle() +
                            " - Rating: " +
                            highlyRatedMovie.getRating()
            );
            
        } else {
            
            System.out.println(
                    "No highly rated movie found."
            );
        }
        
        // =====================================
        // 12. Test invalid rating
        // =====================================
        
        System.out.println("\nTesting invalid rating:");
        
        movie1.setRating(15);
        
        // =====================================
        // 13. Test invalid duration
        // =====================================
        
        System.out.println("\nTesting invalid duration:");
        
        movie2.setDuration(-50);
    }
    
    // =========================================
    // Compare ratings of two movies
    // =========================================
    
    public static Movie compareRatings(
            Movie movie1,
            Movie movie2) {
        
        if (movie1.getRating() > movie2.getRating()) {
            
            return movie1;
            
        } else if (movie2.getRating() > movie1.getRating()) {
            
            return movie2;
            
        } else {
            
            return null;
        }
    }
    
    // =========================================
    // Find first highly rated movie
    // =========================================
    
    public static Movie findHighlyRatedMovie(
            Movie[] movies) {
        
        for (Movie movie : movies) {
            
            if (movie.getRating() >= 8.0) {
                return movie;
            }
        }
        
        return null;
    }
}
