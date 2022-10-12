import java.util.Scanner;

public class StatementsLecture {

    public static void main(String[] args) {
        // Statements
        int myInteger = 20;
        int x = 5;
        if (x == 5) {
            System.out.println("x is 5");
        } else if (x > 5 && x < 15){
            System.out.println("x is between 5 and 15");
        } else {

        }
        String customerChoice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What flavor do you want?");
        customerChoice = scanner.next();

        // enhance switch statements
        switch (customerChoice) {
            case "vanilla" -> System.out.println("One vanilla coming right up");
            case "chocolate" -> System.out.println("chocolate coming right up");
            case "strawberry" -> System.out.println("strawberry coming right up");
            default -> System.out.println("We don't have that");
        }

        // traditional switch statements
//        switch (customerChoice) {
//            case "vanilla":
//                System.out.println("One vanilla coming right up");
//                break;
//            case "chocolate":
//                System.out.println("chocolate coming right up");
//                break;
//            case "strawberry":
//                System.out.println("strawberry coming right up");
//                break;
//            default:
//                System.out.println("We don't have that");
//                break;

        boolean existence = true;
//        if(existence) System.out.println("Yes");
        int theAnswer = 42;
        if(existence || theAnswer++ == 42){
        }
        System.out.println(theAnswer);
//        int c = 0, d = 100, e = 50;
//        if (c == 0 && e++ < 100) {
//        }
//        System.out.println("e = " + e);
        int i = 1;
        System.out.println("The loop hasn't started yet. The value of i is " + i);
        while (i < 10) {
            System.out.println("Now I'm in the loop. I has not incremented yet and its value is " + i);
            i++;
            System.out.println("I'm still in the loop. I has incremented and its value is " + 1);
        }
        System.out.println("The loop has ended because the conditional has tested false. The value of i is " + i);
    }
}
