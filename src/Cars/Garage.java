package Cars;

public class Garage {

    // vehicle array
    // private class specific
    private Vehicle[] vehicles;

    public Vehicle[] getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }

    public void alarmCascade(){
        for(Vehicle vehicle: vehicles){
            vehicle.alarm();
        }
    }

}
