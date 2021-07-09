package movies;
import util.Input;

public class MovieApplication {

    public static void main(String[] args) {

        Movie[] allMovies = MoviesArray.findAll();

        System.out.println("\nWhat would you like to do?\n\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the sci-fi category\n"
                            );

        Input userInput = new Input();
        System.out.println(userInput.getInt(0, 5));

    }
}
