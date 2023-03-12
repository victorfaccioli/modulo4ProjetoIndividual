public class Music extends Media {
    String  duration;
    String artist;
    StarRate note;


    public Music(String title, int year, String genre, String duration, String artist, StarRate note) {
        super(title, year, genre);
        this.duration = duration;
        this.artist = artist;
        this.note = note;
    }


    public String get_duration_music() {
        return duration;
    }

    public void set_duration_music(String duration) {
        this.duration = duration;
    }

    public String get_artist() {
        return artist;
    }

    public void set_artist(String artist) {
        this.artist = artist;
    }

    public StarRate get_note() {
        return note;
    }

    public void set_note(StarRate note) {
        this.note = note;
    }
}
