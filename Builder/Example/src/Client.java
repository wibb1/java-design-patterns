public class Client {
    public static void main(String[] args) {
        System.out.println("Builder Pattern Demo");
        Director director = new Director();

        IVehicleBuilder carBuilder = new Car();
        IVehicleBuilder motorcycleBuilder = new Motorcycle();

        director.construct(carBuilder);
        Vehicle p1 = carBuilder.getVehicle();
        p1.show();

        director.construct(motorcycleBuilder);
        Vehicle p2 = motorcycleBuilder.getVehicle();
        p2.show();
    }
}
