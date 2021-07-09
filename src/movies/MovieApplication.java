package movies;
import util.Input;

public class MovieApplication {

    public static void main(String[] args) {

        boolean showMoreMovies = true;
        Movie[] allMovies = MoviesArray.findAll();

        while (showMoreMovies) {
            System.out.println("\nWhat would you like to do?\n\n" +
                    "0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the sci-fi category\n" +
                    "6 - view movies in the musical category\n" +
                    "7 - view movies in the comedy category\n"
            );

            Input userInput = new Input();

            switch (userInput.getInt(0, 7)) {
                case 0:
                    System.out.println("\nExiting movie program...");
                    break;
                case 1:
                    MoviesArray.getMoviesByCategory(allMovies, "all");
                    break;
                case 2:
                    MoviesArray.getMoviesByCategory(allMovies, "animated");
                    break;
                case 3:
                    MoviesArray.getMoviesByCategory(allMovies, "drama");
                    break;
                case 4:
                    MoviesArray.getMoviesByCategory(allMovies, "horror");
                    break;
                case 5:
                    MoviesArray.getMoviesByCategory(allMovies, "sci-fi");
                    break;
                case 6:
                    MoviesArray.getMoviesByCategory(allMovies, "musical");
                    break;
                case 7:
                    MoviesArray.getMoviesByCategory(allMovies, "comedy");
                default:
                    break;
            }

            boolean keepGoing = userInput.yesNo();
            if (!keepGoing) {
                showMoreMovies = false;
            }

        }



    }
}
