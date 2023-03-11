import java.util.ArrayList;
import java.util.Collections;

public class MusicPlaylist extends Playlist {
    ArrayList<Music> musics;


    public ArrayList<Music> getMusics() {
        return musics;
    }

    public void setMusics(ArrayList<Music> musics) {
        this.musics = musics;
    }
    public void random_music(){
        Collections.shuffle(musics);
    }

    public Music get_atual(){
        return musics.get(this.media_atual);

    }
    public Music next_music(){
        if (this.media_atual >= musics.size()) {
            media_atual = -1;
        }
        this.media_atual++;
        return musics.get(this.media_atual);
    }
    public Music preview_music(){
        if (this.media_atual <= 0){
            media_atual = musics.size();
        }
        this.media_atual--;
        return musics.get(this.media_atual);
    }
}
