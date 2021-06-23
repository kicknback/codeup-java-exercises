import java.util.Scanner;

public class FlowControl {
    public static void main(String[] args) {

        // TODO: create three unique usernames (user1, user2, user3).
        //  create a fourth user and set it equal to user input. (ask
        //  the user to enter a username). if the username has already
        //  been used by user1, user2, or user3, print "sorry this
        //  username already exists.
        Scanner sc = new Scanner(System.in);

        String user1 = "Bobber";
        String user2 = "Jimmer";
        String user3 = "Timma";
        String noti = "Sorry, this username already exists.";
        System.out.println("Enter a user name: ");
        String userInput = sc.next();

        switch (userInput) {
            case "Bobber":
                System.out.print(noti);
                break;
            case "Jimmer":
                System.out.print(noti);
                break;
            case "Timma":
                System.out.print(noti);
                break;
            default:
                System.out.println("That username is available.. would you like to select it?");
        }

    }
}
