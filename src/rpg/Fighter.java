package rpg;

import rpg.D20;

public class Fighter {
    // Instnace
    // purple properties / or variable
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private int hitPoints;

    // This is a setter
    public void setHitPoints(int hitPoints){
        // if (hitPoints  > 0) {... set hitpoints}
        this.hitPoints = hitPoints;
    }
    // getter -- set to public
    public int getHitPoints() {
        return hitPoints;
    }
    private int maxDamage;
    public int getMaxDamage() {
        return maxDamage;
    }

    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }
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

