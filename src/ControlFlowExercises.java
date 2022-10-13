import java.util.Scanner;
import java.util.Formatter;
public class ControlFlowExercises {
    public static void main(String[] args) {
        // Loop Basics
        // A. While Loops
        // Create an integer variable i with a value of 5.
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }
        // B. Do While
        // Create a do-while loop that will count by 2's starting with 0 and ending at 100.     Follow each number with a new line.
//        int j = 0;
//        do {
//            System.out.println("I am incrementing by two " + j);
//            j+=2;
//        }while(j < 100);
        // Alter your loop to count backwards by 5's from 100 to -10.
//        int x = 100;
//        do {
//            System.out.println("I am decrementing by five " + x);
//            x-=5;
//        }while(x >= -10);
        // Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//        long a = 2;
//        do {
//            System.out.println("I am a square root " + a);
//            a = a * a;
//        }while(a < 1000000);

//      Refactor the previous two exercises to use a for loop instead.
//        for (int j = 100; j >= -10; j -= 5) {
//            System.out.println(j);
//            if (j == -10) {
//                break;
//            }
//        }
//        long a;
//        for (a = 2; a < 1000000; a = a * a) {
//            System.out.println(a);
//            if (a == 1000000) {
//                break;
//            }
//        }

//        Fizzbuzz
//        One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
//
//  Write a program that prints the numbers from 1 to 100.
        for (int c = 1; c <= 100; c++) {
            System.out.println("I a number " + c);
        }
//        For multiples of three: print “Fizz” instead of the number.
        for (int d = 3; d <= 100; d++) {
            if (d % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(d);
            }
        }
//        For the multiples of five: print “Buzz”.
        for (int g = 5; g <= 100; g++) {
            if (g % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(g);
            }
        }
//        For numbers which are multiples of both three and five: print “FizzBuzz”.
        for (int g = 0; g <= 100; g++) {
            if (g % 5 == 0 || g % 3 == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(g);
            }
        }
//      3. Prompt the user to enter an integer.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a integer");
        int userNumber = scanner.nextInt();
        System.out.format("number was: %d", userNumber);
        System.out.println("Here is your Table!");
        System.out.printf("Number | Squared | Cubed%n ----- | ------  5| -----%n");

// number
        for ( int b = 1; b <= userNumber; b++){
            int number = b;
            int squared = b*b;
            int cubic = b*b*b;
            System.out.println(number +"      |"+squared+ "       |" + cubic);
        }
        System.out.println("Do you want to continue? Y/N");
        String userString = scanner.next();

//        Display a table of squares and cubes from 1 to the value entered.
        // Number

//        for (int y = 0; y <= userNumber; y++) {
//            System.out.format("%-15d%n",y);
//        }
//        // Squared
//        for (int y = 0; y <= userNumber; y++) {
//            System.out.format("%-15d%n",y*y);
//        }
//        // Cube
//        for (int y = 0; y <= userNumber; y++) {
//            System.out.println(y*y*y);
//        }

//        Ask if the user wants to continue.
//        Assume that the user will enter valid data.
//        Only continue if the user agrees to.
//      4. Convert given number grades into letter grades.

//                Prompt the user for a numerical grade from 0 to 100.
//        Display the corresponding letter grade.
//                Prompt the user to continue.
//        Assume that the user will enter valid integers for the grades.
//        The application should only continue if the user agrees to.
    }
}