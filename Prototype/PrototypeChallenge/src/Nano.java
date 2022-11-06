public class Nano extends BasicCar {

    public Nano() {
        this.model = "Nano";
        this.price = 15000;
    }

    @Override
    public Nano clone() {
        Nano clone = null;
        clone = (Nano) super.clone();
        return clone;
    }

    @Override
    void drive() {
        System.out.println("You're driving down tne road in your " + this.getModel()
                + ". It only cost you $" + this.getPrice());
    }

}
