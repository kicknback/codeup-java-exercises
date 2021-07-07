package shapes;

public class Square extends Quadrilateral {

//    private double side;
//
//    public Square(double side) {
//        this.side = side;
//        this.length = side;
//        this.width = side;
//    }
//
//    public double getPerimeter() {
//        return 4 * side;
//    }
//    public double getArea() {
//        return side * side;
//    }
// -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-

//    private double side;

    public Square(double side) {
        super(side, side);
    }

    public double getSide() {
        return length;
    }

//    public void setSide(double side) {
//        this.side = side;
//    }




    @Override
    public double getPerimeter() {
        return length * 4;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    void setLength(double side) {
        super.length = super.width = side;
    }

    @Override
    void setWidth(double side) {
        super.width = super.length = side;
    }
}
