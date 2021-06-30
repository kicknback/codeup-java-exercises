import java.util.Scanner;
import java.util.Random;

public class MethodsExercises {
    public static void main(String[] args) {

//        System.out.println(Addition(34, 89));
//        System.out.println(Subtraction(30997, 3405));
//        System.out.println(Multiplication(25, 5, 0));
//        System.out.println(Division(803497, 473));
//        System.out.println(Modulus(209, 14));
//
//        System.out.println(Division(307, 0));

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number between 5 and 30: ");
//        getInteger(5, 30, sc);


//        calcFactorial();


            rollDice();




    }

    public static int Addition(int num1, int num2) {
        return num1 + num2;
    }
    public static int Subtraction(int num1, int num2) {
        return num1 - num2;
    }
    public static int Multiplication(int num1, int num2, int total) {
        // Normal
//        return num1 * num2;

        // Loop method
//        int total = 0;
//        for (int i = 0; i < num1; i++) {
//            total += num2;
//        }
//        return total;

        // Recursion method
        if (num1 > 0) {
            total += num2;
            num1--;
            return Multiplication(num1, num2, total);
        }

        return total;
    }
    public static int Division(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            System.out.println("Cannot divide by zero");
            return 0;
        } else {
            return num1 / num2;
        }
    }
    public static int Modulus(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            System.out.println("Cannot divide by zero");
            return 0;
        } else {
            return num1 % num2;
        }
    }
    // -------------------------------

    public static int getInteger(int min, int max, Scanner sc) {
        int input = sc.nextInt();

        if (input < min || input > max) {
            System.out.println("That input is out of range");
            System.out.printf("Enter a number between %s and %s: ", min, max);
            return getInteger(min, max, sc);
        }
        System.out.println("That number is within specs.");
        return input;
    }
    // -------------------------------

    public static void calcFactorial() {
        Scanner sc = new Scanner(System.in);
        boolean keepGoing = true;
        boolean exitProgram = false;


        while (keepGoing) {
            while (true) {
                System.out.println("Enter a number from 1 to 15 to calculate the factorial: ");
                if (sc.hasNextInt()) {
                    int input = sc.nextInt();
                    if (input < 1 || input > 15) {
                        System.out.println("Please provide a number within the required range.");
                    } else {
                        int total = 1;
                        for (int i = 1; i <= input; i++) {
                            total *= i;
                        }
                        System.out.println("\n" + total);
                        break;
                    }
                } else {
                    System.out.println("Please provide a number input");
                    sc.next();
                    break;
                }
            }

            while (!exitProgram) {
                System.out.println("Would you like to continue calculating factorials?(y/n) ");
                String moreFacs = sc.next();
                if (moreFacs.equalsIgnoreCase("y")) {
                    break;
                } else if (moreFacs.equalsIgnoreCase("n")) {
                    exitProgram = true;
                } else {
                    System.out.println("That is not a valid input\n");
                }
            }
            if (exitProgram) {
                System.out.println("Exiting program...");
                keepGoing = false;
            }
        }

    }
    // -------------------------------

    public static void rollDice() {
        Scanner sc = new Scanner(System.in);
        boolean keepGoing = true;
        boolean exitProgram = false;
        System.out.println("\nWelcome... to back alley dice!  Start rollin..\n");

        while (keepGoing) {
            while (true) {
                System.out.println("\nPick how many sides ya want: ");
                if (sc.hasNextInt()) {
                    int input = sc.nextInt();
                    System.out.println("\nNow roll em...");
                    sc.nextLine();
                    sc.nextLine();
                    Random roll = new Random();
                    int roll1 = roll.nextInt((input + 1) - 1) + 1;
                    int roll2 = roll.nextInt((input + 1) - 1) + 1;
                    System.out.printf("...You got %s, and %s ...\n\n", roll1, roll2);
                    break;
                } else {
                    System.out.println("I don't know what that was...");
                    sc.next();
                }
            }

            while (!exitProgram) {
                System.out.println("Still rollin?...  (y/n) ");
                String moreDice = sc.next();
                if (moreDice.equalsIgnoreCase("y")) {
                    break;
                } else if (moreDice.equalsIgnoreCase("n")) {
                    exitProgram = true;
                } else {
                    System.out.println("\nuhh??\n");
                }
            }
            if (exitProgram) {
                System.out.println("\nYou'll be back...");
                keepGoing = false;
            }
        }
    }

}
