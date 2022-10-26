package util;
import java.util.Scanner;


public class InputUpdate {

    private static Scanner scanner;

    public void Input() {
        this.scanner = new Scanner(System.in);
    }

    public InputUpdate(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getString(){
        System.out.println("Enter your input:");
        return scanner.nextLine();
    }

    public String getString(String prompt){
        System.out.println(prompt);
        return scanner.nextLine();
    }

    // Solution: David Lara and John Pedrotti
    public boolean yesNo(){
        System.out.println("Yes or no?");
        String userInput = scanner.nextLine();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }

    /*
        TODO: refactor this method to use Integer.valueOf(getString()) and surround it with a try-catch block to
         to catch the NumberFormatException. If the exception is caught, call the getInt() method again.
     */
    public static int getInt(){
        System.out.println("Enter an integer:");
        Input scanner = new  Input();
        String x = scanner.getScanner().nextLine();
        try {
            return Integer.valueOf(x);

        } catch(NumberFormatException e){
            System.out.println("Please enter a integer!");
            return getInt();
        }
    }

    public int getInt(String prompt){
        System.out.println(prompt);
        return scanner.nextInt();
    }

    public int getInt(int min, int max){
        String prompt = "Enter an integer between " + min + " and " + max + ":";
        System.out.println(prompt);
        int userInput = getInt();
        while (userInput < min || userInput > max){
            System.out.println(prompt);
            userInput = scanner.nextInt();
        }
        return userInput;
    }

    /*
        TODO: refactor this method to use Double.valueOf(getString()) and surround it with a try-catch block to
         to catch the NumberFormatException. If the exception is caught, call the getDouble() method again.
     */
    public double getDouble(){
        System.out.println("Enter an number:");
        return scanner.nextDouble();
    }

    public double getDouble(String prompt){
        System.out.println(prompt);
        return scanner.nextDouble();
    }

    public double getDouble(double min, double max){
        String prompt = "Enter an number between " + min + " and " + max + ":";
        System.out.println(prompt);
        double userInput = getDouble();
        while (userInput < min || userInput > max){
            System.out.println(prompt);
            userInput = scanner.nextDouble();
        }
        return userInput;
    }

    public static void main(String[] args) {
        getInt();

    }
}