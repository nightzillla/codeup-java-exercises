import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercises {
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
        Person[] person = {new Person("John"),new Person("Paul"),new Person("Ringo")};
    for(Person names : person){
        System.out.println(names.getName());
    }
    Person[] persons = addPerson(person);
    for(Person names : persons){
        System.out.println(names.getName());
    }


    } // end of main
} // end of ArrayExercises class
