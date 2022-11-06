public class Client {
    public static void main(String[] args) {
        BasicCarCache.loadCache();

        BasicCar clonedCar1 = BasicCarCache.getBasicCar(0);
        clonedCar1.drive();

        BasicCar clonedCar2 = BasicCarCache.getBasicCar(1);
        clonedCar2.drive();


    }
}
