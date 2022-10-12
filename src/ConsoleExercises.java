import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
//        The value of pi is approximately 3.14.


// 1. Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
// What happens if you input something that is not an integer?
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int userNumber = scanner.nextInt();
        System.out.format("Your number was: %d%n", userNumber);
    // What happens if you input something that is not an integer? You get an error.
// 2. Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
        System.out.println("Enter 3 words:");
        String userInput = scanner.next() + scanner.nextLine();
        System.out.printf("Your words are %s.%n", userInput);
// 3. Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.

    }
}