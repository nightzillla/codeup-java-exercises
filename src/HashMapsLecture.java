import rpg.Monster;

import java.util.HashMap;

public class HashMapsLecture {
    public static void main(String[] args) {

        Monster orc = new Monster(13,15,9,"Orc");
        Monster ogre = new Monster(11,59,13,"Ogre");
        Monster blueDragon = new Monster(19,225,23,"Blue Dragon");
        Monster frostGiant = new Monster(15,138,25, "Frost Giant");
        Monster goblin = new Monster(15,7,5, "Goblin");
        Monster werewolf = new Monster(11,58,7,"Werewolf");
        Monster orcWarChief = new Monster(16,93,15,"Orc War Chief");

        // Create a new HashMap defining the key and value
        // data types between angle brackets
        HashMap<String, Monster> monsterHashMap = new HashMap<>();


        // Add a key-value pair to the hasmap using .put()
        monsterHashMap.put("orc", orc);
        // Access a value in the hashmap using .get() with the key
        System.out.println(monsterHashMap.get("orc"));
        System.out.println(monsterHashMap.get("orc").getHitPoints());

        // Replace a value in the hashmap using .replace()
        monsterHashMap.replace("orc", orcWarChief);
        System.out.println(monsterHashMap.get("orc"));
    }// end of main method
} // end of class
