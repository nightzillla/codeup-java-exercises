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
//      For the multiples of five: print “Buzz”.
        for (int g = 5; g <= 100; g++) {
            if (g % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(g);
            }
        }
//      For numbers which are multiples of both three and five: print “FizzBuzz”.
        for (int g = 0; g <= 100; g++) {
            if (g % 5 == 0 || g % 3 == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(g);
            }
        }
//      3. Prompt the user to enter an integer.
        String userChoice;
        do {
            System.out.println("Enter a integer");
            Scanner scanner = new Scanner(System.in);
            int userNumber = scanner.nextInt();
            System.out.println("Here is your table!");
            System.out.println(""); // to create a blank line
            System.out.println("Number | Squared | Cubed");
            System.out.println("-------| ------- | ------");

            for (int i = 1; i <= userNumber; i++) {
                System.out.printf("%-7d| %-8d| %d%n", i, i * i, i * i * i);
            }
            System.out.println("Do you want to continue? Y/N");
            userChoice = scanner.next();
        } while (userChoice.equals("Y"));
        // 4.Convert given number grades into letter grades.

        System.out.println("Enter a numerical grade from 0 to 100");
        Scanner scanner = new Scanner(System.in);
        byte grade = scanner.nextByte();
        char letterGrade;
        if (grade >= 0 && grade <= 59) {
            letterGrade = 'F';
        } else if (grade <= 66) {
            letterGrade = 'D';
        } else if (grade <= 79) {
            letterGrade = 'C';
        } else if (grade > 79 && grade <= 87) {
            letterGrade = 'B';
        } else {
            letterGrade = 'A';
        }
        System.out.println("The letter grade is " + letterGrade);
    } // end main
} // end class