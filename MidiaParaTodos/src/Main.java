import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Film filme= new Film("Avatar",2022, "Ficição",30, new String[]{"alo","jose"},"Jorge","Cleber");

        Music musica = new Music("Leozinho",2020,"Rock","3","Leo",new StarRate(5));
        Music musica2 = new Music("Feh",2020,"Rock","3","feh",new StarRate(5));
        Music musica3= new Music("Victor",2020,"Mandelão","3","Vitor",new StarRate(5));
        MusicPlaylist playlist = new MusicPlaylist();
        ArrayList<Music> midias = new ArrayList<>();
        midias.add(musica);
        midias.add(musica2);
        midias.add(musica3);
        playlist.setMusics(midias);
        playlist.random_music();

        System.out.printf(filme.getCast()[0]+filme.getCast()[1]+"\n");

        System.out.println(filme.getMovie_type());
        System.out.println(playlist.get_atual().title);
        System.out.println(playlist.next_music().title);
        System.out.println("musica.getMidia().getStar()");

    }
}