package AssessmentReview;

public class Pet {
    // 4. Create a class called Pet with two String instance variables, name and type.
    protected String name;
    protected String type;
    // 5. Create getters and setters for the properties as well as a constructor that takes two strings and sets the name and type.
    //GETTERS
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    //SETTERS
    public void setName(String name) {
        this.name = name;
    }
    public void setType(String type) {
        this.type = type;
    }
    public Pet(){};
    public Pet(String name, String type){
        this.name = name;
        this.type = type;
    }
}
