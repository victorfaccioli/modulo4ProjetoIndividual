import java.util.ArrayList;
import java.util.Collections;

public class MusicPlaylist extends Playlist {
    ArrayList<Music> musics;


    public ArrayList<Music> get_musics() {
        return musics;
    }

    public void set_musics(ArrayList<Music> musics) {
        this.musics = musics;
    }
    public void random_music(){
        Collections.shuffle(musics);
    }

    public Music next_music(){
        if (this.current_media >= musics.size()) {
            current_media = -1;
        }
        this.current_media++;
        return musics.get(this.current_media);
    }
    public Music previous_music(){
        if (this.current_media <= 0){
            current_media = musics.size();
        }
        this.current_media--;
        return musics.get(this.current_media);
    }
}
