package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        // this is a constructor in Rectangle
        Rectangle box1 = new Rectangle(4,5);
        System.out.println("I am a Rectangle Area " + box1.getArea());
        System.out.println("I am a Rectangle Perimeter " + box1.getPerimeter());
        //Parent         new instance made it into a rectangle object
        Rectangle box2 = new Square(5);
        System.out.println("I am a Rectangle Area " + box2.getArea());
        System.out.println(box2.getPerimeter());

        Square box3 = (Square) box2;
        System.out.println("I am a square " + box3.getArea());
        System.out.println(box3.getPerimeter());

    }
}
