public class Motorcycle implements IVehicleBuilder {
    private Vehicle vehicle = new Vehicle();
    @Override
    public void buildBody() {
        vehicle.add("This is a body of a motorcycle");
    }

    @Override
    public void attachWheels() {
        vehicle.add("2 wheels added");
    }

    @Override
    public void installHeadlights() {
        vehicle.add("1 headlight added");
    }

    @Override
    public Vehicle getVehicle() {
        return vehicle;
    }
}
