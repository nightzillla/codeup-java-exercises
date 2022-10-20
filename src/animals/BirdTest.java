package animals;

public class BirdTest {
    public static void main(String[] args) {
        BirdLecture crow = new BirdLecture();
        crow.setName("Dr. Crow");
//        System.out.println(crow.getName() + " goes ");
//        crow.makeNoise();
        TweetyBird goldfinch = new TweetyBird();
//        goldfinch.makeNoise();
        Parrot parrot = new Parrot();
        parrot.echo("yeehaw");
//        parrot.makeNoise();
        Finch finch = new Finch();
//        finch.makeNoise();
        BirdLecture parrot2 = new Parrot();
        parrot2.makeNoise();
//        parrot2.echoo("yoooo");
        parrot2.setName("Parrot");
        System.out.println(parrot2.getName());


        // Example of polymorphism:
        BirdLecture[] birds = new BirdLecture[3];
        birds[0] = new Finch();
        birds[0].setName("Lesser Goldfinch");
        birds[1] = new Parrot();
        birds[1].setName("Polly");
        birds[2] = new TweetyBird();
        birds[2].setName("Tweetybird");

        for(BirdLecture bird: birds){
            bird.makeNoise();
        }
        Parrot backToParrot = (Parrot) birds[1];
        backToParrot.echo("I can echo now");

        BirdLecture.birdSounds(birds);

    }
}
