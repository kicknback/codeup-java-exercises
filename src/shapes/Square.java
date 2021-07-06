package shapes;

public class Square extends Quadrilateral implements Shape {

//    private int side;
//
//    public Square(int side) {
//        this.side = side;
//        this.length = side;
//        this.width = side;
//    }
//
//    public int getPerimeter() {
//        return 4 * side;
//    }
//    public int getArea() {
//        return side * side;
//    }
// -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-

    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }




    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    void setLength(int side) {
        length = side;
    }

    @Override
    void setWidth(int side) {
        width = side;
    }
}
