import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercises {
//    Create a static method named addPerson.
    public static Person[] addPerson(Person[] personName) {
        // to initialized new array
        Person[] person = new Person[personName.length + 1];
        for(int i = 0; i < personName.length; i++){
            person [i] = personName [i];
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add a new person!");
        String userInput = scanner.nextLine();
        person [person.length - 1] = new Person(userInput);
        return person;
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
//      Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. Iterate through the array and print out the name of each person in the array.
        Person[] person = {new Person("John"),new Person("Paul"),new Person("Ringo")};
    for(Person names : person){
        System.out.println(names.getName());
    }
//      Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.
        Person[] persons = addPerson(person);
        for(Person names : persons){
            System.out.println(names.getName());
        }

    } // end of main
} // end of ArrayExercises class
