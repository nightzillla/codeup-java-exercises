package animals;

public class BirdLecture {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void makeNoise(){
        System.out.println("caw caw");
    }
    // Polymorphic argument
    public static void birdSounds(BirdLecture[] birdsArray){
        for(BirdLecture bird : birdsArray){
            bird:makeNoise();
        }
    };
}
