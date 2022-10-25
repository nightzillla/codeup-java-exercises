package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        Student Danny = new Student("Danny");
        Danny.addGrade(50);
        Danny.addGrade(70);
        Danny.addGrade(30);
        Student Steven = new Student("Steven");
        Steven.addGrade(90);
        Steven.addGrade(99);
        Steven.addGrade(100);
        Student Rod = new Student("Rod");
        Steven.addGrade(88);
        Steven.addGrade(95);
        Steven.addGrade(92);
        Student Mason = new Student("Mason");
        Steven.addGrade(80);
        Steven.addGrade(91);
        Steven.addGrade(55);
        HashMap<String, Student> Students = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        Students.put("trickzillla",Danny);
        Students.put("Stevejobs",Steven);
        Students.put("Roders",Rod);
        Students.put("StolenValor",Mason);
        String userAnswer = "y";
        String seeAnotherStudent;
        String userNameInput;
        System.out.println("Welcome!");
        System.out.println("Here are the GitHub usernames of our students:");
        List<String> studentNames = new ArrayList<>(Students.keySet().stream().toList());
        for(String name: studentNames){
            System.out.printf("|%s| ", name);
        }
        System.out.printf("%nWhat student would you like to see more information on?");
        userNameInput = scanner.nextLine();
        while (userAnswer == "y"){
        if(Students.containsKey(userNameInput)){
            Student newStudentLookUp = Students.get(userNameInput);
            System.out.printf("Name: %s - GitHub UserName:%s%nCurrent Average: %s%n",newStudentLookUp,userNameInput, newStudentLookUp.getGradeAverage());
        }else{
            System.out.printf("Sorry, no student found with the GitHub username of ",userNameInput);
        }
        System.out.println("Would you like to see another student? y/n");
        seeAnotherStudent = scanner.next();
        if (seeAnotherStudent == "y") {
            System.out.println("What student would you like to see more information on?");
        }
        else if (seeAnotherStudent.equals("n")) {
            System.out.println("Goodbye, and have a wonderful day!");
        }
        }
    }
}
