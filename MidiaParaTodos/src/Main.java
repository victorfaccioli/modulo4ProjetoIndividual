import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Artist artist= new Artist("Victor","30-11-1997", new Awards("Gremmy",2022),"masculino");

        Film filme= new Film("Avatar",2022, "Ficição",30, new String[]{"alo","jose"},"Jorge","Cleber");

        Music musica = new Music("Leozinho",2020,"Rock","3","Leo",new StarRate(5));
        Music musica2 = new Music("Feh",2020,"Rock","3","feh",new StarRate(5));
        Music musica3= new Music("Victor",2020,"Mandelão","3","Vitor",new StarRate(5));
        MusicPlaylist playlist = new MusicPlaylist();
        ArrayList<Music> midias = new ArrayList<>();
        midias.add(musica);
        midias.add(musica2);
        midias.add(musica3);


        playlist.set_musics(midias);
//        playlist.random_music();


        System.out.printf("Artista: "+artist.get_name()+"\nData de nascimento: "
                + artist.get_date_of_birth()
                +"\nGênero: "+artist.get_gender()
                +"\nPrêmio: "+artist.get_awards().get_award()+" Ano: "+artist.get_awards().get_year());
//        System.out.println(playlist.get_current_media());
//        System.out.println(playlist.next_music().title);
//        System.out.println("musica.getMidia().getStar()");

    }
}