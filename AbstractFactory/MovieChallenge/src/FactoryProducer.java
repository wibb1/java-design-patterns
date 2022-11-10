public class FactoryProducer {
    public static AbstractFactory getFactory(String genre) {
        if (genre.equalsIgnoreCase("comedy")) {
            return new ComedyMovieFactory();
        } else if (genre.equalsIgnoreCase("action")) {
            return new ActionMovieFactory();
        } else return null;
    }
}
