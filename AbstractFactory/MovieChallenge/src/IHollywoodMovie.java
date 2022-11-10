public interface IHollywoodMovie {
    String getMovieName();
    String getSource();
}

class HollywoodComedyMovie implements IHollywoodMovie {
    private String genre;
    private String source;
    private String movieName;

    HollywoodComedyMovie() {
        this.movieName = "HollywoodComedyMovie";
        this.genre = "Comedy";
        this.source = "Hollywood";
    }

    @Override
    public String getMovieName() {
        return this.movieName;
    }

    @Override
    public String getSource() {
        return this.source;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
}

class HollywoodActionMovie implements IHollywoodMovie {
    private String genre;
    private String source;
    private String movieName;

    HollywoodActionMovie() {
        this.movieName = "HollywoodActionMovie";
        this.genre = "Action";
        this.source = "Hollywood";
    }
    @Override
    public String getMovieName() {
        return movieName;
    }

    @Override
    public String getSource() {
        return source;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
}
