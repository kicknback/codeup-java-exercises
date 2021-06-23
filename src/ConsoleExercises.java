import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi = 3.14159;
        sc.useDelimiter("\n");

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

//        System.out.print("Enter a sentence, por favor: ");
//
//        String sentence = sc.nextLine();
//        System.out.printf("You entered the following sentence: \n\t%s", sentence);

//        System.out.println("Enter room dimensions to calculate area and perimeter: ");
//        int length = Integer.parseInt(sc.next());
//        int width = Integer.parseInt(sc.next());
//        int area = length * width;
//        int perimeter = (length * 2) + (width * 2);
//        System.out.printf("The area of your input is %s, while the perimeter is %s.", area, perimeter);


        System.out.println("Enter room dimensions to calculate area and perimeter: ");

        double length = Double.parseDouble(sc.next());
        double width = Double.parseDouble(sc.next());
        double height = Double.parseDouble((sc.next()));
        double area = length * width;
        double perimeter = (length * 2) + (width * 2);
        double volume = length * width * height;

        System.out.printf("The area of your input is %.3f, while the perimeter is %.3f.\nAlso, the volume is %.3f", area, perimeter, volume);



    }
}
