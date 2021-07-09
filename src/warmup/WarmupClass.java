package warmup;
import util.Input;

import java.util.Arrays;

public class WarmupClass {
    public static void main(String[] args) {

        String blah = "vonwEWSGdHoihg";

//        System.out.println(capitalLetters(blah));

        System.out.println(Arrays.toString(favoriteVacaySpots()));

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


}
