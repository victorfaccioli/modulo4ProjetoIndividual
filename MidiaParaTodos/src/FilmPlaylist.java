import java.util.ArrayList;
import java.util.Collections;

public class FilmPlaylist extends Playlist {

    ArrayList<Music> films;

    public ArrayList<Music> get_films() {
            return films;
        }
        public void set_films(ArrayList<Music> musics) {
            this.films = musics;
        }
        public void random_music(){
            Collections.shuffle(films);
        }

        public Music get_current_films(){
            return films.get(this.current_media);

        }
        public Music next_films(){
            if (this.current_media >= films.size()) {
                current_media = -1;
            }
            this.current_media++;
            return films.get(this.current_media);
        }
        public Music preview_films(){
            if (this.current_media <= 0){
                current_media = films.size();
            }
            this.current_media--;
            return films.get(this.current_media);
        }
}

