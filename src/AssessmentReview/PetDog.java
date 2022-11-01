package AssessmentReview;

import java.util.ArrayList;

public class PetDog extends Pet implements Companion{
    // 6. Create a PetDog class that inherits from Pet.
    // 7. In PetDog, create a boolean instance variable, trained.
    public boolean trained;
    // 8. Write a constructor for PetDog that sets its name, type, and trained properties.
    // Default constructor
    public PetDog(){};
    // Custom constructor
    public PetDog(String name, String type, boolean trained){
        // super is use when it extends Pet
        super(name,type);
        this.trained = trained;
    }
    // 9. Write an instance method in PetDog called isTrained that returns the boolean value of the trained property.
    public boolean isTrained(){
        return trained;
    }
    @Override
    public String snuggle() {
        return name + " wants to snuggle";
    }

    // 12b. In your PetDog class, create a static method named allSnuggle. It should accept an ArrayList of PetDog objects and output the result of calling the snuggle method on all of them. Create an ArrayList with at least three PetDog instances in the PetDogTest class. Call the allSnuggle method and pass it the ArrayList. Verify that the allSnuggle method works correctly.
//    public static void allSnuggle(ArrayList<PetDog> petDogs){
//        for (PetDog petDog : new petDog )
//    }

}
