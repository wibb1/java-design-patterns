public class Client {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape1 = (Shape) ShapeCache.getShape("0");
        clonedShape1.draw();
        Shape clonedShape2 = (Shape) ShapeCache.getShape("1");
        clonedShape2.draw();
        Shape clonedShape3 = (Shape) ShapeCache.getShape("2");
        clonedShape3.draw();
    }
}
