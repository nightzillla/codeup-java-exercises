package FileIo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIOPractice {
//    ===== FILE IO MINI-EXERCISE
//- create a class called `FileIoPractice` with a main method
public static void main(String[] args) {
    Path pathToTest = Paths.get("src", "FileIo", "people.txt");
    System.out.println(pathToTest);
    // Use boolean to check to see if the files exists
    boolean pathToTestExist = Files.exists(pathToTest);
    System.out.println(pathToTestExist);

//      create an array list of first names of four other people in your cohort
//      add code to your main method that replaces the contents of `people.txt` with your classmates by writing to the file
    // this method will update people.txt
    List<String> newNames = Arrays.asList("Mason", "X", "David", "Stephen");
    try {
        Files.write(pathToTest, newNames);
    } catch (IOException e) {
        e.printStackTrace();
    }
    //- write code in the main method that prints the following messages:
    for (int i = 0; i < newNames.size(); i++) {
        System.out.printf("%s works at Codeup!%n", newNames.get(i));
    }
//    deleteName("");

//
//    private static void deleteName (String nameToDelete){
//        List<String> updatedNames = new ArrayList<>();
//        for (String name : readLines()) {
//            if (!name.equalsIgnoreCase(nameToDelete)) {
//                updatedNames.add(name);
//            }
//        }
//    }
} // end of main

//
//- BONUS: create a static method, `deleteEntry`, that takes in the name of someone (a string) and when invoked, rewrites a new list to the `people.txt` file
//    with all entries except the passed in name
    }
