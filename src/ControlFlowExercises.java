import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        int i = 5;
//
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }

//        short num = 0;
//
//        do {
//            System.out.println(num);
//            num += 2;
//        } while (num <= 100);

//        short num = 100;
//
//        do {
//            System.out.println(num);
//            num -= 5;
//        } while (num >= -10);


//        This is somehow giving me an infinite loop
//        int i = 2;
//
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i < 1000000);

        //-- For loop version of previous 2 exercises.

//        for (byte i = 5; i <= 15; i++) {
//            System.out.println(i);
//        }

//        for (byte i = 0; i <= 100; i += 2) {
//            System.out.println(i);
//        }

//        for (short num = 100; num >= -10; num -= 5) {
//            System.out.println(num);
//        }

        //This is also giving me an infinite loop
//        for (int i = 2; i < 1000000; i*=i) {
//            System.out.println(i);
//        }


//        for (byte i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("Fizz Buzz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("What number would you like to go up to? ");

        short userInput = Short.parseShort(sc.next());
        System.out.println("\nHere is your table!\n");
        System.out.println("number | squared | cubed\n------ | ------- | ------");
        for (short i = 1; i <= userInput; i++) {
            System.out.printf("%s      | %s       | %s\n", i, i * i, i * i * i);
        }
    }
}
















