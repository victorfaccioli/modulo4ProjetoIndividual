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


    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public StarRate getNote() {
        return note;
    }

    public void setNote(StarRate note) {
        this.note = note;
    }
}
