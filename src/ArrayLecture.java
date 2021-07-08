import java.util.Arrays;
import java.util.Scanner;

public class ArrayLecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int[] intArray = getIntArray();
//        intArray = Arrays.stream(intArray).map(i -> i * 2).toArray();

//    System.out.println(Arrays.toString(intArray));
//        System.out.println("How many names do you have?: ");
//        int nameCount = sc.hasNextInt() ? sc.nextInt() : 1;
//        System.out.println(getFullName(nameCount, sc));

//        String[] someNames = getFullName(nameCount, sc);
//        String[] moreNames = Arrays.copyOf(someNames, someNames.length);

//        System.out.println(Arrays.toString(moreNames));
//        System.out.println(Arrays.equals(someNames, moreNames));


        int[] intArr = getIntArray();
        Arrays.sort(intArr);

        System.out.println(Arrays.toString(intArr));
    }


    public static int[] getIntArray() {
        return new int[]{3, 2, 1};
    }

    public static int[] getIntArray(int length) {
        int[] intArray = new int[length];
        for (int i = 0; i < length; i++) {
            intArray[i] = i * 2;
        }
        return intArray;
    }

    public static String[] getFullName(int names, Scanner sc) {
        String[] fullName = new String[names];
        for (int i = 0; i < names; i++) {
            System.out.println("\nEnter name: ");
            fullName[i] = sc.next();
        }
//        return "\n" + Arrays.toString(fullName);
        return  fullName;
    }

}
