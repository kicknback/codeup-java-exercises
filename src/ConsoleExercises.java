import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi = 3.14159;


//        System.out.printf("The value of pi is approximately %.2f.", pi);
//
//        System.out.format("The value of pi is approximately %.2f.", pi);
//
//        System.out.print("Enter an integer: ");
//        int userNum = sc.nextInt();


//        System.out.print("Please enter 3 words: ");
//        String first = sc.next();
//        String second = sc.next();
//        String third = sc.next();
//
//        System.out.printf("You entered the following 3 words:\n%s\n%s\n%s", first, second, third);

        System.out.print("Enter a sentence, por favor: ");

        String sentence = sc.nextLine();
        System.out.printf("You entered the following sentence: \n\t%s", sentence);


    }
}
