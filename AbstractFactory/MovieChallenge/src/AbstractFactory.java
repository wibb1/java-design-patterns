public abstract class AbstractFactory {
    abstract IBollywoodMovie getBollywoodMovie();
    abstract IHollywoodMovie getHollywoodMovie();
}

class ActionMovieFactory extends AbstractFactory {

    @Override
    IBollywoodMovie getBollywoodMovie() {
        return new BollywoodActionMovie();
    }

    @Override
    IHollywoodMovie getHollywoodMovie() {
        return new HollywoodActionMovie();
    }
}

class ComedyMovieFactory extends AbstractFactory {

    @Override
    IBollywoodMovie getBollywoodMovie() {
        return new BollywoodComedyMovie();
    }

    @Override
    IHollywoodMovie getHollywoodMovie() {
        return new HollywoodComedyMovie();
    }
}
