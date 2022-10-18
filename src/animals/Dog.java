package animals;

public class Dog {
//    Create a class for your favorite type of animal. The class should be named for your animal - Cat, animals.Dog, Parrot etc. It should have two instance variables - name and sound - and one method - makeNoise(). The output of the makeNoise method should be named +  " goes " + sound. Create a test class with a main method to instantiate and test your class code.
    public String name;
    public String sound;
//    public void makeNoise() {
//        System.out.printf("%s goes %s",name, Quote.randomQuote());
//    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
