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

    public int get_duration_film() {
        return duration;
    }

    public void set_duration_film(int duration) {
        this.duration = duration;
    }

    public String get_movie_type() {

        if(this.duration > 90){
            this.movie_type="Longa";
        }else{
            this.movie_type="Curta";
        }
        return movie_type;
    }

    public void set_movie_type(String movie_type) {
        this.movie_type= movie_type;
    }

    public String[] get_cast() {
        return cast;
    }

    public void set_cast(String[] cast) {
        this.cast = cast;
    }

    public String get_director() {
        return director;
    }

    public void set_director(String director) {
        this.director = director;
    }

    public String get_producer() {
        return producer;
    }

    public void set_producer(String producer) {
        this.producer = producer;
    }
}
