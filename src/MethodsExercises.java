import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {
        System.out.println("I'm adding 10 and 20 = " + addition(10,20));
        System.out.println("I'm subtracting 20 from 10 = " + subtract(20,10));
        System.out.println("I'm multiplying 10 * 10 = " + multiplication(10,10));
        System.out.println("I'm dividing 10 from 5 = " + division(10,5));

        rollDice();
//        System.out.println(calculateFactorial());

        int get = getInteger(1, 10);
//        int fact = calculateFactorial(get);
//        System.out.println(fact);
//        System.out.println(diceRoll(1, 6));

    } // end main
//    Create a method that validates that user input is in a certain range and returns that input as an integer if it is within the given range. If not, prompt the user to input their number again until the input is within range.
    // THIS IS RECURSION
    public static int getInteger(int min, int max){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10: ");
        int userInput = scanner.nextInt();
        System.out.printf("Your number is %d%n", userInput);
        if (min <= userInput && userInput < max) {
            return userInput;
        } else {
            System.out.println("Your number is not in range");
            return getInteger(min, max);
        }
    } // End of getInteger

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
    public static double division(double input, double input2){
        return input / input2;
    }
    public static int modulus(int input, int input2){
        return input % input2;
    }
//    3.Calculate the factorial of a number.
//    Prompt the user to enter an integer from 1 to 10.
//      public static int calculateFactorial () {
//          String goAgain = "Y";  // Created this so when the user answer yes it continues
////        while (goAgain.equalsIgnoreCase("y")) {  // while the user enter yes go again
//          Scanner scanner = new Scanner(System.in);
//          String userChoice;
//          int userInput;
//          do {
//              userInput = getInteger(1, 10);
//              System.out.println("Do you want to continue? Y/N");
//              userChoice = scanner.next();
//          } while (userChoice.equalsIgnoreCase("Y"));
//          System.out.println(userInput);
//          return userInput;
//      }

//    public static long calculateFactorial () {
//
//        for (int i = 1; i <= userInput; i++){
//            factorial = factorial * 1;
//        }
//        return 0;
//    }
    // Going over question 3 in class
//    public static void factorial() {
//        int userInput = getInteger(1,20);
//        long factorial = calculateFactorial(userInput);
//        System.out.printf("The factorial of %d is %d%n", userInput, factorial);
//        System.out.printf("Would you like to calculate another factorial? y/n%n");
//        String userChoice = new Scanner(System.in).next();
//        if(userChoice.equals("y")) factorial();
//    }

//    public static int calculateFactorial(int userInput) {
//        int count = 1;
//        for (int i = 1; i < userInput+1; i++) {
//            count *= i;
//        }
//        return count;
//    }

//    4. Create an application that simulates dice rolling
//    Ask the user to enter the number of sides for a pair of dice.
//      public static boolean diceRoll (int userInputD, int userInputDTwo) {
//          Scanner scanner = new Scanner(System.in);
//          System.out.println("Enter the number of sides for a pair of dice");
//          int userInput = scanner.nextInt();
//          System.out.printf("Your number dice number is %d%d%n", userInputD, userInputDTwo);
//          diceRoll(userInputD, userInputDTwo);
//          return false;
//      }

    // Going over question 4 in class
    public static long generatedRandomNumber(int max){
        return Math.round(Math.random() * max);
    }
    public static void rollDice(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many sides do the dice have?");
        byte numberOfSide = scanner.nextByte();
        System.out.printf("Your dice have %d sides.%n", numberOfSide);
        System.out.println("Do you want to roll the dice? y/n");
        String userChoice = scanner.next();
        while (userChoice.equals("y")){
            System.out.println("You rolled the dice!");
            System.out.printf("You rolled %d and %d%n", generatedRandomNumber(numberOfSide), generatedRandomNumber(numberOfSide));
            System.out.println("Do you want to roll the dice again? y/n");
            userChoice = scanner.next();
        }
    }
//    Game Development 101
//      Welcome to the world of game development!
//      You are going to build a high-low guessing game. Create a class named HighLow inside of src.

} // end MethodsExercise
