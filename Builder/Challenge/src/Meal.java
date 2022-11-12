import java.util.ArrayList;
import java.util.List;

public class Meal {
    private final List<Item> items;
    private float cost;

    public Meal() {
        items = new ArrayList<>();
        cost = 0f;
    }

    public void addItem(Item item) {
        items.add(item);
        cost += item.price();
    }

    public float getCost() {
        return cost;
    }

    public void show() {
        items.forEach(item -> System.out.println(
                "Item: " + item.name() + "\n" +
                "Packing: " + item.packing().pack() + "\n" +
                "Price: " + item.price() + "\n"
        ));
    }
}
