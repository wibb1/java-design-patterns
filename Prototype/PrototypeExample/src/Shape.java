abstract class Shape implements Cloneable {
    public static String id;
    protected String type;

    abstract void draw();

    public static String getId() {
        return id;
    }

    public void setId(String id) {
        Shape.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}
