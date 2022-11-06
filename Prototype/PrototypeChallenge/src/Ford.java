class Ford extends BasicCar {

    public Ford() {
        this.model = "Ford";
        this.price = 25000;
    }

    @Override
    public Ford clone() {
        Ford clone = null;
        clone = (Ford) super.clone();
        return clone;
    }

    @Override
    void drive() {
        System.out.println("You're driving down tne road in your " + this.getModel()
                + ". It only cost you $" + this.getPrice());
    }
}
