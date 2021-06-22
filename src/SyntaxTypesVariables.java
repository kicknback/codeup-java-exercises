public class SyntaxTypesVariables {
    public static void main(String[] args) {

        byte byt = 127;
        System.out.println(byt + 1);
        short myFirstNumber = 32767;
        float myFirstFloat = 32.12f;
        double myFirstDouble = 32.01097340;

        System.out.println("Hello, my name is Casey.");

        String myName = "Josh";
        System.out.println(myName.length());

        var isNiceDay = true;
        if (isNiceDay) {
            System.out.println("What a nice day");
        } else {
            System.out.println("I don't like it..");
        }

    }
}
