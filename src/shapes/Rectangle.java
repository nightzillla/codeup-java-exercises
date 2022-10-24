package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
      protected double length;
      protected double width;

      public double getPerimeter() {
            return 2 * width + 2 * length;
      }

      public double getArea() {
            return length * width;
      }
      @Override
      public void setLength(double length) {
            this.length = length;
      }

      public void setWidth(double length){
            this.length = width;
      }
      @Override
      public double getWidth() {
            return 0;
      }
      public Rectangle(){};

      public Rectangle(double length, double width){
            super(length, width);
      };
//
//    // Inheritance and Polymorphism Exercise
//    // this is a variable
//    private int width;
//    private int length;
//    public int getWidth() {
//        return width;
//    }
//    public void setWidth(int width) {
//        this.width = width;
//    }
//    public int getLength() {
//        return length;
//    }
//    public void setLength(int length) {
//        this.length = length;
//    }
//    // This is default constructor
//    public Rectangle(){};
//    // This is a Special Constructor
//    public Rectangle(int width, int length) {
//        this.width = width;
//        this.length = length;
//    }
//    // This is creating a method
//    public int getArea(){
//        return length * width;
//    }
//    // This is creating a method
//    public int getPerimeter(){
//        return (2 * length) + (2 * width);
//    }
//    // The End  of Inheritance and Polymorphism Exercise

    // Abstract Classes and Interface

    // Going over in class
//    protected double length;
//    protected double width;
//
//    public double getArea(){
//        return length * width;
//    }
//    public double getPerimeter(){
//        return 2 * length + 2 * width;
//    }
//    public Rectangle(){};
//
//    public Rectangle(double length, double width){
//        this.length = length;
//        this.width = width;
//    }


}
