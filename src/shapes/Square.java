package shapes;
    // square inherits rectangle because of extends
public class Square extends Quadrilateral{
        protected double side;

        @Override
        public void setLength(double length) {
            this.length = length;
            this.width = width;
        }
        public void setWidth(double width){
            this.width = width;
            this.length = width;
        }


        public double getArea(){
            return length * width;
        }
        public double getPerimeter() {
            return 4 * length;
        }
        @Override
        public double getWidth() {
            return 0;
        }
        public Square(){};
        public Square(double side){
            super(side,side);

        };

//        @Override
//        public double getPerimeter() {
//            return 0;
//        }
//
//        @Override
//        public double getArea() {
//            return 0;
//        }
//    // Inheritance and Polymorphism Exercise
//    // this is default constructor
//    public Square(){};
//    // this is custom constructor
//    public Square(int side){
//        // super means I want my parents thing
//        super.setWidth(side);
//        super.setLength(side);
//    };
//    public int getArea(){
//        return (int) Math.pow(getLength(), 2);
//    }
//    public int getPerimeter(){
//        return 4 * getLength();
//    }
//    // This is the end of Inheritance and Polymorphism Exercise

        // Going over in class
//        public Square(double side){
//            super(side, side);
//            this.side = side;
//        }
//        public double getPerimeter(){
//            return 4 * side;
//        }
//        public double getArea(){
//            return Math.pow(super.length, 2);
//        }
    }
