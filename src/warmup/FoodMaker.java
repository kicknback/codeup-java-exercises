package warmup;

public class FoodMaker {
    public static void main(String[] args) {

        Fruit fruit = new Fruit();
        fruit.count = 46;
        fruit.name = "kiwi";
        fruit.shape = "oval";
        fruit.size = "small";

        System.out.println(fruit.printer());
        System.out.println(fruit.describe());

    }
}
