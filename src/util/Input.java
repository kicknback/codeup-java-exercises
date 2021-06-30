package util;

import java.util.Scanner;

public class Input {
//    private String scanner;
    private final Scanner scanner = new Scanner(System.in);

    public String getString() {
        System.out.println("Enter a string: ");
        return scanner.hasNext() ? scanner.next() : "That is not a proper string.";
    }
    public boolean yesNo() {
        System.out.println("Enter a form of yes to be true... ");
        String input = scanner.next();
        return input.equalsIgnoreCase("y|yes");
    }
    public void getInt(int min, int max) {
        System.out.printf("Enter a value between the range of %s and %s", min, max);
        while (true) {
            if (scanner.hasNextInt()) {
                int intValue = scanner.nextInt();
                if (intValue < min || intValue > max) {
                    System.out.println("That value is not within specs..");
                } else {
                    System.out.println("Number entered is acceptable.");
                    break;
                }
            } else {
                System.out.println("Please enter a valid number.. ");
            }
        }
    }


}
