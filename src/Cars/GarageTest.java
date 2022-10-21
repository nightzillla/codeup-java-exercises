package Cars;

public class GarageTest {
    public static void main(String[] args) {
        Garage garage = new Garage();
        garage.setVehicles(new Vehicle[4]);
        Car dailyCommuter = new Car("Toyota Echo");
        Car truck = new Car("Tacoma");
        Car muscleCar = new Car("Challenger");
        Car luxuryVehicle = new Car("Lexus is500");
        garage.getVehicles()[0] = dailyCommuter;
        System.out.println();

    }
}
