package warmup;
import util.Input;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class WarmupClass {
    public static void main(String[] args) {

        String blah = "vonwEWSGdHoihg";

//        System.out.println(capitalLetters(blah));

//        System.out.println(Arrays.toString(favoriteVacaySpots()));

//        System.out.println(Arrays.toString(splitter("blah blah and blah")));

        String str = "Oberon is the best cohort ever!";
        randStr(str);

    }

    public static int capitalLetters(String inputStr) {
        int capCount = 0;
        char[] chars = inputStr.toCharArray();
        for (char ch : chars) {
            if (Character.isUpperCase(ch)) {
                capCount++;
            }
        }
        return capCount;
    }


    // TODO: Create a method which will return a String[] containing the user's favorite vacation spots
    //  -> Each time the user inputs a new vacation spot, reset the array to be one element longer in length
    //  -> Then, add the old elements
    //  -> Finally, add the new element
    //  -> When the user decides to finish inputting spots, return the String[].
    //  -> sout out the returned value!


    public static String[] favoriteVacaySpots() {
        Input userInput = new Input();
        StringBuilder vacaySpots = new StringBuilder();
        System.out.println("\nSo I hear you like to not work for small periods of time once in a while..\n" +
                "What are your favorite spots?  Keep entering them.. and when you're done, enter 'q'.");
        while (true) {
            String place = userInput.getString();
            if (place.equalsIgnoreCase("q")) {
                break;
            } else {
                vacaySpots.append(place + ",");
            }
        }
        return vacaySpots.toString().split(",");
    }

//    warmup: write a method that accepts a string and returns a String array that splits at the spaces
//    - you can write this within any main method

    public static String[] splitter(String str) {
        return str.split(" ");
    }


    // WARM UP
    // TODO Given this string: `String str = "Oberon is the
    //  best cohort ever!"`, print out the character from that
    //  string using a random number generator, that generates
    //  a number between 0 and 50. Using a try/catch block, handle
    //  any errors (Exceptions) that may occur by printing out the
    //  message.

    public static void randStr(String str) {
        Random rand = new Random();
        int randNum = rand.nextInt(50 + 1);
//        String[] strArr = str.split("");
        System.out.println(randNum);
        try {
            System.out.printf("'%s'", str.charAt(randNum));
        } catch (Exception e) {
            System.out.println(e);
        }

    }

//    Write a method named getTwentyPrimes() that returns a string containing the first 20 prime
//    numbers, each separated by a comma. Output: "1, 2, 3, 5, 7, 11, 13, 17, 19"...
//    until we have a total count of 20 primes in the string.

    // public static boolean isPrime;
    //
    // public static String getTwentyPrimes() {
    //     int num = 100;
    //     List<Integer> primeList = new ArrayList<Integer>();
    //
    //     for (int i = 1; i <= num; i++) {
    //         for (int j = 1; j <= i; j++) {
    //             if (j % 1 == 0) {
    //
    //             }
    //         }
    //     }
    // }

}
