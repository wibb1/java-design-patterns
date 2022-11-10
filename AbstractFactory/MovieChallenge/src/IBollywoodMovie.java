public interface IBollywoodMovie {
    String getMovieName();
    String getSource();
}

class BollywoodComedyMovie implements IBollywoodMovie {
    private String genre;
    private String source;
    private String movieName;

    BollywoodComedyMovie() {
        this.movieName = "BollywoodComedyMovie";
        this.genre = "Comedy";
        this.source = "Bollywood";
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

class BollywoodActionMovie implements IBollywoodMovie {
    private String genre;
    private String source;
    private String movieName;

    BollywoodActionMovie() {
        this.movieName = "BollywoodActionMovie";
        this.genre = "Action";
        this.source = "Bollywood";
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
