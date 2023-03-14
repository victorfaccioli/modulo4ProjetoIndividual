public class BibliotecaDeMidias {

    private Midia midias;
    private String usuario;
    private Playlist[] playlists;

    public BibliotecaDeMidias(String usuario, Playlist... playlists) {
        this.usuario = usuario;
        this.playlists = playlists;
    }

    public Midia getMidias() {
        return midias;
    }

    public void setMidias(Midia midias) {
        this.midias = midias;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Playlist[] getPlaylists() {
        return playlists;
    }

    public void setPlaylists(Playlist[] playlists) {
        this.playlists = playlists;
    }
    public void tocar_playlist(Playlist playlist ){
        System.out.println("Tocando midia" + playlist.getMidias()[0].getTitulo());

    }

}