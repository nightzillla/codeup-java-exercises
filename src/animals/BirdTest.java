package animals;

public class BirdTest {
    public static void main(String[] args) {
        BirdLecture crow = new BirdLecture();
        crow.setName("Dr. Crow");
        System.out.println(crow.getName() + " goes ");
        crow.makeNoise();
        TweetyBird goldfinch = new TweetyBird();
        goldfinch.makeNoise();

    }
}
