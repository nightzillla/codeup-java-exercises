public class ControlFlowExercises {
    public static void main(String[] args) {
        // Loop Basics
        // A. While
        // Create an integer variable i with a value of 5.
        int i = 5;
        while (i < 15) {
            System.out.println(i);
            i++;
        }
        ;
        // B. Do While
        // Create a do-while loop that will count by 2's starting with 0 and ending at 100.     Follow each number with a new line.
//        int j = 0;
//        do {
//            System.out.println("I am incrementing by two " + j);
//            j+=2;
//        }while(j < 100);
        // Alter your loop to count backwards by 5's from 100 to -10.
//        int x = 100;
//        do {
//            System.out.println("I am decrementing by five " + x);
//            x-=5;
//        }while(x >= -10);
        // Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//        long a = 2;
//        do {
//            System.out.println("I am a square root " + a);
//            a = a * a;
//        }while(a < 1000000);

//      Refactor the previous two exercises to use a for loop instead.
        for (int j = 100; j >= -10; j -= 5) {
            System.out.println(j);
            if (j == -10) {
                break;
            }
        }
        long a;
        for (a = 2; a < 1000000; a = a * a) {
            System.out.println("testing " + a);
            if (a == 1000000) {
                break;
            }
        }
    }
}
