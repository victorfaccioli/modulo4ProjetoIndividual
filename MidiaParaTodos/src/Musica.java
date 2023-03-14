public class Musica extends Midia {
    private int duracao;
    private Artista artista;
    private int nota;

    public Musica(String titulo, int ano, String genero, int duracao, Musico artista, int nota) {
        super(titulo, ano, genero);
        this.duracao = duracao;
        this.artista = artista;
        this.nota = nota;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        if (nota > 0 && nota <= 5) {
            this.nota = nota;
        } else {
            System.out.println("Defina nota de 1 a 5:");
        }
    }
}

