import java.util.Scanner;

public class ConsoleIO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("What is your first name?: ");
//        String firstName = scanner.next();
//        String lastName = scanner.next();
//        System.out.printf("You entered: %s\n", firstName);
//        System.out.printf("Your last name is: %s\n", lastName);

//        String myName = "Josh";
//        String item = "code";
//        String language = "java";
//
//        System.out.printf("My name is %s, and I like to %s %s and party.", myName, item, language);


//        int currencyInPennies = 1000;
//        System.out.printf("I'll sell you swamp land for $%.2f per acre", currencyInPennies / 100.00);

        /* TODO: use the scanner to take in the name of the month you were born and print it back out
            - remember to first prompt the user for the input
        */


//        System.out.println("Enter the month you were born: ");
//        String month = scanner.next();
//        System.out.printf("You were born in %s\n", month);

//        System.out.print("Enter a number: ");
//        int myNum = scanner.nextInt();
//        System.out.println(myNum);


//        System.out.println("Enter some text: ");
//        String myString = scanner.nextLine();
//        System.out.printf("You entered: \n%s", myString);

//        boolean hasNl = scanner.hasNext();
//
//        while (hasNl) {
//            String word = scanner.next();
//            System.out.println(word);
//        }

        System.out.println("Please enter a number: ");
        int num = scanner.nextInt();
        System.out.printf("Your number was: %s", num);



    }
}
