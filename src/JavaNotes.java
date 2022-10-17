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
        // creating a variable
        int studentAge = 15;
        double studentGPA = 3.45;
        String studentFirstName = "Kayla";
        String studentLastName =  "Hammon";
        // char needs to be in single quotation ''
        char studentFirstInitial = studentFirstName.charAt(0);
        char studentLastInitial = studentLastName.charAt(0);
        boolean hasPerfectAttendance = true;
        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();

        System.out.println(studentFirstName + " " + studentLastName + "now has a GPA of " + studentGPA);


    }

}
