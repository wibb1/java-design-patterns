public class Client {
    public static void main(String[] args) {
        System.out.println("Meals: ");
        Director director = new Director();

        IMealBuilder vegAndCokeBuilder = new VegMealAndCokeBuilder();
        IMealBuilder vegAndPepsiBuilder = new VegMealAndPepsiBuilder();
        IMealBuilder chickAndCokeBuilder = new ChickMealAndCokeBuilder();
        IMealBuilder chickAndPepsiBuilder = new ChickMealAndPepsiBuilder();

        director.construct(vegAndCokeBuilder);
        Meal vegAndCokeMeal = vegAndCokeBuilder.getMeal();
        vegAndCokeMeal.show();

        director.construct(vegAndPepsiBuilder);
        Meal vegAndPepsiMeal = vegAndPepsiBuilder.getMeal();
        vegAndPepsiMeal.show();

        director.construct(chickAndCokeBuilder);
        Meal chickAndCokeMeal = chickAndCokeBuilder.getMeal();
        chickAndCokeMeal.show();

        director.construct(chickAndPepsiBuilder);
        Meal chickAndPepsiMeal = chickAndPepsiBuilder.getMeal();
        chickAndPepsiMeal.show();
    }
}
