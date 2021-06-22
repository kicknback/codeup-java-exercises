import java.util.Scanner;

public class ConsoleIO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your first name?: ");
        String firstName = scanner.next();
        String lastName = scanner.next();
        System.out.printf("You entered: %s\n", firstName);
        System.out.printf("Your last name is: %s\n", lastName);

//        String myName = "Josh";
//        String item = "code";
//        String language = "java";
//
//        System.out.printf("My name is %s, and I like to %s %s and party.", myName, item, language);


//        int currencyInPennies = 1000;
//        System.out.printf("I'll sell you swamp land for $%.2f per acre", currencyInPennies / 100.00);



    }
}
