import java.util.Arrays;
import java.util.Collections;

public class Playlist {

    private Midia[] midias;
    private String ordem_execucao;
    private int midia_atual;

    public Playlist(Midia[] midias) {
        this.midias = midias;
    }

    public Midia[] getMidias() {
        return this.midias;
    }

    public void setMidias(Midia[] midias) {
        this.midias = midias;
    }

    public String getOrdem_execucao() {
        return ordem_execucao;
    }

    public void setOrdem_execucao(String ordem_execucao) {
        this.ordem_execucao = ordem_execucao;
    }

    public int getMidia_atual() {
        return midia_atual;
    }

    public void setMidia_atual(int midia_atual) {
        this.midia_atual = midia_atual;
    }

    public void midia_anterior(int i) {
        if (i - 1 < 0) {

            System.out.println("Tocando mídia: " + midias[midias.length - 1].getTitulo());
        } else {
            System.out.println("Tocando mídia: " + midias[i - 1].getTitulo());

        }
    }

    public void proxima_midia(int i) {
        if (i + 1 > midias.length) {
            System.out.println("Tocando mídia: " + midias[0].getTitulo());
        } else {
            System.out.println("Tocando mídia: " + midias[i + 1].getTitulo());
        }
    }

    public void midia_aleatoria() {
        System.out.println("Mídia Aleatória: ");
        Collections.shuffle(Arrays.asList(this.getMidias()));
    }

}
