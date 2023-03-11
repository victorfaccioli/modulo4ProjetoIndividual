public class Film extends Media {

    int duration;
    String movie_type;
    String[] cast;
    String director;
    String producer;


    public Film(String title, int year, String genre, int duration, String[] cast, String director, String producer) {
        super(title, year, genre);
        this.duration = duration;
        this.cast = cast;
        this.director = director;
        this.producer = producer;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getMovie_type() {

        if(this.duration > 90){
            this.movie_type="Longa";
        }else{
            this.movie_type="Curta";
        }
        return movie_type;
    }

    public void setMovie_type(String movie_type) {
        this.movie_type= movie_type;
    }

    public String[] getCast() {
        return cast;
    }

    public void setCast(String[] cast) {
        this.cast = cast;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
