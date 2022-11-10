public class Client {
    public static void main(String[] args) {
        AbstractFactory actionMovies = FactoryProducer.getFactory("Action");
        AbstractFactory comedyMovies = FactoryProducer.getFactory("Comedy");

        IHollywoodMovie hAction = actionMovies.getHollywoodMovie();
        IBollywoodMovie bAction = actionMovies.getBollywoodMovie();

        IHollywoodMovie hComedy = comedyMovies.getHollywoodMovie();
        IBollywoodMovie bComedy = comedyMovies.getBollywoodMovie();

        System.out.println(
                bAction.getMovieName() + "\n" +
                bComedy.getMovieName() + "\n" +
                hAction.getMovieName() + "\n" +
                hComedy.getMovieName() + "\n"
        );


    }
}
