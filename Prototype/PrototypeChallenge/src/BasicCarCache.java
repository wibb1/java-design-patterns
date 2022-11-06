import java.util.Hashtable;

public class BasicCarCache {
    private static Hashtable<Integer, BasicCar> carMap = new Hashtable<>();

    public static BasicCar getBasicCar(int index) {
        BasicCar cachedCar = carMap.get(index);
        return (BasicCar) cachedCar.clone();
    }

    public static void loadCache() {
        addCar(new Nano());
        addCar(new Ford());
    }

    public static void addCar(BasicCar car) {
        int currentSize = carMap.size();
        car.setId(currentSize);
        carMap.put(car.getId(), car);
    }
}
