import java.util.Scanner;

public class MethodLecture {


    public static void main(String[] args) {

        //    TODO: create a new method that accepts the name of a basketball
        //     team (ex: the spurs) and returns a String that says
        //     "[basketballTeam] is the best team.". Invoke that method within
        //     your main method (remember to pass in the name of the basketball
        //     team). print out the result of the new method.

        System.out.println(bTeam("Spurs"));


        //    TODO: create a new method that accepts the string created from the
        //     first method and returns the number of characters in that string.

        System.out.println(charNum(bTeam("Spurs")));

        //    TODO: invoke a method that accepts (and returns) the following:
        //        - accepts: your first name and your last name. returns: A
        //        string that reads: "Hello Laura Ruiz-Roehrs (replace with your
        //        first and last)";

        System.out.println(greeting("Josh", "Borreli"));

        //    WARMUP
        //    TODO: prompt a user to tell us about themselves (age, name, if
        //     they have any pets (true/false). Using method overloading, create
        //     methods that will return the first fact they told us about
        //     themselves. ex: I can input: 18 -- Laura -- false in which case I
        //     expect you to return: 18. but if I tell you my name first: Laura --
        //     false -- 18. I expect you to return "Laura" ... etc.
        Scanner sc = new Scanner(System.in);
        System.out.println("Tell us about yourself: ");
        System.out.println(info(sc.next()));


    }

    public static String bTeam(String team) {
        return String.format("%s is the best team.", team);
    }

    public static int charNum(String input) {
        return input.length();
    }

    public static String greeting(String fName, String lName) {
        return String.format("Hello, %s %s.", fName, lName);
    }

    // ------------------
    public static String info(String name) {
        return String.format("Your name is %s", name);
    }
    public static int info(int age) {
        return age;
    }
    public static boolean info(boolean anyPets) {
        return anyPets;
    }

}
