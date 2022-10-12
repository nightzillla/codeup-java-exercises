import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
//        The value of pi is approximately 3.14.

// Explore the Scanner Class.
// 1. Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
// What happens if you input something that is not an integer?
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int userNumber = scanner.nextInt();
        System.out.format("Your number was: %d%n", userNumber);
    // What happens if you input something that is not an integer? You get an error.
// 2. Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
        System.out.println("Enter 3 words:");
        String firstWord = scanner.next();
        String secondWord = scanner.next();
        String thirdWord = scanner.next();
        String word1 = "how";
        String word2 = "are";
        String word3 = "you";
        System.out.printf("Your words are %s %s %s.%n", firstWord , secondWord, thirdWord);
// 3. Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
        System.out.println("Please enter a sentence");
        String userInput = scanner.next() + scanner.nextLine();
        System.out.printf("Your words are %s.%n", userInput);
// 4. Rewrite the above example using the nextLine method.

//        Calculate the perimeter and area of Codeup's classrooms.
//  Prompt the user to enter values of length and width of a classroom at Codeup (or your room if virtual).
        System.out.println("Enter the length your classroom");
//
//  Use the nextLine method each time you need to get user input. In this case, we need it twice, once to get the user input for the length and again to get the user input for the width. Parse the resulting strings to a numeric type.
        int classRoomLength = Integer.parseInt(scanner.nextLine());
        System.out.format("The length of your classroom is: %d%n", classRoomLength);
        System.out.println("Enter the width your classroom");
        int classRoomWidth = Integer.parseInt(scanner.nextLine());
        System.out.format("The length of your classroom is: %d%n", classRoomWidth);

    }
}