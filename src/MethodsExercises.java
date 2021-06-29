public class MethodsExercises {
    public static void main(String[] args) {

        System.out.println(Addition(34, 89));
        System.out.println(Subtraction(30997, 3405));
        System.out.println(Multiplication(89, 123));
        System.out.println(Division(803497, 473));
        System.out.println(Modulus(209, 14));

        System.out.println(Division(307, 0));

    }

    public static int Addition(int num1, int num2) {
        return num1 + num2;
    }
    public static int Subtraction(int num1, int num2) {
        return num1 - num2;
    }
    public static int Multiplication(int num1, int num2) {
        return num1 * num2;
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

}
