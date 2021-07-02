package shapes;

public class Rectangle {

    protected int length;
    protected int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    public Rectangle() {}

    public int getPerimeter() {
        return (length * 2) + (width * 2);
    }
    public int getArea() {
        return length * width;
    }

}
