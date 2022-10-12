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
        if (cutenessFactor > 8) {
//            System.out.println(name + " is cute.");
        } else {
//            System.out.println(name + " needs to work on cuteness.");
        }

        boolean isGrinchCute = true;
        char oneLetter = 'a';
        byte smallNumber;    // 1 byte go from -128 to 127
        short mediumNumber; // 2 byte = shorts go from -32768 to 32767
        int number;        // 4 byte = integers go from -2 billion to 2 billion
        long bigNumber;   // 8 byte = longs go from about -9 quadrillion to 9 quadrillion

        smallNumber = 12;
//        System.out.println(smallNumber);
        number = smallNumber;
//        System.out.println(number);

        number = 2000000000;
        // this is known as casting, converting one datatype into another
        smallNumber = (byte) number;
        // need to put an L after you declare a long
        bigNumber = 9000000000000L;

        // need to put an F after you declare a float
        float imafloat = 2.34F;
        double imadouble = 9.01234567890123;
//        System.out.println(imadouble);
        // this is known as casting, converting one datatype into another
        imafloat = (float) imadouble;
//        System.out.println(Math.pow(2, 3));
//##################### ASSIGMENT ####################################################################################//
//      1. Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
        int myFavoriteNumber = 3;
        System.out.println("Your favorite number is " + myFavoriteNumber);

//      2. Create a String variable named myString and assign a string value to it, then print the variable out to the console.
        String myString = "pizza";
        System.out.println(myString);

//      3.Change your code to assign a character value to myString. What do you notice?
        myString = "345";
        System.out.println("Change from pizza to a #" + myString);

//      4.Change your code to assign the value 3.14159 to myString. What happens?
        myString = String.valueOf((3.14159));
        System.out.println(myString);
        // requires you to declare String.valueOf

//      5. Declare a long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
        long myNumber = 0;
        System.out.println(myNumber);
        // you have to initialize variable myNumber = 0;

//      6. Change your code to assign the value 3.14 to myNumber. What do you notice?
        myNumber = (long) 3.14;
        // You have to cast to long

//      7. Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
        myNumber = 123L;

//      8. Change your code to assign the value 123 to myNumber.
//      Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?

        myNumber = 123;

//      9. Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?

        // use float and double

//      10. Copy and paste the following code blocks one at a time and execute them

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
        // output is 5, 6

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
        // output is 6, 6

//      11. Try to create a variable named class. What happens?

//      12. Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

        // inline variable
        Object o = "three";
        int three = (int) o;

//      13. Rewrite the following expressions using the relevant shorthand assignment operators:

        // int x = 4;
        // x = x + 5;

//        int x = 4;
//        x += 5;

//         int x = 3;
//         int y = 4;
        // y = y * x;
//         y *= x;


        // int x = 10;
        // int y = 2;
        // x = x / y;
        // y = y - x;
//        y -= (x /= y);
//        System.out.println(y);

//        14. What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?
//
//        Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.

//        int maxiumInteger = integer.MAX_VALUE;
//        System.out.println(maxiumInteger);

    }
}
