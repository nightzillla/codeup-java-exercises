package AssessmentReview;

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
    // 10. Create an interface named Companion. The Companion interface should specify an instance method named snuggle that has no arguments and returns a String. Change your PetDog class so it implements the Companion interface. The implementation of the snuggle method on the PetDog class should return "name wants to snuggle", where name is the inherited instance property.
}
