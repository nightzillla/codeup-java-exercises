package AssessmentReview;

public class PetDogTest {
//    11. Create a PetDogTest class, instantiate a PetDog, and verify that the snuggle method works correctly.
public static void main(String[] args) {
    // this is instantiate a PetDog which instance
    PetDog Appa = new PetDog("Appa","French Bull Dog",true);
    System.out.println(Appa.getName() +" "+ Appa.getType() +" "+ Appa.isTrained());
    System.out.println(Appa.snuggle());
}
//    12. In your Practice class, create a static method named multiplyAll. It should accept an integer and an ArrayList of integers. It should take the ArrayList argument and multiply all its elements by the value of the integer argument.
//    12b. In your PetDog class, create a static method named allSnuggle. It should accept an ArrayList of PetDog objects and output the result of calling the snuggle method on all of them. Create an ArrayList with at least three PetDog instances in the PetDogTest class. Call the allSnuggle method and pass it the ArrayList. Verify that the allSnuggle method works correctly.
}
