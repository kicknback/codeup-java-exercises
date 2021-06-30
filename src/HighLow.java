import java.util.*;

public class HighLow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random randomNum = new Random();

        byte guesses = 0;
        int numToGuess = randomNum.nextInt(101 - 1) + 1;

        System.out.println("\nWelcome to the High Low!\n\nTry to correctly guess a number " +
                "between 1 and 100 in as few guesses as possible." +
                "\nBut watch out! You gotta get it done within 10 guesses, or you're outta here!" +
                "\n-- Enter 'q' to quit --");
        System.out.println("\nNow enter your first guess... ");

        while (true) {
            if (sc.hasNextInt()) {
                int userGuess = sc.nextInt();
                if (guesses == 10) {
                    System.out.println("\n) ; .... Pack it up Jack, cause you ain't numerically inclined.." +
                            "\nCome back when you can get guessin..");
                    break;
                }
                if (userGuess < 1 || userGuess > 100) {
                    System.out.println("\nThat number isn't even between 100 and 1! Do it again...");
                    guesses++;
                } else if (userGuess < numToGuess) {
                    System.out.println("\nHIGHER");
                    guesses++;
                } else if (userGuess > numToGuess) {
                    System.out.println("LOWER");
                    guesses++;
                } else {
                    System.out.printf("\n%s!! AWESOME!! YOU GUESSED THE NUMBER RIGHT, FINALLY!" +
                            "\nAnd it only took you %s guesses." +
                            "\nSee you next time..... on the High Low\n\n", numToGuess, guesses);
                    break;
                }
            } else if (sc.next().equalsIgnoreCase("q")) {
                System.out.println("\nAlright then, we'll see you next time...");
                break;
            } else {
                System.out.println("\nThat input isn't valid.  Please enter a guess.");
            }
        }

    }
}
