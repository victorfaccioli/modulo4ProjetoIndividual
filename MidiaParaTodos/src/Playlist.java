import java.util.ArrayList;

public class Playlist {
    int current_media = 0;
    int media_direction;

    public int get_current_media() {
        return current_media;
    }

    public void set_current_media(int current_media) {
        this.current_media = current_media;
    }

    public int get_media_direction() {
        return media_direction;
    }

    public void set_media_direction(int media_direction) {
        this.media_direction = media_direction;
    }
}
