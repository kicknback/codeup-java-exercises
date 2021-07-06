package shapes;

abstract class Quadrilateral implements Shape {
    protected int length;
    protected int width;

    public Quadrilateral(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Quadrilateral() {
    }

    int getLength() {
        return length;
    }

    abstract void setLength(int length);

    int getWidth() {
        return width;
    }

    abstract void setWidth(int width);

}
