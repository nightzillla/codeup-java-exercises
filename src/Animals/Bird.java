package Animals;

public class Bird {
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
    public static void birdSounds(Bird[] birdsArray){
        for(Bird bird : birdsArray){
            bird:makeNoise();
        }
    }

}
