import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
//        Bob is a lackadaisical teenager. In conversation, his responses are very limited.
//        Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
          Scanner scanner = new Scanner(System.in);
          System.out.println("Bob are you hungry?");
          String userAnswer = scanner.next();
          if (userAnswer.endsWith("?")) {
              System.out.println("Who, chill out!");
          }
//        He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
//        He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
//        He answers 'Whatever.' to anything else.
    }
}
