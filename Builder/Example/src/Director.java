public class Director {
    IVehicleBuilder myBuilder;

    public void construct(IVehicleBuilder builder) {
        myBuilder = builder;
        myBuilder.buildBody();
        myBuilder.attachWheels();
        myBuilder.installHeadlights();
    }
}
