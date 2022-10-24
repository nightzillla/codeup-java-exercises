import rpg.Monster;

import java.util.HashMap;
import java.util.Map;

import static java.util.Map.entry;

public class HashMapsLecture {
    public static void main(String[] args) {
        // HashMap is a data structure

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


        // Add a key-value pair to the hashmap using .put()
        monsterHashMap.put("orc", orc);
        // Access a value in the hashmap using .get() with the key
//        System.out.println(monsterHashMap.get("orc"));
//        System.out.println(monsterHashMap.get("orc").getHitPoints());

        // Replace a value in the hashmap using .replace()
        monsterHashMap.replace("orc", orcWarChief);
        System.out.println(monsterHashMap.get("orc"));

        // To add multiple object to a hashmap at once
        // use Map.ofEntries
        Map <String, Monster> intermediateMap = Map.ofEntries(
                entry("blue dragon", blueDragon),
                entry("oger", ogre),
                entry("werewolf", werewolf),
                entry("frost giant", frostGiant),
                entry("goblin", goblin),
                entry("orc war chief", orcWarChief)
        );
        monsterHashMap.putAll(intermediateMap);
        System.out.println(monsterHashMap.get(frostGiant));

        // Looping over HashMaps. Technique 1:
        // use .entrySet to derive a Set of entries
        // Each entry is represented as a Map.Entry<DataTypeOfKey, DataTypeOfValue

        for(Map.Entry<String, Monster > monsterEntry : monsterHashMap.entrySet()){
            Monster monster = monsterEntry.getValue();
            System.out.printf("The %s has %d hit points, an armo class of %d, and does %d damage.%n", monster,monster.getHitPoints(),monster.getArmorClass(),monster.getDamage());
        }
    }// end of main method
} // end of class
