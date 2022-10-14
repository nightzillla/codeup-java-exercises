import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {
        System.out.println("I'm adding 10 and 20 = " + addition(10,20));
        System.out.println("I'm subtracting 20 from 10 = " + subtract(20,10));
        System.out.println("I'm multiplying 10 * 10 = " + multiplication(10,10));
        System.out.println("I'm dividing 10 from 5 = " + division(10,5));

        int get = getInteger(1, 10);
        System.out.println(get);

    } // end main
//    Create a method that validates that user input is in a certain range and returns that input as an integer if it is within the given range. If not, prompt the user to input their number again until the input is within range.
    public static int getInteger(int min, int max){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10: ");
        int userInput = scanner.nextInt();
        if (min <= userInput && userInput < max) {
            return userInput;
        } else {
            System.out.println("Your number is not in range");
            return getInteger(min, max);
        }
    }
    // Basic Arithmetic
    // Addition
    public static int addition(int input, int input2){
        return input + input2;
    }
    // Subtraction
    public static int subtract(int input, int input2){
        return input - input2;
    }
    // Multiplication
    public static int multiplication(int input, int input2){
        return input * input2;
    }
    // Division
    public static int division(int input, int input2){
        return input / input2;
    }

    public static int modulus(int input, int input2){
        return input % input2;
    }
} // end MethodsExercise
