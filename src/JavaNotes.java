import java.util.Scanner;

public class JavaNotes {
    // A class is used to define a custom type in Java.
    //You can think of a class as a template, or a blueprint, for objects that will be created based on it.

    // Data - In computer science, data is information that is stored and processed by a computer.

    // Java classifies different pieces of data with data types based on their value
    // A data type provides a set of possible values
    // If a piece of data is one of a data type's values, it is classified as that data type.

    // Primitive Types are: Boolean, int, double, char

    // Boolean: represents a true or false value
    // Int: represents a whole number
    // Double: represents a decimal number
    // Char" represents a single letter or symbol

    public static void main(String[] args) {
        // EXERCISE 1
//        // creating a variable
//        int studentAge = 15;
//        double studentGPA = 3.45;
//        String studentFirstName = "Kayla";
//        String studentLastName =  "Hammon";
//        // char needs to be in single quotation ''
//        char studentFirstInitial = studentFirstName.charAt(0);
//        char studentLastInitial = studentLastName.charAt(0);
//        boolean hasPerfectAttendance = true;
//        Scanner input = new Scanner(System.in);
//        studentGPA = input.nextDouble();
//        System.out.println(studentFirstName + " " + studentLastName + "now has a GPA of " + studentGPA);

        // EXERCISE 2
//        System.out.println("Pick a number between 1 and 10");
//        Scanner scanner = new Scanner(System.in);
//        // if statement is a control flow statement, where if the condition is true, it performs some kind of action
//        int inputtedNum = scanner.nextInt();
//        if(inputtedNum < 5 ){
//            System.out.println("Enjoy the good luck a freind brings you");
//        } else {
//            System.out.println("Your shoe selection will amke you very happy today");
//        }
        // EXERCISE 3
//        Scanner input = new Scanner(System.in);
//        boolean isOnRepeat = true;
//        while(isOnRepeat) {
//            System.out.println("Playing current song");
//            System.out.println("Would you like to take this song off of repeat? if so, answer yes");
//            String userInput = input.next();
//
//            if(userInput.equals("yes")) {
//                isOnRepeat = false;
//            }
//        }
//        System.out.println("Playing next song");

        // EXERCISE 4
        String question = "What is the largest planet in our solar system";
        String choiceOne = "Earth";
        String choiceTwo = "Jupiter";
        String choiceThree = "Saturn";

        String correctAnswer = choiceTwo;

        // Write a print statement asking the question
        System.out.println(question);
        // Write a print statment giving the answer choices
        System.out.println("Choose one of the following: " + choiceOne + ", " + choiceTwo + ", or " + choiceThree + ".");
        // Have the user input an answer
        Scanner scanner = new Scanner(System.in);
        // Retrieve the user's input
        String input = scanner.next();
        // If the user's input matches the correctAnswer...
        // then the user is correct and we ant to print out a congrats message to the user.
        if(correctAnswer.equals(input.toLowerCase())){
            System.out.println("Congrats! That's teh correct answer");
        } else {
            System.out.println("You are incorrect.");
        }

    } // end of main
} // end of class
