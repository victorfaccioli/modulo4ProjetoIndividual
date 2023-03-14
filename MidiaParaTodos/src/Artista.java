public class Artista {
    private String nome;
    private String data_de_nascimento;
    private String premiacao;
    private String genero;

    public Artista(String nome, String data_de_nascimento, String premiacao, String genero) {
        this.nome = nome;
        this.data_de_nascimento = data_de_nascimento;
        this.premiacao = premiacao;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData_de_nascimento() {
        return data_de_nascimento;
    }

    public void setData_de_nascimento(String data_de_nascimento) {
        this.data_de_nascimento = data_de_nascimento;
    }

    public String getPremiacao() {
        return premiacao;
    }

    public void setPremiacao(String premiacao) {
        this.premiacao = premiacao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
