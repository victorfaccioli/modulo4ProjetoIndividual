import java.util.ArrayList;
import java.util.Scanner;
//
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Playlist playlist_musica = new Playlist(new Midia[3]);

        Musico[] musico = new Musico[3];
        Musica[] musica = new Musica[3];


        musico[0] = new Musico("Billie Joe Armstrong", "17-02-1972", "Icon Award", "Masc", "Vocalista");
        musico[1] = new Musico("Chad Kroeger", "15-11-1974", "American Music Awards", "Masc", "Vocalista e Guitarista");
        musico[2] = new Musico("Amy Lee", "13-12-1981", "Performance Hard Rock", "Fem", "Vocalista");


        musica[0] = new Musica("Wake Me Up When September Ends", 2004, "Punk", 4, musico[0], 5);
        musica[1] = new Musica("How You Remind Me", 2013, "Rock", 4, musico[1], 5);
        musica[2] = new Musica("Bring Me To Life", 2003, "Rock", 4, musico[2], 5);

        playlist_musica.getMidias()[0]= musica[0];
        playlist_musica.getMidias()[1]= musica[1];
        playlist_musica.getMidias()[2]= musica[2];

        Playlist playlist_filme = new Playlist((new Midia[3]));
        Ator[] elenco = new Ator[3];
        Filme[] filme = new Filme[3];


        elenco[0] = new Ator("Terry Crews", "30-07-1968", "Oscar", "Masc", "Teatro");
        elenco[1] = new Ator("Michelle Ingrid", "09-09-1980", "Oscar", "Fem", "Cinema");
        elenco[2] = new Ator("Vin Diesel", "18-07-1967", "Oscar", "Masc", "Teatro");


        filme[0] = new Filme("As branquelas",2004,"Besteirol",109,elenco,"Keenen Ivory","Marlon Lamont");
        filme[1] = new Filme("Os Fabelmans", 2022, "Drama", 150, elenco, "Steven Spielberg", "Tony Krushner");
        filme[2] = new Filme("Velozes & Furiosos 9", 2021, "Ação", 143,elenco , "Justin Lin", "Neal H. Moritz");

        playlist_filme.getMidias()[0]= filme[0];
        playlist_filme.getMidias()[1]= filme[1];
        playlist_filme.getMidias()[2]= filme[2];



        System.out.printf("Escolha a opção que deseja: "+
                    "\nDigite 1 para Playlist Musicas!"+
                    "\nDigite 2 para PlayList Filmes!:");
                        int escolha= teclado.nextInt();

        if (escolha ==1){
            System.out.println(playlist_musica.getMidias()[0].getTitulo());
            System.out.println(playlist_musica.getMidias()[1].getTitulo());
            System.out.println(playlist_musica.getMidias()[2].getTitulo());
                System.out.println("Selecione 1 para tocar musicas ou selecione 0 para encerrar");
                    int escolha1 = teclado.nextInt();
                if (escolha1 ==1){
                    BibliotecaDeMidias biblioteca = new BibliotecaDeMidias("Victor",playlist_musica);
                    biblioteca.tocar_playlist(playlist_musica);
                }else{
                    return;
                }


        } else if (escolha ==2) {
            System.out.println(playlist_filme.getMidias()[0].getTitulo());
            System.out.println(playlist_filme.getMidias()[1].getTitulo());
            System.out.println(playlist_filme.getMidias()[2].getTitulo());
                System.out.println("Selecione 1 para tocar filme ou selecione 0 para encerrar");
                int escolha1 = teclado.nextInt();
                if (escolha1 ==1){
                    BibliotecaDeMidias biblioteca = new BibliotecaDeMidias("Victor",playlist_filme);
                    biblioteca.tocar_playlist(playlist_filme);
                }else{
                    return;
                }
        }else{
            System.out.println("Opção inválida!");
        }


    }
}