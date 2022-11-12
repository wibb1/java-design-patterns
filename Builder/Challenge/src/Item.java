public interface Item {
    String name();
    Packing packing();
    float price();
}

abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new BurgerWrapper();
    }

    @Override
    public abstract float price();
}

class VegBurger extends Burger {
    @Override
    public float price() {
        return 5;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}

class ChickBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 5;
    }
}

abstract class Drink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}

class Pepsi extends Drink {

    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 1.5f;
    }
}

class Coke extends Drink {

    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 1.5f;
    }
}

interface Packing {
    String pack();
}

class BurgerWrapper implements Packing{

    @Override
    public String pack() {
        return "You Wrapped the burger";
    }
}

class Bottle implements Packing {

    @Override
    public String pack() {
        return "You bottled the Drink";
    }
}
