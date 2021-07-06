package shapes;

public class ShapesTest {
    public static void main(String[] args) {

//        Rectangle box1 = new Rectangle(5, 4);
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());
//
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());
// -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-



        // Why do we declare a variable of the type Shape named myShape?
        // Shape myShape;
        Rectangle myShape;

        myShape = new Rectangle(47, 20);
//        myShape = new Square(53);
        Square mySquare = new Square(78);


        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());


//        myShape.setLength(65);
//        System.out.println(myShape.getLength());


    }
}
