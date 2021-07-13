public class Colors {
    public static void main(String[] args) {

        Red red = new Red();
        Orange orange = new Orange();

        red.show();
        orange.show();

    }



}
class Red {
    public void show() {
        System.out.println("I am red");
    }
}
class Orange extends Red {
    @Override
    public void show() {
        System.out.println("I am orange");
    }
}