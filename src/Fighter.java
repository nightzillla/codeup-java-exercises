public class Fighter {
    // purple properties / or variable
    public String name;
    public int hitPoints;
    public int maxDamage;
    // Instance methods
    // Yellow are methods or function of the class
    public void printStats(){
        System.out.printf("%s has %d hit points and can do %d damage%n", name, hitPoints, maxDamage);
    }

    public void battleRoar() {
        System.out.printf("I am %s and I will destroy you %n", name);
    }


    // This is an instance = lowercase
    // public can be access anywhere
    public int attackRoll(){
        return D20.rolld20();
    }
    // DEFAULT Constructor
    // No-arg constructor
    public Fighter(){
//        this.name = "John";
//        this.hitPoints = 1;
    }
    // THIS IS A CONSTRUCTOR
    public Fighter(String name, int hitPoints, int maxDamage) {
        System.out.println("A new fighter has emerged!");
        this.name = name;
        this.hitPoints = hitPoints;
        this.maxDamage = maxDamage;
    }
}

