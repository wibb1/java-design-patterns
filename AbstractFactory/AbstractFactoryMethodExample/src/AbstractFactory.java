public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}

class ShapeFactory extends AbstractFactory {

    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String type) {
        if (type==null) return null;
        else if (type.equalsIgnoreCase("Circle")) return new Circle();
        else if (type.equalsIgnoreCase("Square")) return new Square();
        else if (type.equalsIgnoreCase("Rectangle")) return new Rectangle();
        else return null;
    }
}

class ColorFactory extends AbstractFactory {

    @Override
    Color getColor(String color) {
        if (color==null) return null;
        else if (color.equalsIgnoreCase("Red")) return new Red();
        else if (color.equalsIgnoreCase("Green")) return new Green();
        else if (color.equalsIgnoreCase("Blue")) return new Blue();
        else return null;
    }

    @Override
    Shape getShape(String type) {
        return null;
    }
}
