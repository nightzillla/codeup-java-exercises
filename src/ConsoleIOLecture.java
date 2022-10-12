public class ConsoleIOLecture {
    // type main and then tab
    public static void main(String[] args) {
        String cohort = "Weywot";
        String timeOfDay = "morning";
        byte week = 10;
        float someNumber = 123.456F;
        // print format created in the 1970s
        // line break you need to input this %n
        System.out.printf("Good, %s %s!%n",cohort, timeOfDay);
        System.out.printf("This is the %dth week of %s cohort.!%n", week, cohort);
        System.out.println("Will this be on a separate line?");
        System.out.println("How about this?");
        System.out.printf("The number is %11.2f%n", someNumber);
        System.out.printf("The number is %-11.2f test%n", someNumber);
    }
}
