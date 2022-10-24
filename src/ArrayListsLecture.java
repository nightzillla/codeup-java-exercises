import rpg.Monster;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListsLecture {

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
        for (int i = 0; i < monsterArrayList.size(); i++) {
            if (i == monsterArrayList.size() - 1) {
                System.out.printf("%s%n", monsterArrayList.get(i));
            } else {
                System.out.printf("%s%n", monsterArrayList.get(i));
            }
        }

        // Enhanced for loop
        // Simpler syntax but no access to the index
        for (Monster monster :monsterArrayList){
            System.out.println(monster.getHitPoints());
        }
        // When creating an ArrayList of primitive data types, use the corresponding Object wrapper. ArrayList can only contain objects.
        ArrayList<Integer> myNumbers = new ArrayList<>(List.of(1,89,34, -67, 98,23));
        System.out.println(myNumbers);
        Collections.sort(myNumbers);

        System.out.println(myNumbers);
        // We can use Collections.sort to sort arrayLists that contain numbers or strings
        // They will be sorted in ascending "natural" order
        ArrayList<String> randomWords = new ArrayList<>(List.of("version", "suntan", "bond", "defeat", "later","rate"));
        System.out.println(randomWords);
        Collections.sort(randomWords);

        // In addition, the List interface contains a default method called .sort(),
        // So you can call .sort on any ArrayList. It takes a comparator as its argument
        // You can pass it Collections.reverseOrder() to sort an arraylist of strings
        // or numbers in reverse order
        randomWords.sort(Collections.reverseOrder());
        System.out.println(randomWords);
        System.out.println(monsterArrayList);

        // If you want to compare custom objects rather than numbers or strings,
        // A simple method is to call .sort() on the list and pass it
        // Comparator.comparing(NameOfObject::getterForWhatYouWantToCompare)
        // so to compare monsters by hit points, I use Monster::getHitPoints
        // :: is a ref to a method
        // Comparator
        monsterArrayList.sort(Comparator.comparing(Monster::getHitPoints));
        System.out.println(monsterArrayList);

        // To use the compare() method that we wrote in the Monster class, we use
        // the sort method and pass it a no-arg constructor




    } // end of main method
} // end of collectionLecture
