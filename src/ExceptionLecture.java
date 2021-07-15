import java.util.Scanner;

public class ExceptionLecture {

//    Let’s say that you’re writing a program that checks whether or not a user is eligible to open up a new bank account.
//    The requirements are that they have to be older than 16 years old and have at least $200 to start their bank account.
//    Write a method that will return a string that states whether they’re eligible to bank at Banco di Laura or whether
//    they are not eligible, make sure to  throw an `NumberFormatException` if the user inputs anything that’s not a
//    number(none, zero, zilch, nada, etc).

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your age?: ");
        String age = sc.next();
        System.out.println("And how much mulah do you have?: ");
        String money = sc.next();

        System.out.println(eligibility(age, money));

    }

    public static String eligibility(String age, String money) {
        String returnString = "";
        try {
            if (Integer.parseInt(age) < 17 || Integer.parseInt(money) < 200) {
                returnString = "Lo siento, no Banco di Laura para tu";
            } else returnString = "Bienvenidos!";

        } catch (Exception e) {
            System.out.println(e);
        }
        return returnString;
    }


    // adding padding to test zsh function

}
