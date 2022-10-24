import com.sun.security.jgss.GSSUtil;
import rpg.Monster;

import java.util.ArrayList;
import java.util.List;

public class CollectionsLecture {

    public static void main(String[] args) {
//              <dataType>
        ArrayList<Monster> monsterArrayList = new ArrayList<>();
        // this is the same as line 9
//        Monster[] monstersArray = new Monster[5];
        Monster orc = new Monster(13,15,9,"Orc");
        Monster ogre = new Monster(11,59,13,"Ogre");
        Monster blueDragon = new Monster(19,225,23,"Blue Dragon");
        Monster frostGiant = new Monster(15,138,25, "Frost Giant");
        Monster goblin = new Monster(15,7,5, "Goblin");
        Monster werewolf = new Monster(11,58,7,"Werewolf");
        // Add objects to an arrayList one at a time with. add();
        monsterArrayList.add(orc);
        // Get the size of the arrayList using .size()
        // Array use .length, arrayList use .size()
        System.out.println(monsterArrayList.size());
        // access teh elements of the arrayList using .get() with the index
        System.out.println(monsterArrayList.get(0).getName());
        // ArrayList have flexible size. You can keep adding to them
        // after they are created. Unlike arrays, which have fixed size.
        monsterArrayList.add(ogre);
        System.out.println(monsterArrayList.size());
        System.out.println(monsterArrayList.get(1).getArmorClass());
        System.out.println(monsterArrayList);
        // How to add multiple objects to an arrayList all at once
        List<Monster> newMonsterList = new ArrayList<>(List.of(goblin, blueDragon, frostGiant, werewolf));
        System.out.println(newMonsterList);
        System.out.println(newMonsterList.get(1).getHitPoints());
        // we can add all the elements of one arrayList into another arrayList
        // using the .addAll method
        // If I want to add a bunch of stuff
        monsterArrayList.addAll(new ArrayList<>(List.of(goblin, blueDragon, frostGiant, werewolf)));
        System.out.println(monsterArrayList);

        // Loop over arrayLists
        // traditional for loop
        // use this if you want to find certain index
        for (int i = 0; i < monsterArrayList.size(); i++){
            if( i == monsterArrayList.size()-1){
                System.out.printf("%s%n", monsterArrayList.get(i));
            } else {
            System.out.printf("%s%n",monsterArrayList.get(i));
        }

        // Enhanced for loop
        // Simpler syntax but no access to the index
        for (Monster monster :monsterArrayList){
            System.out.println(monster.getHitPoints());
        }
    }
}
