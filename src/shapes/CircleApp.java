package shapes;

import util.Input;

public class CircleApp {
    private static short circles;
    public static void notifier() {
        circles++;
        System.out.printf("You have entered %s circle(s).\n\n", circles);
    }

    public static void main(String[] args) {
        Input userInput = new Input();
        while (true) {
            if (userInput.yesNo()) {
                double userRadius = userInput.getDouble();
                Circle newCircle = new Circle(userRadius);
                System.out.printf("\nThe area of a circle with a radius of %s, is -- %.3f.",userRadius, newCircle.getArea());
                System.out.printf("\nAnd the circumference of said circle is -- %.3f\n", newCircle.getCircumference());
                notifier();
            } else {
                System.out.println("Exiting circle program...");
                break;
            }
        }
    }
}
