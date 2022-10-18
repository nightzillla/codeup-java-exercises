// A class represents an object

public class YayGettersNSetters {

    // Attributes with variables
    String name;
    int age;

    public static void main(String[] args) {

        YayGettersNSetters a = new YayGettersNSetters();
        a.sayHappyBirthday("Alex");
        System.out.println();

    }
    // Things it can do means methods
    public static void sayHappyBirthday(String name) {
        System.out.println("Happy birthday " + name);
    }
}
