import java.util.Scanner;

public class StringsLecture {
    public static void main(String[] args) {

        //        warmup:
        //        TODO: create a new "Strings-Lecture" java class file (or wherever
        //         you like to keep notes/lecture exercises. Copy given
        //         code, that is your starting point. Using Scanner prompt a
        //         user (in this case it's you, you're the user) to type in
        //         their first name. Save the input into a String variable. If
        //         your name matches randomName, print "woah! you guessed:
        //         enter-randomName-here! How did you know enter-yourName-here
        //         is my name?!". if randomName does
        //         not
        //         match your name exactly, print "Way off my friend! My name
        //         isn't randomName-here. It's yourName-here.".

        Scanner sc = new Scanner(System.in);
//
//        String[] studentsArr =
//                {"Amado", "Christian", "Christopher", "Corey", "Demetrio",
//                        "Diamond", "Erik", "Grady", "Jesse", "Joshua",
//                        "Juan", "Mitchell", "Moses", "Nathan", "Prachi",
//                        "Raul", "Ricardo", "Richard", "Robert", "Sam",
//                        "Sean", "Stephen", "Tiffanny", "Wagner", "Laura",
//                        "Casey", "Dorian", "Tristan", "Jordy"};
//        int randomNum = (int) (Math.random() * 28);
//        String randomName = studentsArr[randomNum];
//
//        System.out.println("What is the name you would like to guess? ");
//        String userInput = sc.next();
//        if (userInput.equalsIgnoreCase(randomName)) {
//            System.out.printf("Woah! you guessed: %s!  How did you know %s is my name?!", userInput, randomName);
//        } else {
//            System.out.printf("Way off my friend!  My name isn't %s.  It's %s", userInput, randomName);
//        }

        //        TODO: create a String variable that holds this sentence: "Red
        //         Orange Blue Yellow Green Purple". Prompt the user to type in
        //         their favorite color, if their fave color is the same as the
        //         first word in the String, then print out "my fave color:
        //         userColor is the first one". If their fave color is last, then print out "my fave color: userColor is last"

        String colors = "Red Orange Blue Yellow Green Purple";
        System.out.println("What is your favorite color? ");
        String uInput = sc.next();
        if (colors.toLowerCase().startsWith(uInput.toLowerCase())) {
            System.out.printf("My fave color: %s is the first one", uInput);
        } else if (colors.toLowerCase().endsWith(uInput.toLowerCase())) {
            System.out.printf("My fave color: %s is the last one", uInput);
        } else {
            System.out.println("That color isn't first or last.");
        }


    }
}
