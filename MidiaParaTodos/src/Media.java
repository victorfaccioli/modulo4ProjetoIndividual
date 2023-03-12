public class Media {
    String title;
    int year;
    String genre;

    public Media(String title, int year, String genre) {
        this.title = title;
        this.year = year;
        this.genre = genre;
    }

    public String get_title() {
        return title;
    }

    public void set_title(String title) {
        this.title = title;
    }

    public int get_year() {
        return year;
    }

    public void set_year(int year) {
        this.year = year;
    }

    public String get_musical_genre() {
        return genre;
    }

    public void set_musical_genre(String genre) {
        this.genre = genre;
    }
}

