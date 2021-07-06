package shapes;

public class Rectangle extends Quadrilateral implements Shape {

//    protected int length;
//    protected int width;
//
//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//    public Rectangle() {}
//
//    public int getPerimeter() {
//        return (length * 2) + (width * 2);
//    }
//    public int getArea() {
//        return length * width;
//    }
// -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-


    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return (length * 2) + (width * 2);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    void setLength(int length) {
        this.length = length;
    }

    @Override
    void setWidth(int width) {
        this.width = width;
    }
}
