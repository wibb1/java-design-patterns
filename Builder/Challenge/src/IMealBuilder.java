public interface IMealBuilder {
    void buildBurger();

    void buildDrink();

    Meal getMeal();
}

class VegMealAndCokeBuilder implements IMealBuilder {

    private final Meal vegMeal = new Meal();

    @Override
    public void buildBurger() {
        vegMeal.addItem(new VegBurger());
    }

    @Override
    public void buildDrink() {
        vegMeal.addItem(new Coke());
    }

    @Override
    public Meal getMeal() {
        return vegMeal;
    }
}

class VegMealAndPepsiBuilder implements IMealBuilder {

    private final Meal vegMeal = new Meal();

    @Override
    public void buildBurger() {
        vegMeal.addItem(new VegBurger());
    }

    @Override
    public void buildDrink() {
        vegMeal.addItem(new Pepsi());
    }

    @Override
    public Meal getMeal() {
        return vegMeal;
    }
}

class ChickMealAndCokeBuilder implements IMealBuilder {

    private final Meal chickMeal = new Meal();

    @Override
    public void buildBurger() {
        chickMeal.addItem(new ChickBurger());
    }

    @Override
    public void buildDrink() {
        chickMeal.addItem(new Coke());
    }

    @Override
    public Meal getMeal() {
        return chickMeal;
    }
}

class ChickMealAndPepsiBuilder implements IMealBuilder {

    private final Meal chickMeal = new Meal();

    @Override
    public void buildBurger() {
        chickMeal.addItem(new ChickBurger());
    }

    @Override
    public void buildDrink() {
        chickMeal.addItem(new Pepsi());
    }

    @Override
    public Meal getMeal() {
        return chickMeal;
    }
}
