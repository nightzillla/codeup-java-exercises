// all java code live inside class
public class HelloWorld {
    // CANNOT USE THIS WORDS TO DEFINE A VARIABLE
    // abstract, continue, for, new, switch, assert, default, goto, package, synchronized, boolean, do, if, private, this, break, double, implements, protected, throw, byte, else, import, public, throws, case, enum, instanceof, return, transient, catch, extends, int, short, try, char, final, interface, static, void, class, finally, long, strictfp, volatile, const, float, native, super, while
    // type "main and then press tab" it will give you the following below on line 4
    public static void main(String[] args) {
        // Declare variable without initializing
        int weight;
        String breed;
        // Initializing after declaration
        weight = 12;
        breed = "Cavalier King Charles Spaniel";
        // Initializing and declare at the same time
        String name = "Grinch";
        int cutenessFactor = 10;
        // Statement: "JVM, do something"
        // type "sout and then press tab"
        System.out.println(name + " is a " + breed + ".");
        // Conditional logic
        if (cutenessFactor > 8){
            System.out.println(name + " is cute.");
        } else {
            System.out.println(name + " needs to work on cuteness.");
        }

        boolean isGrinchCute = true;
        char oneLetter = 'a';
        byte smallNumber;    // 1 byte go from -128 to 127
        short mediumNumber; // 2 byte = shorts go from -32768 to 32767
        int number;        // 4 byte = integers go from -2 billion to 2 billion
        long bigNumber;   // 8 byte = longs go from about -9 quadrillion to 9 quadrillion

        smallNumber = 12;
        System.out.println(smallNumber);
        number = smallNumber;
        System.out.println(number);

        number = 2000000000;
        // this is known as casting, converting one datatype into another
        smallNumber = (byte) number;
        // need to put an L after you declare a long
        bigNumber = 9000000000000L;

        // need to put an F after you declare a float
        float imafloat = 2.34F;
        double imadouble = 9.01234567890123;
        System.out.println(imadouble);
        // this is known as casting, converting one datatype into another
        imafloat = (float) imadouble;
        System.out.println(Math.pow(2, 3));
    }
}
