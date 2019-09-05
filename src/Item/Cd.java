package Item;

public class Cd extends Midia {
    private int faixas;
    private String artista;
    private String album;

    public Cd (int codigo, String descricao, String gravadora, float duracao, int faixas, String artista, String album) {
        super(codigo, descricao,gravadora , duracao);
        this.faixas = faixas;
        this.artista = artista;
        this.album = album;
    }

    public int getFaixas() {
        return faixas;
    }

    public String getArtista() {
        return artista;
    }

    public String getAlbum() {
        return album;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", Faixas: ").append(faixas);
        sb.append(", Artista: ").append(artista);
        sb.append(", Album: ").append(album);
        return sb.toString();
    }
}

