package Item;

public class Vhs extends Midia {
    private String titulo;

    public Vhs(int codigo, String descricao, String gravadora, float duracao, String titulo){
        super(codigo, descricao, gravadora, duracao);
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", Título: ").append(titulo);
        return sb.toString();
    }
}
