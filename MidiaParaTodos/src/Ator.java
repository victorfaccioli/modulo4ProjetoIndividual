public class Ator extends Artista {
    private String formacao;

    public Ator(String nome, String data_de_nascimento, String premiacao, String genero, String formacao) {
        super(nome, data_de_nascimento, premiacao, genero);
        this.formacao = formacao;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
}
