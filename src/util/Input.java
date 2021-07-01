package util;

import java.util.Scanner;

public class Input {
//    private String scanner;
    private final Scanner scanner = new Scanner(System.in);

    public String getString() {
        System.out.println("Enter a string: ");
        return scanner.next();
//        return scanner.hasNext() ? scanner.next() : "That is not a proper string.";
    }
    public boolean yesNo() {
        System.out.println("Would you like to continue? ");
        String input = scanner.next();
        return input.matches("(?i)y|yes|yea|yeah|ya|yep");
    }
    // why can't I have-- public void getInt(min, max) AND public int getInt()??
    public int getInt(int min, int max) {
        System.out.printf("Enter a value between the range of %s and %s", min, max);
        while (true) {
            if (scanner.hasNextInt()) {
                int intValue = scanner.nextInt();
                if (intValue < min || intValue > max) {
                    System.out.println("That value is not within specs..");
                } else {
                    System.out.println("Number entered is acceptable.");
                    return intValue;
                }
            } else {
                System.out.println("Please enter a valid number.. ");
            }
        }
    }
    public int getInt() {
        System.out.println("Enter an integer: ");
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("Please enter a valid number.. ");
            return 0;
        }
    }
    public double getDouble(double min, double max) {
        System.out.printf("Enter a value between the range of %s and %s\n", min, max);
        while (true) {
            if (scanner.hasNextDouble()) {
                double dubValue = scanner.nextDouble();
                if (dubValue < min || dubValue > max) {
                    System.out.println("That value is not within specs..");
                } else {
                    System.out.println("Number entered is acceptable.");
                    break;
                }
            } else {
                System.out.println("Please enter a valid number.. ");
            }
        }
        return 0;
    }
    public double getDouble() {
        System.out.println("Enter a number: ");
        if (scanner.hasNextDouble()) {
            return scanner.nextDouble();
        } else {
            System.out.println("Please enter a valid number.. ");
            return 0;
        }
    }


}