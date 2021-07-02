package shapes;

public class Square extends Rectangle {

    private int side;

    public Square(int side) {
        this.side = side;
        this.length = side;
        this.width = side;
    }

    public int getPerimeter() {
        return 4 * side;
    }
    public int getArea() {
        return side * side;
    }

}
