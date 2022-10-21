package Cars;

public class GarageTest {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Car dailyCommuter = new Car("Toyota Echo");
        Car truck = new Car("Tacoma");
        Car muscleCar = new Car("Challenger");
        Car luxuryVehicle = new Car("Lexus is500");
//        garageVehicles[0] = dailyCommuter;
//        garageVehicles[1] = truck;
//        garageVehicles[2] = muscleCar;
//        garageVehicles[3] = luxuryVehicle;
        // shorthand
        Vehicle[] garageVehicles = {dailyCommuter, truck, muscleCar, luxuryVehicle};
        garage.setVehicles(garageVehicles);
        garage.alarmCascade();
    }
}
