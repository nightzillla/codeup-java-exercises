package AssessmentReview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Practice {

    // 1. Create a class called Practice with a main method.
    public static void main(String[] args) {
        System.out.println(subtractTen(20));
        for(int number : multiplyAll(5, new ArrayList<>(List.of(5,10,15,25,30)))){
            System.out.println(number);
        }
    }
    // 2. Create a public static method in the Practice class called *subtractTen* that takes one integer argument and returns that number minus 10.
    public static int subtractTen(int input) {
        return input - 10;
    }

    // 3. Create a public static method *average* in the Practice class that takes an array of integers and returns their average as a double.
//    public static double average(int[] average) {
//        double total = 0;
//        for (int i = 0; i < average.length; i++) {
//            total = total + average[i];
//        }
//        double result = total / average.length;
//        return result;
//    }

    public static double average(int[] numbers){
        double total = 0;
        for(double number : numbers){
            total += number;
        }
        return total/numbers.length;
    }

    // 4. Create a class called Pet with two String instance variables, name and type.
// 5. Create getters and setters for the properties as well as a constructor that takes two strings and sets the name and type.
// 6. Create a PetDog class that inherits from Pet.
// 7. In PetDog, create a boolean instance variable, trained.
// 8. Write a constructor for PetDog that sets its name, type, and trained properties.
// 9. Write an instance method in PetDog  called isTrained that returns the boolean value of the trained property.
// 10. Create an interface named Companion. The Companion interface should specify an instance method named snuggle that has no arguments and returns a String. Change your PetDog class so it implements the Companion interface. The implementation of the snuggle method on the PetDog class should return "name wants to snuggle", where name is the inherited instance property.
// 11. Create a PetDogTest class, instantiate a PetDog, and verify that the snuggle method works correctly.


// 12. In your Practice class, create a static method named multiplyAll. It should accept an integer and an ArrayList of integers. It should take the ArrayList argument and multiply all its elements by the value of the integer argument.
    public static ArrayList<Integer> multiplyAll(int multiplier, ArrayList<Integer> numbers) {
        ArrayList<Integer> newNumbersArrayList = new ArrayList<>();
        for (int number : numbers){
            newNumbersArrayList.add(number * multiplier);
        }
        return newNumbersArrayList;
    }
} // end of class
