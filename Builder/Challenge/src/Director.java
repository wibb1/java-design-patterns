class Director {
    IMealBuilder myBuilder;
    public void construct(IMealBuilder builder){
        myBuilder = builder;
        myBuilder.buildBurger();
        myBuilder.buildDrink();
    }
}
