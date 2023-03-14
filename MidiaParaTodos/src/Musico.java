public class Musico extends Artista {
    private String atuacao;

    public Musico(String nome, String data_de_nascimento, String premiacao, String genero, String atuacao) {
        super(nome, data_de_nascimento, premiacao, genero);
        this.atuacao = atuacao;
    }

    public String getAtuacao() {
        return atuacao;
    }

    public void setAtuacao(String atuacao) {
        this.atuacao = atuacao;
    }



}
