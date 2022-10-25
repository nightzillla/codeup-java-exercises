package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        Student Danny = new Student("Danny");
        Student Steven = new Student("Steven");
        Student Rod = new Student("Rod");
        Student Mason = new Student("Mason");
        Danny.addGrade(90);
        Danny.addGrade(70);
        Danny.addGrade(60);
        Steven.addGrade(90);
        Steven.addGrade(99);
        Steven.addGrade(100);
        Rod.addGrade(88);
        Rod.addGrade(95);
        Rod.addGrade(92);
        Mason.addGrade(80);
        Mason.addGrade(91);
        Mason.addGrade(55);
        HashMap<String, Student> Students = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        Students.put("trickzillla", Danny);
        Students.put("Stevejobs", Steven);
        Students.put("Roders", Rod);
        Students.put("StolenValor", Mason);
        String userAnswer = "y";
        String userNameInput;
        System.out.println("Welcome!");
        System.out.println("Here are the GitHub usernames of our students:");
        List<String> studentNames = new ArrayList<>(Students.keySet().stream().toList());
        for (String name : studentNames) {
            System.out.printf("|%s| ", name);
        }
        do {
            System.out.printf("%nWhat student would you like to see more information on?");
            userNameInput = scanner.nextLine();
            if (Students.containsKey(userNameInput)) {
                Student newStudentLookUp = Students.get(userNameInput);
                System.out.printf("Name: %s - GitHub UserName:%s%nCurrent Average: %.2f%n", newStudentLookUp, userNameInput, newStudentLookUp.getGradeAverage());
            } else {
                System.out.printf("Sorry, no student found with the GitHub username of %s ", userNameInput);
            }
            System.out.println("Would you like to see another student? y/n");
            userAnswer = scanner.nextLine();
        } while (userAnswer.equals("y"));
            if (userAnswer.equals("n")) {
            System.out.println("Goodbye, and have a wonderful day!");
        }
    }
}
