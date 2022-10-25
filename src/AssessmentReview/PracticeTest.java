package AssessmentReview;

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
    }
}
