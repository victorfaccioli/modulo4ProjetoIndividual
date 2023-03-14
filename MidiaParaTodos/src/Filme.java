class Filme extends Midia {
    private int duracao;
    private String tipo;
    private Ator[] elenco;
    private String diretor;
    private String produtor;

    public Filme(String titulo, int ano, String genero, int duracao, Ator[] elenco, String diretor,
                 String produtor) {
        super(titulo, ano, genero);
        this.duracao = duracao;
        this.elenco = elenco;
        this.setTipo(duracao);
        this.diretor = diretor;
        this.produtor = produtor;
    }
    public double getDuracao() {
        return duracao;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(int duracao) {
        if (duracao > 90) {
            this.tipo = "Longa";
        } else {
            this.tipo = "Curta";
        }
    }

    public Ator[] getElenco() {
        return elenco;
    }

    public void setElenco(Ator[] elenco) {
        this.elenco = elenco;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getProdutor() {
        return produtor;
    }

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }
}