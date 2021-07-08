import java.util.Random;

public class ServerNameGenerator {

    private static String[] adjectives = {"greasy", "sharp", "beautiful", "smelly", "charming", "trifflin", "cool", "perfect", "punctual", "tasty"};

    private static String[] nouns = {"person", "money", "seed", "man", "woman", "card", "bottle", "office", "table", "computer"};

    public static String getRandomName(String[] inputArr) {
        Random randomNum = new Random();
        int idx = randomNum.nextInt(inputArr.length);

        return inputArr[idx];
    }

    public static void main(String[] args) {

        System.out.printf("Here is your server name:\n%s-%s%n",getRandomName(adjectives), getRandomName(nouns));

    }

}
