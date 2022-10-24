import rpg.Monster;

import java.util.ArrayList;

public class CollectionsLecture {

    public static void main(String[] args) {
        ArrayList<Monster> monsterArrayList = new ArrayList<>();
        Monster orc = new Monster(13,15,9,"Orc");
        monsterArrayList.add(orc);
        System.out.println(monsterArrayList.size());
        System.out.println(monsterArrayList.get(0).getName());
    }
}
