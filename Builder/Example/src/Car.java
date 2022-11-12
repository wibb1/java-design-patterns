public class Car implements IVehicleBuilder {
    private Vehicle vehicle = new Vehicle();
    @Override
    public void buildBody() {
        vehicle.add("This is a body of a car");
    }

    @Override
    public void attachWheels() {
        vehicle.add("4 wheels added");
    }

    @Override
    public void installHeadlights() {
        vehicle.add("2 headlights added");
    }

    @Override
    public Vehicle getVehicle() {
        return vehicle;
    }
}
