public class Media {
    String title;
    int year;
    String genre;

    public Media(String title, int year, String genre) {
        this.title = title;
        this.year = year;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMusical_genre() {
        return genre;
    }

    public void setMusical_genre(String genre) {
        this.genre = genre;
    }
}

