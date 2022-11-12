import java.util.LinkedList;

public class Vehicle {
    private LinkedList<String> parts;

    public Vehicle() {
        parts = new LinkedList<>();
    }

    public void add (String part) {
        parts.addLast(part);
    }

    public void show() {
        System.out.println("\nVehicle completed as below");
        parts.forEach(part -> System.out.println(part));
    }
}
