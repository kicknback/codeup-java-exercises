package warmup;

import java.util.Scanner;

public class Calculator {


    public static void calc(Scanner scanner) {

        int firstNum;
        int secondNum;

        System.out.println("\nEnter first whole number: ");
        if (scanner.hasNextInt()) {
            firstNum = scanner.nextInt();
        } else {
            System.out.println("\nPlease enter a valid number...");
        }



        System.out.println("\nEnter your operation: (+, -, *, /) ");
        String op = scanner.next();
//        String[] operators = {"+", "-", "*", "/"};

        System.out.println("\nEnter second whole number: ");
        secondNum = scanner.nextInt();


        switch (op) {
            case "+":
                System.out.println(firstNum + secondNum);
                break;
            case "-":
                System.out.println(firstNum - secondNum);
                break;
            case "*":
                System.out.println(firstNum * secondNum);
                break;
            case "/":
                System.out.println(firstNum / secondNum);
                break;
            default:
                System.out.println("\nPlease enter valid operator...");
//                op = scanner.next();
                break;
        }

        System.out.println("\nWould you like to continue calculating? (y/n)");
        String userIn = scanner.next();

        if (userIn.equalsIgnoreCase("n")) {
            return;
        } else if (userIn.equalsIgnoreCase("y")) {
            calc(scanner);
        }

    }

//    public static void calc() {
//
//
//        System.out.println("");
//    }

}
