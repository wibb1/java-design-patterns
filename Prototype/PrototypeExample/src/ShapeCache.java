import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache() {
        addShape(new Circle());

        addShape(new Square());

        addShape(new Rectangle());
    }

    public static void addShape(Shape shape) {
        String currentSize = String.valueOf(shapeMap.size());
        shape.setId(currentSize);
        shapeMap.put(Shape.getId(),shape);
    }
}
