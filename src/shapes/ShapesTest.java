package shapes;

import org.w3c.dom.css.Rect;

public class ShapesTest {
    public static void main(String[] args) {
        // this is creating a instance
        Quadrilateral rect = new Rectangle(5,8);
        System.out.println(rect.getArea());
        System.out.println(rect.getPerimeter());
        Quadrilateral squ = new Square(7);
        System.out.println(squ.getArea());

//        // this is a constructor in Rectangle
//        Rectangle box1 = new Rectangle(4,5);
//        System.out.println("I am a Rectangle Area " + box1.getArea());
//        System.out.println("I am a Rectangle Perimeter " + box1.getPerimeter());
//        //Parent         new instance made it into a rectangle object
//        Rectangle box2 = new Square(5);
//        System.out.println("I am a Rectangle Area " + box2.getArea());
//        System.out.println(box2.getPerimeter());
//
//        Square box3 = (Square) box2;
//        System.out.println("I am a square " + box3.getArea());
//        System.out.println(box3.getPerimeter());

        // Going over in class
//        Rectangle box1 = new Rectangle(5,4);
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());

    }
}
