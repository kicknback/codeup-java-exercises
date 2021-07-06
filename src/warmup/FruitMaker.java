package warmup;

public class FruitMaker {
    public static void main(String[] args) {

        Kiwi kiwi = new Kiwi();
        kiwi.count = 46;
        kiwi.name = "kiwi fruit";
        kiwi.shape = "oval";
        kiwi.size = "small";

        System.out.println(kiwi.printer());
        System.out.println(kiwi.describe());

    }
}
