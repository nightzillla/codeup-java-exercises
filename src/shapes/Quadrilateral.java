package shapes;

    public abstract class Quadrilateral extends Shape implements Measurable{
    protected double length;
    protected double width;

    public double getLength() {
        return length;
    }

    public abstract void setLength(double length);

    public abstract double getWidth();

    public void setWidth(double width) {
        this.width = width;
    }
    // default constructor
    public Quadrilateral(){};
    // custom constructor
    public Quadrilateral(double length, double width){
        this.setLength(length);
        this.setWidth(width);
    };
         @Override
         public double getPerimeter() {
             return (2 * length) + (2 * width);
         }

         @Override
         public double getArea() {
             return length * width;
         }
     }
