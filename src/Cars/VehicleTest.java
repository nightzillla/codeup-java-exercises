package Cars;

import Animals.Bird;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle honda = new Vehicle();
        honda.setName("Dr. Honda");
        System.out.println(honda.getName() + " goes ");
        honda.makeNoise();
        Honda s2000 = new Honda();
        s2000.makeNoise();
        Bird bird = new Bird();

    }
}
