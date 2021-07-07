package warmup;

public class WarmupClass {
    public static void main(String[] args) {

        String blah = "vonwEWSGdHoihg";

        System.out.println(capitalLetters(blah));

    }

    public static int capitalLetters(String inputStr) {
        int capCount = 0;
        char[] chars = inputStr.toCharArray();
        for (char ch : chars) {
            if (Character.isUpperCase(ch)) {
                capCount++;
            }
        }
        return capCount;
    }

}
