package util;

import java.util.Scanner;

public class Input {

    private final Scanner scanner = new Scanner(System.in);

    // Can add custom message
    public String getString(String soutValue) {
        System.out.printf("\n%s: ", soutValue);
        return scanner.nextLine();
    }

    public String getString() {
        System.out.println("\nEnter a value: ");
        return scanner.nextLine();
    }

    public boolean yesNo() {
        boolean exit = false;
        while (true) {
            System.out.println("\nWould you like to continue? ");
            String input = scanner.next();
            if (input.matches("(?i)y|yes|yea|yeah|ya|yep")) {
                exit = true;
                break;
            } else if (input.matches("(?i)n|no|nah|na|nope|notta")) {
                "".isEmpty();
                break;
            } else {
                System.out.println("\nNot a valid response...\n");
            }
        }
        return exit;
    }

    // Can add custom question
    public boolean yesNo(String soutValue) {
        boolean exit = false;
        while (true) {
            System.out.printf("\n%s ", soutValue);
            String input = "";
            input = scanner.next();
            if (input.matches("(?i)y|yes|yea|yeah|ya|yep")) {
                exit = true;
                break;
            } else if (input.matches("(?i)n|no|nah|na|nope|notta")) {
                "".isEmpty();
                break;
            } else {
                System.out.println("\nNot a valid response...\n");
            }
        }
        return exit;
    }

    // why can't I have-- public void getInt(min, max) AND public int getInt()??
    public int getInt(int min, int max) {
        System.out.printf("Enter a value between the range of %s and %s\n", min, max);
        while (true) {
            if (scanner.hasNextInt()) {
                int intValue = scanner.nextInt();
                if (intValue < min || intValue > max) {
                    System.out.printf("\nThat number isn't between %s and %s..\n", min, max);
                    scanner.nextLine();
                } else {
                    return intValue;
                }
            } else {
                System.out.println("Please enter a valid number.. \n");
                scanner.nextLine();
            }
        }
    }

//    public int getInt() {
//        System.out.println("Enter choice: ");
//        if (scanner.hasNextInt()) {
//            return scanner.nextInt();
//        } else {
//            System.out.println("Please enter a valid number.. ");
//            getInt();
//        }
//        return 0;
//    }

    // modified with exceptions
    public int getInt() {
        while (true) {
            int num = 0;
            try {
                num = Integer.valueOf(getString());
                return num;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number..");
            }
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

//    public double getDouble() {
//        System.out.println("Enter a number: ");
//        if (scanner.hasNextDouble()) {
//            return scanner.nextDouble();
//        } else {
//            System.out.println("Please enter a valid number.. ");
//            return 0;
//        }
//    }

    // modified with exceptions
    public double getDouble() {
        while (true) {
            double num = 0;
            try {
                num = Double.valueOf(getString());
                return num;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number..");
            }
        }
    }


}
