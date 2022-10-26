package AssessmentReview;

import java.util.ArrayList;

public class PracticeTest {

    public static void main(String[] args) {
        // Only do this if its not static
//      Practice input = new Practice();
        double[] array = {50,100,3,4,5};
        System.out.println(Practice.subtractTen(50));
        System.out.println(Practice.average(array));
        PetDog Appa = new PetDog("Appa","French Bull Dog",true);
        System.out.println(Appa.getName() +" "+ Appa.getType() +" "+ Appa.isTrained());
        System.out.println(Appa.snuggle());
        ArrayList<Integer>test = new ArrayList<>();
        test.add(60); // 60 * 5 = 300 | test = [300, 200, 100]
        test.add(40); // 40 * 5 = 200
        test.add(20); // 20 * 5 = 100
        System.out.println(Practice.multiplyAll(5, test));
    }
}
