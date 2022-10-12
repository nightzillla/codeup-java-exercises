import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f%n", pi);
// Explore the Scanner Class
// 1. Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
// What happens if you input something that is not an integer?
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int userNumber = scanner.nextInt();
        System.out.format("Your number was: %d%n", userNumber);
    // What happens if you input something that is not an integer? You get an error.
// 2. Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
        System.out.println("Enter three words:");
        String firstWord = scanner.next();
        String secondWord = scanner.next();
        String thirdWord = scanner.next();
        System.out.format("Your words are %s %s %s.%n", firstWord , secondWord, thirdWord);
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
        double classRoomLength1 = Double.parseDouble(scanner.nextLine());
        System.out.format("The length of your classroom is: %dft%n", classRoomLength);
        System.out.println("Enter the width your classroom");
        int classRoomWidth = Integer.parseInt(scanner.nextLine());
        double classRoomWidth2 = Integer.parseInt(scanner.nextLine());
        System.out.format("The length of your classroom is: %dft%n", classRoomWidth);
// Display the area and perimeter of that classroom.
//The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.
        int totalClassArea = classRoomLength * classRoomWidth;
        System.out.format("The length and width of your class room is:%dft %dft%n", classRoomLength, classRoomWidth);
        System.out.format("The total area is %dft", totalClassArea);
// In your perimeter/area calculator: - Accept decimal entries. - Calculate the volume of the rooms in addition to the area and perimeter.
        double height = Double.parseDouble(scanner.nextLine());
        double volume = classRoomWidth2 * classRoomLength1 * height;
        double perimeter = classRoomWidth2 * 2 + classRoomLength1 * 2;
        System.out.printf("The perimeter of your classroom is %.2f%n", perimeter);
        System.out.printf("The volume of your classroom is %.2f cubic feet", volume);
    }
}