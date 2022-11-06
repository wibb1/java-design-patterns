abstract class BasicCar implements Cloneable {
    public Integer id;
    public String model;
    protected double price = 0.0;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    abstract void drive();

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
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
