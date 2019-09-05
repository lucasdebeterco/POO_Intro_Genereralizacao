package Item;

public class Livro extends Item {
    private String autor;

    public Livro (int codigo, String descricao, String autor){
        super(codigo, descricao);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", Autor: " + autor);
        return sb.toString();
    }
}

